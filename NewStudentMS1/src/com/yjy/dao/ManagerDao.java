package com.yjy.dao;

import java.util.List;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Course;
import com.yjy.bean.Grade;
import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;



public interface ManagerDao {


	/** ��¼ʵ��
	 * @param name�˻� password����
	 * @return int���� -1��¼ʧ��  1��¼�ɹ�
	 */
	
	int login(Manager manager);	
	
	/**
	 * �޸�����
	 * �ɹ�����true��ʧ�ܷ���false
	 */
	boolean updateManager(Manager manager);
	
	/**���ѧ����Ϣ�ķ���
	 * Ҫ��ӵĶ��� ����������Ϣ
	 *��ӳɹ�����true,���ʧ�ܷ���false
	 */
	boolean insertStudent(Student student);
	
	/**ɾ��ѧ����Ϣ�ķ���
	 * Ҫɾ���Ķ��� �����˻�������
	 *ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
	 */
	boolean deleteStudent(int id);
	
	/**�޸�ѧ����Ϣ�ķ���
	 * Ҫ�޸ĵĶ��� �����˻�������
	 *�޸ĳɹ�����true,�޸�ʧ�ܷ���false
	 */
	boolean updateStudent(Student student);
	
	/**��ѯѧ����Ϣ�ķ���
	 * Ҫ��ѯ��ѧ���˺š�����
	 * ��ѯ�ɹ�����student��ʧ�ܷ���null
	 */
	Student selectStudent(int id);
	List<Student> selectStudent(String sname);
	
	/**�����ʦ��Ϣ�ķ���
	 * Ҫ��ӵĶ��� ����������Ϣ
	 *��ӳɹ�����true,���ʧ�ܷ���false
	 */
	boolean insertTeacher(Teacher teacher);
	
	/**ɾ����ʦ��Ϣ�ķ���
	 * Ҫɾ���Ķ��� �����˻�������
	 *ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
	 */
	boolean deleteTeacher(int id);
	
	/**�޸���ʦ��Ϣ�ķ���
	 * Ҫ�޸ĵĶ��� �����˻�������
	 *�޸ĳɹ�����true,�޸�ʧ�ܷ���false
	 */
	boolean updateTeacher(Teacher teacher);
	
	/**��ѯ��ʦ��Ϣ�ķ���
	 * Ҫ��ѯ����ʦ�˺Ż�����
	 * ��ѯ�ɹ�����teacher��ʧ�ܷ���null
	 */
	Teacher selectTeacher(int id);
	List<Teacher> selectTeacher(String tname);
	
	/**��ӿγ���Ϣ�ķ���
	 * Ҫ��ӵĶ��� ����������Ϣ
	 *��ӳɹ�����true,���ʧ�ܷ���false
	 */
	boolean insertCourse(Course course);
	
	/**ɾ���γ���Ϣ�ķ���
	 * Ҫɾ���Ķ��� ����������Ϣ
	 *ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
	 */
	boolean deleteCourse(int cno);
	
	/**�޸Ŀγ���Ϣ�ķ���
	 * Ҫ�޸ĵĶ��� ����������Ϣ
	 *�޸ĳɹ�����true,�޸�ʧ�ܷ���false
	 */
	boolean updateCourse(Course course);
	
	/**��ѯ�γ���Ϣ�ķ���
	 * Ҫ��ѯ�Ŀγ̺Ż�γ���
	 * ��ѯ�ɹ�����course��ʧ�ܷ���null
	 */
	Course selectCourse(int cno);
	List<Course> selectCourse(String cname);
	
	/**��ӳɼ���Ϣ�ķ���
	 * Ҫ��ӵĶ��� ����������Ϣ
	 *��ӳɹ�����true,���ʧ�ܷ���false
	 */
	boolean insertGrade(Grade grade);
	
	/**ɾ���ɼ���Ϣ�ķ���
	 * Ҫɾ���Ķ��� ����������Ϣ
	 *ɾ���ɹ�����true,ɾ��ʧ�ܷ���false
	 */
	boolean deleteGrade(int sno,int cno);
	
	/**�޸ĳɼ���Ϣ�ķ���
	 * Ҫ�޸ĵĶ��� ����������Ϣ
	 *�޸ĳɹ�����true,�޸�ʧ�ܷ���false
	 */
	boolean updateGrade(Grade grade);
	
	/**��ѯ�ɼ���Ϣ�ķ���
	 * Ҫ��ѯ��ѧ�źͿγ̺�
	 * ��ѯ�ɹ�����grade��ʧ�ܷ���null
	 */
	Grade selectGrade(int sno,int cno);
	List<AllGrade> selectGrade(int count);
	
	/**
	 * �鿴ѧ����Ϣ
	 */
	void showStudent(); 
	
	/**
	 * �鿴��ʦ��Ϣ
	 */
	void showTeacher();
	
	/**
	 * �鿴�γ���Ϣ
	 */
	void showCourse();
	
	/**
	 * �鿴�ɼ���Ϣ
	 */
	void showGrade();
}
