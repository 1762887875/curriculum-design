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
			 * �Դ��ڵĲ������������������ñ��⣬���ô�С�Լ�λ��
			 */
			JFrame frame = new JFrame();// ����һ������
			frame.setTitle("ѧ������ϵͳ");// ���ô��ڱ���
			frame.setBounds(250, 100, 825, 600);// ���ô���λ�úʹ�С
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
			/*
			 * ���Ƕ��������ڲ��ֵĸ�ʽ�����Ѵﵽ�����������壬��ǩ���ı��򣬰�ť�ȶ���
			 */
			// FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 10, 10);//
			// ʵ����FlowLayout��ʽ������Ķ���
			frame.setLayout(null);// ����Ϊ��
	 
			/*
			 * ������壬�Դﵽ���õĲ���
			 */
			JPanel panel = new JPanel();// JPanel�����������Ƕ�������
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			JPanel panel3 = new JPanel();
			JPanel panel4 = new JPanel();
			JPanel panel5 = new JPanel();
			/*
			 * ����һ������⣬��ѧ����Ϣ����ϵͳ���ŵ����panel1����*/
			
			JLabel labTitle = new JLabel("ѧ������ϵͳ");//���ô��ڱ���
			Font font1 = new Font("����", Font.BOLD, 50);//�������Σ�������ֺ�
			labTitle.setFont(font1);
			panel1.add(labTitle);
			panel1.setBounds(260, 20, 320, 80);//���ô���λ�úʹ�С
			frame.add(panel1);
	 
			/*
			 * ������ݱ�ǩ
			 */
			Font font = new Font("����", Font.BOLD, 16);
			JLabel labCard = new JLabel("���  ");// �ñ�ǩ����ʾ�ı���ͼƬ
			labCard.setFont(font);// ���ñ�ǩ����Ĵ�С
			panel.add(labCard);// ��lable��ǩ��ӵ������
	 
			/*
			 * ����������
			 */
			JComboBox<String> jcb = new JComboBox<String>();
			Dimension dim = new Dimension(200, 30);//��������Ŀ�͸�
			jcb.setPreferredSize(dim);
	 
			jcb.addItem("ѧ��");
			jcb.addItem("��ʦ");
			jcb.addItem("����Ա");
			
			jcb.setFont(font);
			panel.add(jcb);
			panel.setBounds(250, 100, 300, 50);
			frame.add(panel);
	 
			/*
			 * /* ����һ���˺ű�ǩ�������������Լ������С
			 */
			JLabel labName = new JLabel("�˺�  ");// �ñ�ǩ����ʾ�ı���ͼƬ
			labName.setFont(font);// ���ñ�ǩ����Ĵ�С
			ImageIcon icon = new ImageIcon("user.png");
			labName.setIcon(icon);
			panel2.add(labName);// ��lable��ǩ��ӵ������
			/*
			 * ����һ���ı��򣬲����ô�С
			 */
			JTextField textName = new JTextField();
			textName.setPreferredSize(dim);
			
			panel2.add(textName);
			panel2.setBounds(250, 150, 300, 50);// ��������λ�úʹ�С
			frame.add(panel2);// �����嵽������
			/*
			 * ����һ�������ǩ
			 */
			JLabel labPass = new JLabel("����  ");
			labPass.setFont(font);
			panel3.add(labPass);
			/*
			 * ���������ı���
			 */
			JPasswordField textPass = new JPasswordField();
			textPass.setPreferredSize(dim);
			panel3.add(textPass);
			panel3.setBounds(250, 200, 300, 50);
			frame.add(panel3);
	 
			/*
			 * ����һ����ť
			 */
			Dimension dim1 = new Dimension(80, 30);
			JButton jb1 = new JButton("��¼");
			JButton jb2 = new JButton("ע��");
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
	 
			frame.setVisible(true);// ��ʾ����
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
							JOptionPane.showMessageDialog(jb2, "�˺Ż������������������룡");
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
							JOptionPane.showMessageDialog(jb2, "�˺Ż������������������룡");
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
							JOptionPane.showMessageDialog(jb2, "�˺Ż������������������룡");
						}
					}
					
					
						
					
				}
			});
			
			jb2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(jb2, "ע��ͨ����ʱ�رգ�����ϵ����Ա��");
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

