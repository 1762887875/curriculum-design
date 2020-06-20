package com.yjy.dao;

import com.yjy.bean.Student;

public interface StudentDao {

	/**
	 * 登录实现
	 */
	String login(Student student);
	
	/**
	 * 查看个人信息
	 */
	Student selectStudent(int id);
	
	/**
	 * 修改个人信息
	 */
	boolean updateStudent(Student student);
	
	/**
	 * 查询成绩
	 */
	void selectCourse(int id);
}
