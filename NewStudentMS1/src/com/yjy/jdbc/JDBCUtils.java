package com.yjy.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	
	//定义私有变量
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	
	
	
	//静态语句块
	static {
		//JDBCUtils.class用来获得对象，getClassLoader()类加载器，getResourceAsStream()加载资源文件并放在流中
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
		
		//创建Properties类型的对象
		Properties properties=new Properties();
		
		//加载流文件
		try {
			properties.load(is);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			//加载mysql驱动
			Class.forName(driver);
			System.out.println("驱动加载器成功！");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
	
	
	//获得连接对象的方法
	public static Connection getconnection(){
		try {
			System.out.println("连接成功！");
			return DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("连接失败！");
		return null;
	}
	
	//释放连接对象的方法
	public static void close(Connection conn,Statement statement,ResultSet result) {
		
			try {
				if(result!=null) {
				result.close();
				result=null;
				}
				
				if(statement!=null) {
					statement.close();
					statement=null;
					}
				
				if(conn!=null) {
					conn.close();
					conn=null;
					}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
}
