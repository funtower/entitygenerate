package com.funtower.entitygenerate;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.funtower.entitygenerate.constance.PubConstance;
import com.funtower.entitygenerate.entity.ColumnInfoFromDB;
import com.funtower.entitygenerate.service.Builder;

public class GenericFromDataBase {

	private static final Logger log = LoggerFactory.getLogger(GenericFromDataBase.class);
	public static void main(String[] args) {
		
		Properties properties = new Properties();
		BufferedWriter bw = null;
		Connection conn = null;
		try {
			FileReader fr = new FileReader("E:/gitrepository/entitygenerate/src/main/resources/datasource_mysql.properties");
			properties.load(fr);
			fr.close();
			String driverType = properties.getProperty("driverType");
			String driverName = properties.getProperty("driverName");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			String tableName = properties.getProperty("tableName");
			
			// 1.注册驱动
//		Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName(driverName);
			// 2.获取数据库连接对象 导包选择java.sql
//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@110.80.17.26:52521:orcl", "jxyp", "jxyp");
			conn = DriverManager.getConnection(url, username, password);
			log.debug(conn.toString());
			// 3.创建sql语句执行对象
			Statement stat = conn.createStatement();
			String querySql = PubConstance.getSql(tableName,driverType);
			ResultSet rs = stat.executeQuery(querySql);
			List<ColumnInfoFromDB> columnInfoFromDBs = new ArrayList<ColumnInfoFromDB>();
			Set<String> dataTypes = new HashSet<String>();
			while (rs.next()) {
				ColumnInfoFromDB columnInfoFromDB = new ColumnInfoFromDB();
				String columnName = rs.getString("column_name");
				String comments = "oracle".equalsIgnoreCase(driverType) ? rs.getString("comments") : rs.getString("column_comment");
				String dataType = rs.getString("data_type");
				tableName = rs.getString("table_name");
				dataTypes.add(dataType);
				columnInfoFromDB.setColumnName(columnName);
				columnInfoFromDB.setComments(comments);
				columnInfoFromDB.setTableName(tableName);
				columnInfoFromDB.setDataType(dataType);
				columnInfoFromDBs.add(columnInfoFromDB);
			}
			bw = new BufferedWriter(new FileWriter("ProductCategory.java"));
			Builder.packageStatement(bw);
			Builder.importClass(bw, dataTypes);
			Builder.buildClassBody(bw, tableName, columnInfoFromDBs,driverType);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				conn.close();
			} catch (IOException | SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
