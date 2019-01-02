package com.funtower.entitygenerate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class GenericFromMysqlDB {

	public static void main(String[] args) throws Exception{

		//1.注册驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2.获取数据库连接对象 导包选择java.sql
				Connection conn = 
						DriverManager.getConnection
						("jdbc:mysql://192.168.43.222/sell?characterEncoding=utf-8&useSSL=false", 
								"root", 
								"123456");
				System.out.println(conn);
				//3.创建sql语句执行对象
				Statement stat = conn.createStatement();
				//4.执行DDL
				boolean b = 
						stat.execute("select * from product_category");
				System.out.println(b);
				//在execute方法中可以执行任何sql语句但建议执行ddl
				//,如果执行失败会抛出异常
				//返回值如果是true 代表有结果集 false 没有结果集
	}

}
