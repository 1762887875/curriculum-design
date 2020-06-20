package com.yjy.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.yjy.bean.Course;
import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;
import com.yjy.dao.imp.ManagerDao_Imp;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class ManagerAboutCourse extends JFrame {

	private JPanel contentPane;
	private JTextField searchCourse;
	private JTextField forCno;
	private JTextField forCname;
	private JTextField forCcredit;
	private JTextField firstCno;
	private JTextField secondCno;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public ManagerAboutCourse(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 928, 661);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
					.addGap(14))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 562, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel p1 = new JPanel();
		panel_1.add(p1, "add");
		
		JLabel lblNewLabel = new JLabel("\u8BFE\u7A0B\u53F7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forCno = new JTextField();
		forCno.setFont(new Font("宋体", Font.PLAIN, 16));
		forCno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFE\u7A0B\u540D");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forCname = new JTextField();
		forCname.setFont(new Font("宋体", Font.PLAIN, 16));
		forCname.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5B66\u5206");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forCcredit = new JTextField();
		forCcredit.setFont(new Font("宋体", Font.PLAIN, 16));
		forCcredit.setText("");
		forCcredit.setColumns(10);
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("\u8BFE\u7A0B\u53F70~20,\u4E0D\u53EF\u4E3A\u7A7A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u8BFE\u7A0B\u540D\u4E3A2~10\u4F4D\u6709\u6548\u6C49\u5B57");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("\u5B66\u5206\u4E3A0.5~10");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(220)
							.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addGap(27)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(forCname)
								.addComponent(forCno, GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
								.addComponent(forCcredit, Alignment.TRAILING))
							.addGap(55)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3)))
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(258)
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(339, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(84)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(forCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addGap(51)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(forCname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_4))
					.addGap(47)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(forCcredit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addGap(62)
					.addComponent(submit)
					.addContainerGap(219, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		
		JPanel p2 = new JPanel();
		panel_1.add(p2, "delete");
		
		JLabel lblNewLabel_6 = new JLabel("\u8BF7\u8F93\u5165\u8981\u5220\u9664\u7684\u8BFE\u7A0B\u53F7\uFF1A");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		firstCno = new JTextField();
		firstCno.setFont(new Font("宋体", Font.PLAIN, 16));
		firstCno.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u8BF7\u518D\u6B21\u8F93\u5165\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		secondCno = new JTextField();
		secondCno.setFont(new Font("宋体", Font.PLAIN, 16));
		secondCno.setText("");
		secondCno.setColumns(10);
		
		JButton submit_1 = new JButton("\u63D0\u4EA4");
		submit_1.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/\u63D0\u4EA4.png")));
		submit_1.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(311)
							.addGroup(gl_p2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(secondCno, Alignment.LEADING)
								.addComponent(lblNewLabel_7, Alignment.LEADING)
								.addComponent(firstCno, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
								.addComponent(lblNewLabel_6, Alignment.LEADING)))
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(332)
							.addComponent(submit_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(408, Short.MAX_VALUE))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(107)
					.addComponent(lblNewLabel_6)
					.addGap(35)
					.addComponent(firstCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(lblNewLabel_7)
					.addGap(43)
					.addComponent(secondCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(52)
					.addComponent(submit_1)
					.addContainerGap(171, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		
		JPanel p3 = new JPanel();
		panel_1.add(p3, "search");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_p3 = new GroupLayout(p3);
		gl_p3.setHorizontalGroup(
			gl_p3.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
		);
		gl_p3.setVerticalGroup(
			gl_p3.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u53F7", "\u8BFE\u7A0B\u540D", "\u5B66\u5206"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(97);
		table.getColumnModel().getColumn(1).setPreferredWidth(129);
		table.getColumnModel().getColumn(2).setPreferredWidth(89);
		scrollPane.setViewportView(table);
		p3.setLayout(gl_p3);
		
		JButton addCourse = new JButton("\u6DFB\u52A0\u8BFE\u7A0B");
		addCourse.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/icon_add.png")));
		addCourse.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton deleteCourse = new JButton("\u5220\u9664\u8BFE\u7A0B");
		deleteCourse.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/icon_delete.png")));
		deleteCourse.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton updateCourse = new JButton("\u66F4\u65B0\u8BFE\u7A0B");
		updateCourse.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/\u4FEE\u6539.png")));
		updateCourse.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton search = new JButton("\u67E5\u8BE2");
		search.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/search.png")));
		search.setFont(new Font("宋体", Font.PLAIN, 16));
		
		searchCourse = new JTextField();
		searchCourse.setFont(new Font("宋体", Font.PLAIN, 16));
		searchCourse.setColumns(10);
		
		JButton up = new JButton("\u56DE\u4E0A\u5C42");
		up.setIcon(new ImageIcon(ManagerAboutCourse.class.getResource("/images/\u8FD4\u56DE\u4E0A\u5C42\u7EA7.png")));
		up.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(up)
					.addGap(18)
					.addComponent(addCourse)
					.addGap(18)
					.addComponent(deleteCourse)
					.addGap(18)
					.addComponent(updateCourse)
					.addGap(32)
					.addComponent(searchCourse, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(search)
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(addCourse)
						.addComponent(deleteCourse)
						.addComponent(updateCourse)
						.addComponent(up)
						.addComponent(searchCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(search)))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
	addCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		deleteCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "delete");
			}
		});
		
		updateCourse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "search");
				setTable();
			}
		});
		
		up.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerIndex mgi =new ManagerIndex(manager);
				mgi.setVisible(true);
				dispose();
			}
		});
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Course course = new Course();
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
				int parse = Integer.parseInt(forCno.getText());
				course.setCno(parse);
				Course course1 = managerDao_Imp.selectCourse(parse);
				float parse1 = Float.parseFloat(forCcredit.getText());
				course.setCcredit(parse1);
				course.setCname(forCname.getText());
				if(course1!=null) {
					boolean flag = managerDao_Imp.updateCourse(course);
					if(flag) {
						JOptionPane.showMessageDialog(submit, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "修改失败!");
					}
				}					
				else {
					boolean flag = managerDao_Imp.insertCourse(course);	
					if(flag) {
						JOptionPane.showMessageDialog(submit, "添加成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "添加失败!");
					}
				}
				
			}
		});
		
		submit_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(firstCno.getText().equals(secondCno.getText())) {
					ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
					int cno = Integer.parseInt(firstCno.getText());
					boolean flag=managerDao_Imp.deleteCourse(cno);
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "删除成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "删除失败!请检查该课程是否存在!");
					}
				}else {
					JOptionPane.showMessageDialog(submit_1, "删除失败!请检查两次输入是否相同!");
				}
			}
		});
	}
	
	private void setTable() {
		DefaultTableModel dft = (DefaultTableModel) table.getModel();
		dft.setRowCount(0);
		ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
		List<Course> courseList = managerDao_Imp.selectCourse(searchCourse.getText());
		for (Course course2 : courseList) {
			Vector v =new Vector();
			v.add(course2.getCno());
			v.add(course2.getCname());
			v.add(course2.getCcredit());			
			dft.addRow(v);
		}
	
	}
}
