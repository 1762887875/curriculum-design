package com.yjy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		
		try {
			//加载Mysql驱动
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("驱动加载成功！");
			
			//连接数据库
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","password");
			System.out.println("数据库连接成功！");
			
			//创建执行环境
			Statement statement=conn.createStatement();
			
			//执行sql语句，得到结果集
			ResultSet result=statement.executeQuery("SELECT * FROM student");
			while(result.next()) {
				System.out.print(result.getString("Sno")+" ");
				System.out.print(result.getString("Sname")+" ");
				System.out.print(result.getString("Ssex")+" ");
				System.out.print(result.getInt("Sage")+" ");
				System.out.println(result.getString("Sdept")+" ");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
