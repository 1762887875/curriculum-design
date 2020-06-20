package com.yjy.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yjy.bean.Grade;
import com.yjy.bean.Teacher;
import com.yjy.dao.TeacherDao;
import com.yjy.jdbc.JDBCUtils;

public class TeacherDao_Imp implements TeacherDao{

	private static final String SQL_TEACHER_LOGIN = "SELECT * FROM teacher WHERE id=? AND tpassword=?";
	private static final String SQL_TEACHER_SELECT_SELF = "SELECT * FROM teacher WHERE id=?";
	private static final String SQL_TEACHER_UPDATE_SELF = "UPDATE teacher SET tname=?,tage=?,tprotitle=?,cno=?,password=? WHERE id=?";
	private static final String SQL_GRADE_INSERT_SELF = "INSERT INTO grade VALUES(?,?,?,?)";
	private static final String SQL_GRADE_DELETE_SELF = "DELETE FROM grade WHERE sno=? AND cno =?";
	private static final String SQL_GRADE_UPDATE_SELF = "UPDATE teacher SET grade=?,point=? WHERE sno=? AND cno=?";
	private static final String SQL_GRADE_SELECT_SELF = "SELECT sno,sname,grade,point FROM student,grade,teacher where student.id=grade.Sno AND teacher.Cno=grade.Cno AND teacher.Cno=? ORDER BY Grade DESC";
	private static final String SQL_TEACHER_SELECT_GRADE = "SELECT * FROM grade WHERE sno=? AND cno=?";

	@Override
	public String login(Teacher teacher) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				PreparedStatement prepareStatement=null;
				ResultSet result=null;		
				try {
					//创建预编译环境
					 prepareStatement = conn.prepareStatement(SQL_TEACHER_LOGIN);
					//设置sql语句中的参数
					prepareStatement.setInt(1, teacher.getId());
					prepareStatement.setString(2, teacher.gettpassword());			
					//执行语句
					result=prepareStatement.executeQuery();
					while(result.next()){
						String tname=result.getString("tname");
						if(tname!=null)
						return tname;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, result);
				}		
				return null;
	}

	@Override
	public Teacher selectTeacher(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_SELECT_SELF);
			//设置sql语句中的参数
			prepareStatement.setInt(1, id);			
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				 id = result.getInt("id");
				String tname = result.getString("tname");			
				   int tage  = result.getInt("tage");
			  String tprotitle    = result.getString("tprotitle");
			   int cno= result.getInt("cno");
			 String tpassword= result.getString("tpassword");
				return new Teacher(id,tname,tage,tprotitle,cno,tpassword);
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		return null;
		
	}

	@Override
	public boolean updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_TEACHER_UPDATE_SELF);
					//设置sql语句中的参数
					prepareStatement.setString(1, teacher.gettname());
					prepareStatement.setInt(2, teacher.gettage());
					prepareStatement.setString(3,teacher.gettprotitle());
					prepareStatement.setInt(4, teacher.getcno());
					prepareStatement.setString(5, teacher.gettpassword());
					prepareStatement.setInt(6, teacher.getId());
					int line=prepareStatement.executeUpdate();
					return line>0?true:false;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
		return false;
	}

	@Override
	public void selectCourse(int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_GRADE_SELECT_SELF);
					//设置sql语句中的参数
					prepareStatement.setInt(1, cno);
					ResultSet result=prepareStatement.executeQuery();
					while(result.next()) {
						 System.out.print(result.getInt("sno")+" ");
						 System.out.println(result.getString("sname"));
						 System.out.print(result.getFloat("grade")+" ");
						 System.out.print(result.getFloat("point")+" ");
					}
					
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
	}

	@Override
	public Grade selectGrade(int id,int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_SELECT_GRADE);
			//设置sql语句中的参数
			prepareStatement.setInt(1, id);
			prepareStatement.setInt(2, cno);
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				 id = result.getInt("id");
				 cno = result.getInt("cno");
				 float grade = result.getFloat("grade");
				 float point = result.getFloat("point");
				return new Grade(id,cno,grade,point);
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		return null;
		
	}
	
	@Override
	public boolean updateGrade(Grade grade) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_GRADE_UPDATE_SELF);
					//设置sql语句中的参数
					prepareStatement.setInt(3,grade.getSno());
					prepareStatement.setInt(4, grade.getCno());
					prepareStatement.setFloat(1, grade.getGrade());
					prepareStatement.setFloat(2, grade.getPoint());
					int line=prepareStatement.executeUpdate();
					return line>0?true:false;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
		return false;
	}

	@Override
	public boolean insertGrade(Grade grade) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_GRADE_INSERT_SELF);
			//设置sql语句中的参数
			prepareStatement.setInt(1,grade.getSno());
			prepareStatement.setInt(2, grade.getCno());
			prepareStatement.setFloat(3, grade.getGrade());
			prepareStatement.setFloat(4, grade.getPoint());
			int line=prepareStatement.executeUpdate();
			return line>0?true:false;
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		return false;
	}

	@Override
	public boolean deleteGrade(int sno, int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_GRADE_DELETE_SELF);
					//设置sql语句中的参数
					prepareStatement.setInt(1, sno);
					prepareStatement.setInt(2, cno);
					int line=prepareStatement.executeUpdate();
					return line>0?true:false;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
		return false;
	}

}
