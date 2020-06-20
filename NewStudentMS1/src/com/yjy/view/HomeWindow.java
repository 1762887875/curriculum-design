package com.yjy.view;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;
import com.yjy.dao.imp.ManagerDao_Imp;
import com.yjy.dao.imp.StudentDao_Imp;
import com.yjy.dao.imp.TeacherDao_Imp;
public class HomeWindow {
		int id;
		String password;
		String name;
		Student studentUser;
		Teacher teacherUser;
		Manager managerUser;
		
	public HomeWindow() {
			super();
			// TODO Auto-generated constructor stub
			
			/*
			 * 对窗口的操作，包括创建，设置标题，设置大小以及位置
			 */
			JFrame frame = new JFrame();// 创建一个窗口
			frame.setTitle("学生管理系统");// 设置窗口标题
			frame.setBounds(250, 100, 825, 600);// 设置窗口位置和大小
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
			/*
			 * 这是对整个窗口布局的格式化，已达到可以任意放面板，标签，文本框，按钮等东西
			 */
			// FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);//
			// 实例化FlowLayout流式布局类的对象
			frame.setLayout(null);// 布局为空
	 
			/*
			 * 创建面板，以达到良好的布局
			 */
			JPanel panel = new JPanel();// JPanel：面板组件，非顶层容器
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			/*
			 * 设置一个大标题，即学生信息管理系统，放到面板panel1里面*/
			
			JLabel labTitle = new JLabel("学生管理系统");//设置窗口标题
			Font font1 = new Font("宋体", Font.BOLD, 50);//设置字形，字体和字号
			labTitle.setFont(font1);
			panel1.add(labTitle);
			panel1.setBounds(260, 20, 320, 80);//设置窗口位置和大小
			frame.add(panel1);
	 
			/*
			 * 设置身份标签
			 */
			Font font = new Font("宋体", Font.BOLD, 16);
			JLabel labCard = new JLabel("身份  ");// 用标签来表示文本或图片
			labCard.setFont(font);// 设置标签字体的大小
			panel.add(labCard);// 将lable标签添加到面板上
	 
			/*
			 * 设置下拉框
			 */
			JComboBox<String> jcb = new JComboBox<String>();
			Dimension dim = new Dimension(200, 30);//设置组件的宽和高
			jcb.setPreferredSize(dim);
	 
			jcb.addItem("学生");
			jcb.addItem("老师");
			jcb.addItem("管理员");
			
			jcb.setFont(font);
			panel.add(jcb);
			panel.setBounds(250, 100, 300, 50);
			frame.add(panel);
	 
			/*
			 * /* 创建一个账号标签，并设置字体以及字体大小
			 */
			JLabel labName = new JLabel("账号  ");// 用标签来表示文本或图片
			labName.setFont(font);// 设置标签字体的大小
			ImageIcon icon = new ImageIcon("user.png");
			labName.setIcon(icon);
			panel2.add(labName);// 将lable标签添加到面板上
			/*
			 * 创建一个文本框，并设置大小
			 */
			JTextField textName = new JTextField();
			textName.setPreferredSize(dim);
			
			panel2.add(textName);
			panel2.setBounds(250, 150, 300, 50);// 设置面板的位置和大小
			frame.add(panel2);// 添加面板到窗口中
			/*
			 * 创建一个密码标签
			 */
			JLabel labPass = new JLabel("密码  ");
			labPass.setFont(font);
			panel3.add(labPass);
			/*
			 * 设置密码文本框
			 */
			JPasswordField textPass = new JPasswordField();
			textPass.setPreferredSize(dim);
			panel3.add(textPass);
			panel3.setBounds(250, 200, 300, 50);
			frame.add(panel3);
	 
			/*
			 * 设置一个按钮
			 */
			Dimension dim1 = new Dimension(80, 30);
			JButton jb1 = new JButton("登录");
			JButton jb2 = new JButton("注册");
			jb1.setFont(font);
			jb2.setFont(font);
			jb1.setPreferredSize(dim1);
			jb2.setPreferredSize(dim1);
			panel4.add(jb1);
			panel5.add(jb2);
			panel4.setBounds(325, 250, 80, 50);
			panel5.setBounds(445, 250, 80, 50);
			frame.add(panel4);
			frame.add(panel5);
	 
			frame.setVisible(true);// 显示窗口
			jb1.addActionListener(new ActionListener() {
				
				@SuppressWarnings("deprecation")
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int index = jcb.getSelectedIndex();
					id= Integer.parseInt(textName.getText());
					password=textPass.getText();
					if(index==0) {						
						boolean flag1 = studentLogin(id,password);
						if(flag1) {							
							StudentAboutSelf sas =new StudentAboutSelf(studentUser);
							sas.setVisible(true);
							frame.dispose();
						}
						else {
							JOptionPane.showMessageDialog(jb2, "账号或密码有误，请重新输入！");
						}
					}
					else if(index==1) {
						boolean flag1 = teacherLogin(id,password);
						if(flag1==true) {							
							TeacherAboutSelf tas =new TeacherAboutSelf(teacherUser);							
							tas.setVisible(true);
							frame.dispose();
						}
						else {
							JOptionPane.showMessageDialog(jb2, "账号或密码有误，请重新输入！");
						}
					}
					else if(index==2) {
						boolean flag1 = managerLogin(id,password);
						if(flag1==true) {
							ManagerIndex mgi =new ManagerIndex(managerUser);
							mgi.setVisible(true);
							frame.dispose();
						}
						else {
							JOptionPane.showMessageDialog(jb2, "账号或密码有误，请重新输入！");
						}
					}
					
					
						
					
				}
			});
			
			jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(jb2, "注册通道暂时关闭，请联系管理员！");
				}
			});
		}

	public boolean studentLogin(int id,String password) {
		Student student =new Student();
		StudentDao_Imp stdi =new StudentDao_Imp();
		student.setId(id);
		student.setspassword(password);
		name = stdi.login(student);
		if(name!=null) {
			studentUser = stdi.selectStudent(id);
			return true;
		}
		
		else return false;							
	}
	public boolean teacherLogin(int id,String password) {
		Teacher teacher =new Teacher();
		TeacherDao_Imp thdi =new TeacherDao_Imp();
		teacher.setId(id);
		teacher.settpassword(password);
		name = thdi.login(teacher);
		if(name!=null) {
			teacherUser = thdi.selectTeacher(id);
			return true;
		}
		
		else return false;							
	}
	public boolean managerLogin(int id,String password) {
		Manager manager =new Manager();
		ManagerDao_Imp mgdi =new ManagerDao_Imp();
		manager.setId(id);
		manager.setPassword(password);
		id = mgdi.login(manager);
		if(id>0) {
			managerUser = manager;
			return true;
		}
		
		else return false;							
	}
	}

