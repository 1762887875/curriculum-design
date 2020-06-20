package com.yjy.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
		
		try {
			//����Mysql����
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�������سɹ���");
			
			//�������ݿ�
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data?useUnicode=true&characterEncoding=utf-8&useSSL=false","root","password");
			System.out.println("���ݿ����ӳɹ���");
			
			//����ִ�л���
			Statement statement=conn.createStatement();
			
			//ִ��sql��䣬�õ������
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
