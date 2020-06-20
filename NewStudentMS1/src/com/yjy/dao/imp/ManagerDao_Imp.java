package com.yjy.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Course;
import com.yjy.bean.Grade;
import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;
import com.yjy.dao.ManagerDao;
import com.yjy.jdbc.JDBCUtils;

public class ManagerDao_Imp implements ManagerDao{
	private static final String SQL_MANAGER_LOGIN="SELECT * FROM manager WHERE id=? AND password=?";
	private static final String SQL_Manager_UPDATE = "UPDATE manager SET password=? WHERE id=?";
	private static final String SQL_STUDENT_INSERT="INSERT INTO student VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String SQL_STUDENT_DELETE = "DELETE FROM student WHERE id=?";
	private static final String SQL_STUDENT_UPDATE = "UPDATE student SET sname=?,ssex=?,sage=?,stel=?,sacademy=?,sclass=?,saddress=?,spassword=? WHERE id=?";
	private static final String SQL_STUDENT_SELECT_ID = "SELECT * FROM student WHERE id=?";
	private static final String SQL_STUDENT_SELECT_NAME = "SELECT * FROM student WHERE sname like concat('%',?,'%')";
	private static final String SQL_TEACHER_INSERT = "INSERT INTO teacher VALUES(?,?,?,?,?,?)";
	private static final String SQL_TEACHER_DELETE = "DELETE FROM teacher WHERE id=?";
	private static final String SQL_TEACHER_UPDATE = "UPDATE teacher SET tname=?,tage=?,tprotitle=?,cno=?,tpassword=? WHERE id=?";
	private static final String SQL_TEACHER_SELECT_ID = "SELECT * FROM teacher WHERE id=?";
	private static final String SQL_TEACHER_SELECT_NAME = "SELECT * FROM teacher WHERE tname like concat('%',?,'%')";
	private static final String SQL_COURSE_INSERT = "INSERT INTO course VALUES(?,?,?)";
	private static final String SQL_COURSE_DELETE = "DELETE FROM course WHERE cno=?";
	private static final String SQL_COURSE_UPDATE = "UPDATE course SET cname=?,ccredit=? WHERE cno=?";
	private static final String SQL_COURSE_SELECT_CNO = "SELECT * FROM course WHERE cno=?";
	private static final String SQL_COURSE_SELECT_NAME = "SELECT * FROM course WHERE cname like concat('%',?,'%')";
	private static final String SQL_GRADE_INSERT = "INSERT INTO grade VALUES(?,?,?,?)";
	private static final String SQL_GRADE_DELETE = "DELETE FROM grade WHERE sno=? AND cno=?";
	private static final String SQL_GRADE_UPDATE = "UPDATE grade SET grade=?,point=? WHERE sno=? AND cno=?";
	private static final String SQL_GRADE_SELECT_CNO = "SELECT * FROM grade WHERE sno=? AND cno=?";
	private static final String SQL_STUDENT_SHOW = "SELECT * FROM student";
	private static final String SQL_TEACHER_SHOW = "SELECT * FROM teacher";
	private static final String SQL_COURSE_SHOW = "SELECT * FROM course";
	private static final String SQL_GRADE_SHOW = "SELECT * FROM grade";
	private static final String SQL_GRADE_SELECT = "SELECT grade.sno,sname,grade.cno,cname,tname,grade,point FROM grade,student,teacher,course WHERE student.ID = grade.Sno AND teacher.Cno = grade.Cno AND course.Cno = grade.Cno";	
	
	//管理员登录
	@Override
	public int login(Manager manager) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				PreparedStatement prepareStatement=null;
				ResultSet result=null;		
				try {
					//创建预编译环境
					 prepareStatement = conn.prepareStatement(SQL_MANAGER_LOGIN);
					//设置sql语句中的参数
					prepareStatement.setInt(1, manager.getId());
					prepareStatement.setString(2, manager.getPassword());			
					//执行语句
					result=prepareStatement.executeQuery();
					while(result.next()){
						int id=result.getInt("id");
						if(id!=0)
						return id;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, result);
				}		
				return -1;
			}

	@Override
	public boolean updateManager(Manager manager) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_Manager_UPDATE);
					//设置sql语句中的参数
					prepareStatement.setString(1,manager.getPassword());
					prepareStatement.setInt(2, manager.getId());
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
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_STUDENT_INSERT);
					//设置sql语句中的参数
					prepareStatement.setInt(1,student.getId());
					prepareStatement.setString(2, student.getsname());
					prepareStatement.setString(3, student.getssex());
					prepareStatement.setInt(4, student.getsage());
					prepareStatement.setString(5, student.getstel());
					prepareStatement.setString(6, student.getsacademy());
					prepareStatement.setString(7, student.getsclass());
					prepareStatement.setString(8, student.getsaddress());
					prepareStatement.setString(9, student.getspassword());
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
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_STUDENT_DELETE);
					//设置sql语句中的参数
					prepareStatement.setInt(1, id);
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
	public boolean updateStudent(Student student) {
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_STUDENT_UPDATE);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student selectStudent(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_STUDENT_SELECT_ID);
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
	public List<Student> selectStudent(String sname) {
		List<Student> reList = new ArrayList<Student>();
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_STUDENT_SELECT_NAME);
					//设置sql语句中的参数
					prepareStatement.setString(1,sname);			
					ResultSet result=prepareStatement.executeQuery();
					while(result.next()) {
						 int id = result.getInt("id");
						 sname = result.getString("sname");
						String ssex  = result.getString("ssex");			
						   int sage  = result.getInt("sage");
					  String stel    = result.getString("stel");
					  String sacademy= result.getString("sacademy");
					  String sclass  = result.getString("sclass");
					  String saddress= result.getString("saddress");
					 String spassword= result.getString("spassword");
						Student student = new Student(id,sname,ssex,sage,stel,sacademy,sclass,saddress,spassword);
						reList.add(student);
					}
					return reList;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
		return null;
	}

	@Override
	public boolean insertTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_INSERT);
			//设置sql语句中的参数
			prepareStatement.setInt(1,teacher.getId());
			prepareStatement.setString(2, teacher.gettname());
			prepareStatement.setInt(3, teacher.gettage());
			prepareStatement.setString(4, teacher.gettprotitle());
			prepareStatement.setInt(5, teacher.getcno());
			prepareStatement.setString(6, teacher.gettpassword());
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
	public boolean deleteTeacher(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_DELETE);
			//设置sql语句中的参数
			prepareStatement.setInt(1, id);
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
	public boolean updateTeacher(Teacher teacher) {
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_UPDATE);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Teacher selectTeacher(int id) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_TEACHER_SELECT_ID);
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
	public List<Teacher> selectTeacher(String tname) {
		List<Teacher> reList = new ArrayList<Teacher>();
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_TEACHER_SELECT_NAME);
			//设置sql语句中的参数
			prepareStatement.setString(1, tname);			
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				 int id = result.getInt("id");
				 tname = result.getString("tname");			
				   int tage  = result.getInt("tage");
			  String tprotitle    = result.getString("tprotitle");
			   int cno= result.getInt("cno");
			 String tpassword= result.getString("tpassword");
				Teacher teacher = new Teacher(id,tname,tage,tprotitle,cno,tpassword);
				reList.add(teacher);
			}
			return reList;
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		return null;
	}

	@Override
	public boolean insertCourse(Course course) {
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_COURSE_INSERT);
					//设置sql语句中的参数
					prepareStatement.setInt(1,course.getCno());
					prepareStatement.setString(2, course.getCname());
					prepareStatement.setFloat(3, course.getCcredit());
					int line=prepareStatement.executeUpdate();
					return line>0?true:false;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCourse(int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_COURSE_DELETE);
					//设置sql语句中的参数
					prepareStatement.setInt(1, cno);
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
	public boolean updateCourse(Course course) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_COURSE_UPDATE);
					//设置sql语句中的参数
					prepareStatement.setString(1, course.getCname());
					prepareStatement.setFloat(2, course.getCcredit());
					prepareStatement.setInt(3, course.getCno());
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
	public Course selectCourse(int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_COURSE_SELECT_CNO);
			//设置sql语句中的参数
			prepareStatement.setInt(1, cno);			
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				 cno = result.getInt("cno");
				String cname = result.getString("cname");			
				   Float ccredit  = result.getFloat("ccredit");
				return new Course(cno,cname,ccredit);
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
	public List<Course> selectCourse(String cname) {
		// TODO Auto-generated method stub
		List<Course> reList = new ArrayList<Course>();
		//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				//创建预编译环境
				PreparedStatement prepareStatement=null;		
				try {
					prepareStatement=conn.prepareStatement(SQL_COURSE_SELECT_NAME);
					//设置sql语句中的参数
					prepareStatement.setString(1, cname);			
					ResultSet result=prepareStatement.executeQuery();
					while(result.next()) {
						int cno = result.getInt("cno");
						cname = result.getString("cname");			
						   Float ccredit  = result.getFloat("ccredit");
						Course course = new Course(cno,cname,ccredit);
						reList.add(course);
					}
					return reList;
					} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					JDBCUtils.close(conn, prepareStatement, null);
				}
				
		return null;
	}

	@Override
	public boolean insertGrade(Grade grade) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_GRADE_INSERT);
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
			prepareStatement=conn.prepareStatement(SQL_GRADE_DELETE);
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

	@Override
	public boolean updateGrade(Grade grade) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_GRADE_UPDATE);
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

	public Grade selectGrade(int sno, int cno) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			prepareStatement=conn.prepareStatement(SQL_GRADE_SELECT_CNO);
			//设置sql语句中的参数
			prepareStatement.setInt(1, sno);
			prepareStatement.setInt(2, cno);
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				 sno = result.getInt("sno");
				 cno = result.getInt("cno");
				float grade = result.getFloat("grade");			
				   Float point  = result.getFloat("point");
				return new Grade(sno,cno,grade,point);
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		
		return null;
	}
	
	public List<AllGrade> selectGrade(int count) {
		// TODO Auto-generated method stub
		//连接数据库，创建连接对象conn
		List <AllGrade> reList = new ArrayList<AllGrade>();
		Connection conn=JDBCUtils.getconnection();
		//创建预编译环境
		PreparedStatement prepareStatement=null;		
		try {
			if(count<=0) {
				prepareStatement=conn.prepareStatement(SQL_GRADE_SELECT);				
			}else if(count >0&&count<100) {
				prepareStatement=conn.prepareStatement(SQL_GRADE_SELECT+" AND grade.Cno=?");
				prepareStatement.setInt(1, count);
			}else {
				prepareStatement=conn.prepareStatement(SQL_GRADE_SELECT+" AND grade.Sno=?");
				prepareStatement.setInt(1, count);
			}
					
			ResultSet result=prepareStatement.executeQuery();
			while(result.next()) {
				int sno = result.getInt("sno");
				String sname = result.getString("sname");
				int cno = result.getInt("cno");
				String cname = result.getString("cname");
				String tname = result.getString("tname");
				float grade = result.getFloat("grade");			
				   Float point  = result.getFloat("point");
				AllGrade allGrade = new AllGrade(sno,sname,cno,cname,tname,grade,point);
				reList.add(allGrade);
			}
			return reList;
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JDBCUtils.close(conn, prepareStatement, null);
		}
		
		return null;
	}



	@Override
	public void showStudent() {
		 try{
			//连接数据库，创建连接对象conn
			Connection conn=JDBCUtils.getconnection();
			PreparedStatement prepareStatement=null;
			ResultSet result=null;	
			//创建预编译环境
			 prepareStatement = conn.prepareStatement(SQL_STUDENT_SHOW);
			//执行语句
				result=prepareStatement.executeQuery();
				while(result.next()){
					System.out.print(result.getInt("id")+" ");
					System.out.print(result.getString("sname")+" ");
					System.out.print(result.getString("ssex")+" ");
					System.out.print(result.getInt("sage")+" ");
					System.out.print(result.getString("stel")+" ");
					System.out.print(result.getString("sacademy")+" ");
					System.out.print(result.getString("sclass")+" ");
					System.out.print(result.getString("saddress")+" ");
					System.out.print(result.getString("spassword")+" ");
					System.out.println();

				}
			
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
	}



	@Override
	public void showTeacher() {
		// TODO Auto-generated method stub
		 try{
				//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				PreparedStatement prepareStatement=null;
				ResultSet result=null;	
				//创建预编译环境
				 prepareStatement = conn.prepareStatement(SQL_TEACHER_SHOW);
				//执行语句
					result=prepareStatement.executeQuery();
					while(result.next()){
						System.out.print(result.getInt("id")+" ");
						System.out.print(result.getString("tname")+" ");					
						System.out.print(result.getInt("tage")+" ");
						System.out.print(result.getString("tprotitle")+" ");
						System.out.print(result.getInt("cno")+" ");
						System.out.print(result.getString("tpassword")+" ");
						System.out.println();

					}
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
	}



	@Override
	public void showCourse() {
		// TODO Auto-generated method stub
		 try{
				//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				PreparedStatement prepareStatement=null;
				ResultSet result=null;	
				//创建预编译环境
				 prepareStatement = conn.prepareStatement(SQL_COURSE_SHOW);
				//执行语句
					result=prepareStatement.executeQuery();
					while(result.next()){
						System.out.print(result.getInt("cno")+" ");
						System.out.print(result.getString("cname")+" ");					
						System.out.print(result.getFloat("ccredit")+" ");
						System.out.println();
					}
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
	}



	@Override
	public void showGrade() {
		// TODO Auto-generated method stub
		 try{
				//连接数据库，创建连接对象conn
				Connection conn=JDBCUtils.getconnection();
				PreparedStatement prepareStatement=null;
				ResultSet result=null;	
				//创建预编译环境
				 prepareStatement = conn.prepareStatement(SQL_GRADE_SHOW);
				//执行语句
					result=prepareStatement.executeQuery();
					while(result.next()){
						System.out.print(result.getInt("sno")+" ");
						System.out.print(result.getInt("cno")+" ");					
						System.out.print(result.getInt("grade")+" ");
						System.out.print(result.getFloat("point")+" ");
						System.out.println();
					}
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		
	}



	

}
