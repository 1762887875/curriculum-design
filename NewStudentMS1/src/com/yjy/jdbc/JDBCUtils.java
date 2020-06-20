package com.yjy.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtils {
	
	//����˽�б���
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	
	
	
	//��̬����
	static {
		//JDBCUtils.class������ö���getClassLoader()���������getResourceAsStream()������Դ�ļ�����������
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("db.properties");
		
		//����Properties���͵Ķ���
		Properties properties=new Properties();
		
		//�������ļ�
		try {
			properties.load(is);
			driver = properties.getProperty("driver");
			url = properties.getProperty("url");
			username = properties.getProperty("username");
			password = properties.getProperty("password");
			
			//����mysql����
			Class.forName(driver);
			System.out.println("�����������ɹ���");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	}
	
	
	//������Ӷ���ķ���
	public static Connection getconnection(){
		try {
			System.out.println("���ӳɹ���");
			return DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("����ʧ�ܣ�");
		return null;
	}
	
	//�ͷ����Ӷ���ķ���
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
