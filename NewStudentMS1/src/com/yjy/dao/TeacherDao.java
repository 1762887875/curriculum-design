package com.yjy.dao;

import com.yjy.bean.Grade;
import com.yjy.bean.Teacher;

public interface TeacherDao {
	/**
	 * 登录实现
	 */
	String login(Teacher teacher);
	
	/**
	 * 查看个人信息
	 */
	Teacher selectTeacher(int id);
	
	/**
	 * 修改个人信息
	 */
	boolean updateTeacher(Teacher teacher);
	
	/**
	 * 查询学生成绩
	 */
	void selectCourse(int cno);
	
	/**
	 * 修改学生成绩
	 */
	boolean updateGrade(Grade grade);
	
	/**
	 * 添加学生成绩
	 */
	boolean insertGrade(Grade grade);
	
	/**
	 * 删除学生成绩
	 */
	boolean deleteGrade(int sno,int cno);
	
	/**
	 * 查询学生成绩是否存在
	 * @param id
	 * @param cno
	 * @return
	 */
	Grade selectGrade(int id, int cno);
}
