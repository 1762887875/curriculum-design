package com.yjy.dao;

import com.yjy.bean.Grade;
import com.yjy.bean.Teacher;

public interface TeacherDao {
	/**
	 * ��¼ʵ��
	 */
	String login(Teacher teacher);
	
	/**
	 * �鿴������Ϣ
	 */
	Teacher selectTeacher(int id);
	
	/**
	 * �޸ĸ�����Ϣ
	 */
	boolean updateTeacher(Teacher teacher);
	
	/**
	 * ��ѯѧ���ɼ�
	 */
	void selectCourse(int cno);
	
	/**
	 * �޸�ѧ���ɼ�
	 */
	boolean updateGrade(Grade grade);
	
	/**
	 * ���ѧ���ɼ�
	 */
	boolean insertGrade(Grade grade);
	
	/**
	 * ɾ��ѧ���ɼ�
	 */
	boolean deleteGrade(int sno,int cno);
	
	/**
	 * ��ѯѧ���ɼ��Ƿ����
	 * @param id
	 * @param cno
	 * @return
	 */
	Grade selectGrade(int id, int cno);
}
