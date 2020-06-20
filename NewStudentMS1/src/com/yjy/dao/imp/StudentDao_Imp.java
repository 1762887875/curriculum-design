package com.yjy.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.yjy.bean.Student;
import com.yjy.dao.StudentDao;
import com.yjy.jdbc.JDBCUtils;

public class StudentDao_Imp implements StudentDao{

	private static final String SQL_STUDENT_LOGIN = "SELECT * FROM student WHERE id=? AND spassword=?";
	private static final String SQL_STUDENT_SELECT_SELF = "SELECT * FROM student WHERE id=?";
	private static final String SQL_STUDENT_UPDATE_SELF = "UPDATE student SET sname=?,ssex=?,sage=?,stel=?,sacademy=?,sclass=?,saddress=?,spassword=? WHERE id=?";
	private static final String SQL_COURSE_SELECT_SELF = "SELECT Cname,Tname,Grade,Point FROM student,course,grade,teacher	WHERE student.ID=grade.Sno AND grade.Cno=course.Cno AND course.cno=teacher.cno AND student.ID=?";

	@Override
	public String login(Student student) {
		// TODO Auto-generated method stub
		
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		PreparedStatement prepareStatement=null;
		ResultSet result=null;		
		try {
			//创建预编译环境
			 prepareStatement = conn.prepareStatement(SQL_STUDENT_LOGIN);
			//设置sql语句中的参数
			prepareStatement.setInt(1, student.getId());
			prepareStatement.setString(2, student.getspassword());			
			//执行语句
			result=prepareStatement.executeQuery();
			while(result.next()){
				String sname=result.getString("Sname");
				if(sname!=null)
				return sname;
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
	public Student selectStudent(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_STUDENT_SELECT_SELF);
					//设置sql语句中的参数
					prepareStatement.setInt(1, id);			
					ResultSet result=prepareStatement.executeQuery();
					while(result.next()) {
						 id = result.getInt("id");
						String sname = result.getString("sname");
						String ssex  = result.getString("ssex");			
						   int sage  = result.getInt("sage");
					  String stel    = result.getString("stel");
					  String sacademy= result.getString("sacademy");
					  String sclass  = result.getString("sclass");
					  String saddress= result.getString("saddress");
					 String spassword= result.getString("spassword");
						return new Student(id,sname,ssex,sage,stel,sacademy,sclass,saddress,spassword);
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
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_STUDENT_UPDATE_SELF);
			//设置sql语句中的参数
			prepareStatement.setString(1, student.getsname());
			prepareStatement.setString(2, student.getssex());
			prepareStatement.setInt(3, student.getsage());
			prepareStatement.setString(4, student.getstel());
			prepareStatement.setString(5, student.getsacademy());
			prepareStatement.setString(6, student.getsclass());
			prepareStatement.setString(7, student.getsaddress());
			prepareStatement.setString(8, student.getspassword());
			prepareStatement.setInt(9,student.getId());
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
	public void selectCourse(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_COURSE_SELECT_SELF);
			//设置sql语句中的参数
			prepareStatement.setInt(1, id);			
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
			System.out.print(result.getString("cname")+" ");
			System.out.print(result.getString("tname")+" ");
			System.out.print(result.getInt("grade")+" ");
			System.out.print(result.getFloat("point")+" ");
				
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
	}

}
