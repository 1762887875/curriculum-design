package com.yjy.dao;

import com.yjy.bean.Student;

public interface StudentDao {

	/**
	 * ��¼ʵ��
	 */
	String login(Student student);
	
	/**
	 * �鿴������Ϣ
	 */
	Student selectStudent(int id);
	
	/**
	 * �޸ĸ�����Ϣ
	 */
	boolean updateStudent(Student student);
	
	/**
	 * ��ѯ�ɼ�
	 */
	void selectCourse(int id);
}
