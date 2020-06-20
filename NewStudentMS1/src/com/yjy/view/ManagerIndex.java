package com.yjy.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.yjy.bean.Manager;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class ManagerIndex extends JFrame {

	private JPanel contentPane;

	/**
	 * 以下内容架构由winowsbuilder辅助完成
	 * Launch the application.
	 */
	
	public ManagerIndex(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		
		JButton aboutStudent = new JButton("");
		aboutStudent.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/student.png")));
		aboutStudent.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u60A8\uFF01");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 24));
		
		JButton aboutTeacher = new JButton("");
		aboutTeacher.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/teacher.png")));
		aboutTeacher.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton aboutCourse = new JButton("");
		aboutCourse.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/course.png")));
		aboutCourse.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton aboutGrade = new JButton("");
		aboutGrade.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/grade.png")));
		aboutGrade.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel managerUser = new JLabel("\u7BA1\u7406\u5458");
		managerUser.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/manager.png")));
		managerUser.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("\u8BF7\u9009\u62E9\u60A8\u8981\u7BA1\u7406\u7684\u7CFB\u7EDF\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.BOLD, 16));
		
		JLabel lblNewLabel_1 = new JLabel("\u5B66\u751F\u7CFB\u7EDF");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("\u8001\u5E08\u7CFB\u7EDF");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u8BFE\u7A0B\u7CFB\u7EDF");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("\u6210\u7EE9\u7CFB\u7EDF");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton exit = new JButton("");
		exit.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/\u9000\u51FA\u767B\u5F55.png")));
		
		JButton update = new JButton("");
		update.setIcon(new ImageIcon(ManagerIndex.class.getResource("/images/\u4FEE\u6539.png")));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(262)
							.addComponent(managerUser)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(aboutStudent, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(aboutTeacher, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(aboutCourse, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(aboutGrade, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
									.addGap(2))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addGap(10)
									.addComponent(lblNewLabel_1)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(lblNewLabel_4)
									.addGap(46)
									.addComponent(lblNewLabel_5)
									.addGap(12)))))
					.addGap(95))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(222)
					.addComponent(lblNewLabel_3)
					.addContainerGap(335, Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(66)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
					.addGap(245))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(424, Short.MAX_VALUE)
					.addComponent(update)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(exit)
					.addGap(23))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(exit)
						.addComponent(update))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(managerUser, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(27)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(aboutTeacher, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(aboutStudent, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
								.addComponent(aboutCourse, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)))
						.addComponent(aboutGrade, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_4))
					.addGap(46))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 609, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
		managerUser.setText(manager.getId()+"");
		
		aboutStudent.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerAboutStudent mas = new ManagerAboutStudent(manager);
				mas.setVisible(true);
				dispose();
			}
		});
		
		aboutTeacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerAboutTeacher mat = new ManagerAboutTeacher(manager);
				mat.setVisible(true);
				dispose();
			}
		});
		
		aboutCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				ManagerAboutCourse mac = new ManagerAboutCourse(manager);
				mac.setVisible(true);
				dispose();
			}
		});
		
		aboutGrade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub				
				ManagerAboutGrade mag = new ManagerAboutGrade(manager);
				mag.setVisible(true);
				dispose();
			}
		});
		
		exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HomeWindow hw = new HomeWindow();
				dispose();
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerToUpdate mtu = new ManagerToUpdate(manager);
				mtu.setVisible(true);
				dispose();
			}
		});
	}
}
