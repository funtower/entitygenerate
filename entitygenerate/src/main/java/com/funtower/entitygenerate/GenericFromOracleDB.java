package com.funtower.entitygenerate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.funtower.entitygenerate.constance.PubConstance;
import com.funtower.entitygenerate.entity.ColumnInfoFromDB;
import com.funtower.entitygenerate.service.Builder;

public class GenericFromOracleDB {

	public static void main(String[] args) throws Exception {

		// 1.注册驱动
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2.获取数据库连接对象 导包选择java.sql
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@110.80.17.26:52521:orcl", "jxyp", "jxyp");
		System.out.println(conn);
		// 3.创建sql语句执行对象
		Statement stat = conn.createStatement();
		String querySql = PubConstance.COLUMN_INFO_ORACLE_SQL;
		ResultSet rs = stat.executeQuery(querySql);
		List<ColumnInfoFromDB> columnInfoFromDBs = new ArrayList<ColumnInfoFromDB>();
		Set<String> dataTypes = new HashSet<String>();
		String tableName = "";
		while (rs.next()) {
			ColumnInfoFromDB columnInfoFromDB = new ColumnInfoFromDB();
			String columnName = rs.getString("column_name");
			String comments = rs.getString("comments");
			String dataType = rs.getString("data_type");
			tableName = rs.getString("table_name");
			Integer dataLength = rs.getInt("data_length");
			dataTypes.add(dataType);
			columnInfoFromDB.setColumnName(columnName);
			columnInfoFromDB.setComments(comments);
			columnInfoFromDB.setDatalength(dataLength);
			columnInfoFromDB.setTableName(tableName);
			columnInfoFromDB.setDataType(dataType);
			columnInfoFromDBs.add(columnInfoFromDB);
		}
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("obj.java"));
		Builder.packageStatement(bw);
		Builder.importClass(bw, dataTypes);
		Builder.buildClassBody(bw, tableName, columnInfoFromDBs);
		bw.close();
		conn.close();
		
	}

}
