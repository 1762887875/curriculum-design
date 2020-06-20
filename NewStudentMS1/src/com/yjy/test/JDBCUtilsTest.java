package com.yjy.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Test;

import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;
import com.yjy.dao.imp.ManagerDao_Imp;
import com.yjy.jdbc.JDBCUtils;

public class JDBCUtilsTest {
/*
	@Test
	public void jdbcConnectionTest() throws Exception {
		Connection conn=JDBCUtils.getconnection();
	    Statement statement=conn.createStatement();
		ResultSet result=statement.executeQuery("SELECT * FROM student");
		
		while(result.next()) {
			System.out.println(result.getString("ID"));
		}
	}
	
	//���Ե�¼
	@Test
	public void loginTest() throws Exception {
		
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Manager manager=new Manager(1024,"roo");
		int id=managerDao_Imp.login(manager);
		System.out.println(id);
	}
	
	//���Բ���
	@Test
	public void insertTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030137,"��С��","��",21,"19862125537","�������ѧ�뼼��ѧԺ","�ƿ�1801��","ɽ��̩��","123456");
		boolean flag=managerDao_Imp.insertStudent(student);
		System.out.println("���ȥඣ�"+flag);
		
	}
	
	//����ɾ��
	@Test
	public void deleteTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030137,"��С��","��",21,"19862125537","�������ѧ�뼼��ѧԺ","�ƿ�1801��","ɽ��̩��","123456");
		boolean flag=managerDao_Imp.deleteStudent(student.getId());
		System.out.println(flag);
		
	}
	
	//�����޸�
	@Test
	public void updateTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030138,"��С��","��",21,"19862125538","�������ѧ�뼼��ѧԺ","�ƿ�1801��","ɽ������","123456");
		boolean flag=managerDao_Imp.updateStudent(student);
		System.out.println(flag);
		
	}
	
	//���Բ�ѯ
	@Test
	public void selectTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030138,"��С��","��",21,"19862125538","�������ѧ�뼼��ѧԺ","�ƿ�1801��","ɽ������","123456");
		Student student1=managerDao_Imp.selectStudent(student.getsname());
		System.out.println(student1);
	}
	
	//���Բ���
		@Test
		public void insertTeacherTest() throws Exception {
			ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
			Teacher teacher=new Teacher(980302,"����",48,"��ʦ",5,"123456");
			boolean flag=managerDao_Imp.insertTeacher(teacher);
			System.out.println("���ȥඣ�"+flag);
			
		} */
		//������ʾѧ��
		@Test
		public void showStudents() throws Exception {
			ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
			managerDao_Imp.showGrade();
			managerDao_Imp.showStudent();
			managerDao_Imp.showTeacher();
			managerDao_Imp.showCourse();
		}
}
