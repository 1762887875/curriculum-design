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
	
	//测试登录
	@Test
	public void loginTest() throws Exception {
		
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Manager manager=new Manager(1024,"roo");
		int id=managerDao_Imp.login(manager);
		System.out.println(id);
	}
	
	//测试插入
	@Test
	public void insertTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030137,"孙小铭","男",21,"19862125537","计算机科学与技术学院","计科1801班","山东泰安","123456");
		boolean flag=managerDao_Imp.insertStudent(student);
		System.out.println("插进去喽！"+flag);
		
	}
	
	//测试删除
	@Test
	public void deleteTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030137,"孙小铭","男",21,"19862125537","计算机科学与技术学院","计科1801班","山东泰安","123456");
		boolean flag=managerDao_Imp.deleteStudent(student.getId());
		System.out.println(flag);
		
	}
	
	//测试修改
	@Test
	public void updateTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030138,"董小磊","男",21,"19862125538","计算机科学与技术学院","计科1801班","山东日照","123456");
		boolean flag=managerDao_Imp.updateStudent(student);
		System.out.println(flag);
		
	}
	
	//测试查询
	@Test
	public void selectTest() throws Exception {
		ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
		Student student=new Student(2018030138,"董小磊","男",21,"19862125538","计算机科学与技术学院","计科1801班","山东日照","123456");
		Student student1=managerDao_Imp.selectStudent(student.getsname());
		System.out.println(student1);
	}
	
	//测试插入
		@Test
		public void insertTeacherTest() throws Exception {
			ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
			Teacher teacher=new Teacher(980302,"王飞",48,"讲师",5,"123456");
			boolean flag=managerDao_Imp.insertTeacher(teacher);
			System.out.println("插进去喽！"+flag);
			
		} */
		//测试显示学生
		@Test
		public void showStudents() throws Exception {
			ManagerDao_Imp managerDao_Imp=new ManagerDao_Imp();
			managerDao_Imp.showGrade();
			managerDao_Imp.showStudent();
			managerDao_Imp.showTeacher();
			managerDao_Imp.showCourse();
		}
}
