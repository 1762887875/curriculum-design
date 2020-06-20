package com.yjy.dao;

import java.util.List;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Course;
import com.yjy.bean.Grade;
import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;



public interface ManagerDao {


	/** 登录实现
	 * @param name账户 password密码
	 * @return int类型 -1登录失败  1登录成功
	 */
	
	int login(Manager manager);	
	
	/**
	 * 修改密码
	 * 成功返回true，失败返回false
	 */
	boolean updateManager(Manager manager);
	
	/**添加学生信息的方法
	 * 要添加的对象 包括各种信息
	 *添加成功返回true,添加失败返回false
	 */
	boolean insertStudent(Student student);
	
	/**删除学生信息的方法
	 * 要删除的对象 包括账户和密码
	 *删除成功返回true,删除失败返回false
	 */
	boolean deleteStudent(int id);
	
	/**修改学生信息的方法
	 * 要修改的对象 包括账户和密码
	 *修改成功返回true,修改失败返回false
	 */
	boolean updateStudent(Student student);
	
	/**查询学生信息的方法
	 * 要查询的学生账号、姓名
	 * 查询成功返回student，失败返回null
	 */
	Student selectStudent(int id);
	List<Student> selectStudent(String sname);
	
	/**添加老师信息的方法
	 * 要添加的对象 包括各种信息
	 *添加成功返回true,添加失败返回false
	 */
	boolean insertTeacher(Teacher teacher);
	
	/**删除老师信息的方法
	 * 要删除的对象 包括账户和密码
	 *删除成功返回true,删除失败返回false
	 */
	boolean deleteTeacher(int id);
	
	/**修改老师信息的方法
	 * 要修改的对象 包括账户和密码
	 *修改成功返回true,修改失败返回false
	 */
	boolean updateTeacher(Teacher teacher);
	
	/**查询老师信息的方法
	 * 要查询的老师账号或姓名
	 * 查询成功返回teacher，失败返回null
	 */
	Teacher selectTeacher(int id);
	List<Teacher> selectTeacher(String tname);
	
	/**添加课程信息的方法
	 * 要添加的对象 包括各种信息
	 *添加成功返回true,添加失败返回false
	 */
	boolean insertCourse(Course course);
	
	/**删除课程信息的方法
	 * 要删除的对象 包括各种信息
	 *删除成功返回true,删除失败返回false
	 */
	boolean deleteCourse(int cno);
	
	/**修改课程信息的方法
	 * 要修改的对象 包括各种信息
	 *修改成功返回true,修改失败返回false
	 */
	boolean updateCourse(Course course);
	
	/**查询课程信息的方法
	 * 要查询的课程号或课程名
	 * 查询成功返回course，失败返回null
	 */
	Course selectCourse(int cno);
	List<Course> selectCourse(String cname);
	
	/**添加成绩信息的方法
	 * 要添加的对象 包括各种信息
	 *添加成功返回true,添加失败返回false
	 */
	boolean insertGrade(Grade grade);
	
	/**删除成绩信息的方法
	 * 要删除的对象 包括各种信息
	 *删除成功返回true,删除失败返回false
	 */
	boolean deleteGrade(int sno,int cno);
	
	/**修改成绩信息的方法
	 * 要修改的对象 包括各种信息
	 *修改成功返回true,修改失败返回false
	 */
	boolean updateGrade(Grade grade);
	
	/**查询成绩信息的方法
	 * 要查询的学号和课程号
	 * 查询成功返回grade，失败返回null
	 */
	Grade selectGrade(int sno,int cno);
	List<AllGrade> selectGrade(int count);
	
	/**
	 * 查看学生信息
	 */
	void showStudent(); 
	
	/**
	 * 查看老师信息
	 */
	void showTeacher();
	
	/**
	 * 查看课程信息
	 */
	void showCourse();
	
	/**
	 * 查看成绩信息
	 */
	void showGrade();
}
