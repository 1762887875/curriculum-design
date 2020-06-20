package com.yjy.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Grade;
import com.yjy.bean.Teacher;
import com.yjy.dao.imp.ManagerDao_Imp;
import com.yjy.dao.imp.TeacherDao_Imp;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class TeacherAboutSelf extends JFrame {

	private JPanel contentPane;
	private JTextField forName;
	private JTextField forAge;
	private JTextField forProtitle;
	private JTextField forCno;
	private JTextField forPassword;
	private JTextField forSno;
	private JTextField forGrade;
	private JTextField forPoint;
	private JTextField firstId;
	private JTextField nextId;
	private Teacher teacher;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public TeacherAboutSelf(Teacher teacher) {
		this.teacher = teacher;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 934, 681);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JLabel teacherUser = new JLabel("\u8001\u5E08");
		teacherUser.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u60A8\uFF01");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		
		JButton showSelf = new JButton("\u67E5\u770B\u4E2A\u4EBA\u4FE1\u606F");
		showSelf.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u4FE1\u606F.png")));
		showSelf.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton updateSelf = new JButton("\u4FEE\u6539\u4E2A\u4EBA\u4FE1\u606F");
		updateSelf.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u4FEE\u6539.png")));
		updateSelf.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton addGrade = new JButton("\u589E\u52A0\u5B66\u751F\u6210\u7EE9");
		addGrade.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/icon_add.png")));
		addGrade.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton updateGrade = new JButton("\u4FEE\u6539\u5B66\u751F\u6210\u7EE9");
		updateGrade.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u4FEE\u6539.png")));
		updateGrade.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton deleteGrade = new JButton("\u5220\u9664\u5B66\u751F\u6210\u7EE9");
		deleteGrade.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/icon_delete.png")));
		deleteGrade.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton showGrade = new JButton("\u67E5\u770B\u5B66\u751F\u6210\u7EE9");
		showGrade.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u6210\u7EE9.png")));
		showGrade.setFont(new Font("宋体", Font.PLAIN, 14));
		
		JButton exit = new JButton("");
		exit.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u9000\u51FA\u767B\u5F55.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(teacherUser)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(showSelf)
						.addComponent(updateGrade))
					.addGap(74)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(updateSelf)
						.addComponent(deleteGrade))
					.addGap(69)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(addGrade)
							.addGap(70)
							.addComponent(exit))
						.addComponent(showGrade))
					.addGap(130))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(24)
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(teacherUser)
										.addComponent(lblNewLabel)))
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(showSelf)
										.addComponent(updateSelf)
										.addComponent(addGrade))))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(showGrade))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(deleteGrade))
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(updateGrade))))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(27)
							.addComponent(exit)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(new CardLayout(0, 0));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 906, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 523, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JPanel p1 = new JPanel();
		panel_1.add(p1, "show");
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("\u804C\u79F0\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u8BFE\u53F7\uFF1A");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("\u5DE5\u53F7\uFF1A");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel id = new JLabel("New label");
		id.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel name = new JLabel("New label");
		name.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel age = new JLabel("New label");
		age.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel protitle = new JLabel("New label");
		protitle.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel cno = new JLabel("New label");
		cno.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(290)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_4)
							.addComponent(lblNewLabel_3)
							.addComponent(lblNewLabel_2))
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_1))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addComponent(name)
						.addComponent(age)
						.addComponent(protitle)
						.addComponent(cno)
						.addComponent(id))
					.addContainerGap(481, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(23)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(id))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(name)
						.addComponent(lblNewLabel_1))
					.addGap(30)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(age))
					.addGap(36)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(protitle))
					.addGap(33)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(cno))
					.addContainerGap(292, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		
		JPanel p2 = new JPanel();
		panel_1.add(p2, "update");
		
		JLabel New_lables = new JLabel("\u59D3\u540D\uFF1A");
		New_lables.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_8 = new JLabel("\u804C\u79F0\uFF1A");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_9 = new JLabel("\u8BFE\u53F7\uFF1A");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_10 = new JLabel("\u5BC6\u7801\uFF1A");
		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forName = new JTextField();
		forName.setFont(new Font("宋体", Font.PLAIN, 16));
		forName.setColumns(10);
		
		forAge = new JTextField();
		forAge.setFont(new Font("宋体", Font.PLAIN, 16));
		forAge.setColumns(10);
		
		forProtitle = new JTextField();
		forProtitle.setFont(new Font("宋体", Font.PLAIN, 16));
		forProtitle.setColumns(10);
		
		forCno = new JTextField();
		forCno.setFont(new Font("宋体", Font.PLAIN, 16));
		forCno.setColumns(10);
		
		forPassword = new JTextField();
		forPassword.setFont(new Font("宋体", Font.PLAIN, 16));
		forPassword.setColumns(10);
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(232)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_p2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_9)
							.addGap(18)
							.addComponent(forCno))
						.addGroup(gl_p2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_8)
							.addGap(18)
							.addComponent(forProtitle))
						.addGroup(gl_p2.createSequentialGroup()
							.addComponent(lblNewLabel_7)
							.addGap(18)
							.addComponent(forAge))
						.addGroup(gl_p2.createSequentialGroup()
							.addComponent(New_lables)
							.addGap(18)
							.addComponent(forName, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_p2.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_10)
							.addGap(18)
							.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
								.addComponent(submit, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
								.addComponent(forPassword))))
					.addContainerGap(463, Short.MAX_VALUE))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(80)
					.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
						.addComponent(New_lables)
						.addComponent(forName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_7)
						.addGroup(gl_p2.createSequentialGroup()
							.addComponent(forAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forProtitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_8))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_9))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_10))))
					.addGap(37)
					.addComponent(submit)
					.addContainerGap(200, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		
		JPanel p3 = new JPanel();
		panel_1.add(p3, "add");
		
		JLabel lblNewLabel_6 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u5B66\u53F7\uFF1A");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forSno = new JTextField();
		forSno.setFont(new Font("宋体", Font.PLAIN, 16));
		forSno.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u6210\u7EE9\uFF1A");
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forGrade = new JTextField();
		forGrade.setFont(new Font("宋体", Font.PLAIN, 16));
		forGrade.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u7EE9\u70B9\uFF1A");
		lblNewLabel_12.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forPoint = new JTextField();
		forPoint.setFont(new Font("宋体", Font.PLAIN, 16));
		forPoint.setColumns(10);
		
		JButton submit_1 = new JButton("\u63D0\u4EA4");
		submit_1.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u63D0\u4EA4.png")));
		submit_1.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p3 = new GroupLayout(p3);
		gl_p3.setHorizontalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3.createSequentialGroup()
					.addGroup(gl_p3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p3.createSequentialGroup()
							.addGap(358)
							.addGroup(gl_p3.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel_12)
								.addComponent(lblNewLabel_11)
								.addComponent(forSno, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
								.addComponent(lblNewLabel_6)
								.addComponent(forGrade)
								.addComponent(forPoint)))
						.addGroup(gl_p3.createSequentialGroup()
							.addGap(374)
							.addComponent(submit_1, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(391, Short.MAX_VALUE))
		);
		gl_p3.setVerticalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3.createSequentialGroup()
					.addGap(106)
					.addComponent(lblNewLabel_6)
					.addGap(18)
					.addComponent(forSno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel_11)
					.addGap(28)
					.addComponent(forGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addComponent(lblNewLabel_12)
					.addGap(29)
					.addComponent(forPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addComponent(submit_1)
					.addContainerGap(84, Short.MAX_VALUE))
		);
		p3.setLayout(gl_p3);
		
		JPanel p4 = new JPanel();
		panel_1.add(p4, "delete");
		
		JLabel lblNewLabel_13 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u751F\u5B66\u53F7\uFF1A");
		lblNewLabel_13.setFont(new Font("宋体", Font.PLAIN, 16));
		
		firstId = new JTextField();
		firstId.setFont(new Font("宋体", Font.PLAIN, 16));
		firstId.setText("");
		firstId.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("\u8BF7\u518D\u6B21\u8F93\u5165\uFF1A");
		lblNewLabel_14.setFont(new Font("宋体", Font.PLAIN, 16));
		
		nextId = new JTextField();
		nextId.setFont(new Font("宋体", Font.PLAIN, 16));
		nextId.setText("");
		nextId.setColumns(10);
		
		JButton submit_2 = new JButton("\u63D0\u4EA4");
		submit_2.setIcon(new ImageIcon(TeacherAboutSelf.class.getResource("/images/\u63D0\u4EA4.png")));
		submit_2.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p4 = new GroupLayout(p4);
		gl_p4.setHorizontalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addGroup(gl_p4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p4.createSequentialGroup()
							.addGap(375)
							.addGroup(gl_p4.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(firstId, Alignment.LEADING)
								.addComponent(nextId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
								.addGroup(Alignment.LEADING, gl_p4.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_14)
									.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(gl_p4.createSequentialGroup()
							.addGap(392)
							.addComponent(submit_2)))
					.addContainerGap(372, Short.MAX_VALUE))
		);
		gl_p4.setVerticalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p4.createSequentialGroup()
					.addGap(97)
					.addComponent(lblNewLabel_13)
					.addGap(35)
					.addComponent(firstId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(lblNewLabel_14)
					.addGap(36)
					.addComponent(nextId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(56)
					.addComponent(submit_2)
					.addContainerGap(172, Short.MAX_VALUE))
		);
		p4.setLayout(gl_p4);
		
		JPanel p5 = new JPanel();
		panel_1.add(p5, "search");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_p5 = new GroupLayout(p5);
		gl_p5.setHorizontalGroup(
			gl_p5.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
		);
		gl_p5.setVerticalGroup(
			gl_p5.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u6210\u7EE9", "\u7EE9\u70B9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(107);
		table.getColumnModel().getColumn(1).setPreferredWidth(103);
		scrollPane.setViewportView(table);
		p5.setLayout(gl_p5);
		contentPane.setLayout(gl_contentPane);
		teacherUser.setText(teacher.gettname());
		id.setText(teacher.getId()+" ");
		name.setText(teacher.gettname());
		cno.setText(teacher.getcno()+" ");
		age.setText(teacher.gettage()+" ");
		protitle.setText(teacher.gettprotitle());
		
	showSelf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "show");
			}
		});
		
		updateSelf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "update");
			}
		});
		
		addGrade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		deleteGrade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "delete");
			}
		});
		
		updateGrade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		showGrade.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "search");
				setTable();
			}
		});
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int parse = Integer.parseInt(forCno.getText());
				teacher.setcno(parse);
				parse = Integer.parseInt(forAge.getText());
				teacher.settage(parse);
				teacher.settprotitle(forProtitle.getText());
				teacher.settpassword(forProtitle.getText());
				
				TeacherDao_Imp teacherDao_Imp = new TeacherDao_Imp();
				boolean flag = teacherDao_Imp.updateTeacher(teacher);
				if(flag) {
					JOptionPane.showMessageDialog(submit, "修改成功!");
				}else {
					JOptionPane.showMessageDialog(submit, "修改失败!");
				}						
			}
		});
		
		submit_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Grade grade = new Grade();
				grade.setCno(teacher.getcno());
				int parse = Integer.parseInt(forSno.getText());
				grade.setSno(parse);
				float parse1 = Float.parseFloat(forGrade.getText());
				grade.setGrade(parse1);
				parse1 = Float.parseFloat(forPoint.getText());
				grade.setPoint(parse1);
				
				TeacherDao_Imp teacherDao_Imp = new TeacherDao_Imp();
				Grade grade1 = teacherDao_Imp.selectGrade(parse, teacher.getcno());
				if(grade1!=null) {
					boolean flag = teacherDao_Imp.updateGrade(grade);
					if(flag) {
						JOptionPane.showMessageDialog(submit, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "修改失败!");
					}
				}else {
					boolean flag = teacherDao_Imp.insertGrade(grade);	
					if(flag) {
						JOptionPane.showMessageDialog(submit, "添加成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "添加失败!");
					}
				}
			}
		});
		
		submit_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
				int sno = Integer.parseInt(firstId.getText());
				if(firstId.getText().equals(nextId.getText())) {					
					boolean flag=managerDao_Imp.deleteGrade(sno,teacher.getcno());
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "删除成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "删除失败!请检查该成绩是否存在!");
					}
				}else {
					JOptionPane.showMessageDialog(submit_1, "删除失败!请检查两次输入是否相同!");
				}
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
		
	}
	
	private void setTable() {
		DefaultTableModel dft = (DefaultTableModel) table.getModel();
		dft.setRowCount(0);
		ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();		
		List<AllGrade> gradeList = managerDao_Imp.selectGrade(teacher.getcno());
		for (AllGrade ag : gradeList) {
			Vector v =new Vector();
			v.add(ag.getSno());
			v.add(ag.getSname());
			v.add(ag.getGrade());
			v.add(ag.getPoint());
			dft.addRow(v);
		}
	
	}

}
