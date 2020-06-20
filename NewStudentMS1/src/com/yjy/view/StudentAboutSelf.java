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
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Student;
import com.yjy.dao.imp.ManagerDao_Imp;
import com.yjy.dao.imp.StudentDao_Imp;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class StudentAboutSelf extends JFrame {

	private JPanel contentPane;
	private JTextField forName;
	private JTextField forAge;
	private JTextField forTel;
	private JTextField forAcadamy;
	private JTextField forClass;
	private JTextField forAddress;
	private JTextField forPassword;
	private Student student;
	private JTable table;
	
	/**
	 * Create the frame.
	 */
	public StudentAboutSelf(Student student) {
		this.student = student;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 935, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 907, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 907, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel p1 = new JPanel();
		panel_1.add(p1, "display");
		
		JLabel lblNewLabel_1 = new JLabel("\u5B66\u53F7\uFF1A");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D\uFF1A");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("\u6027\u522B\uFF1A");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u5E74\u9F84\uFF1A");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("\u7535\u8BDD\uFF1A");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_6 = new JLabel("\u5B66\u9662\uFF1A");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_7 = new JLabel("\u73ED\u7EA7\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_8 = new JLabel("\u5730\u5740\uFF1A");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel id = new JLabel("New label");
		id.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel name = new JLabel("New label");
		name.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel sex = new JLabel("New label");
		sex.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel age = new JLabel("New label");
		age.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel tel = new JLabel("New label");
		tel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel acadamy = new JLabel("New label");
		acadamy.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel clazz = new JLabel("New label");
		clazz.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel address = new JLabel("New label");
		address.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(119)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1))
					.addGap(37)
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addComponent(id)
						.addComponent(name)
						.addComponent(sex)
						.addComponent(age)
						.addComponent(tel)
						.addComponent(acadamy)
						.addComponent(clazz)
						.addComponent(address))
					.addContainerGap(634, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(89)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(id))
					.addGap(27)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(name))
					.addGap(30)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(sex))
					.addGap(26)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(age))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(tel))
					.addGap(26)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(acadamy))
					.addGap(27)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(clazz))
					.addGap(27)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(address))
					.addContainerGap(98, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		
		JPanel p2 = new JPanel();
		panel_1.add(p2, "update");
		
		JLabel lblNewLabel_9 = new JLabel("\u59D3\u540D");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forName = new JTextField();
		forName.setFont(new Font("宋体", Font.PLAIN, 16));
		forName.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u5E74\u9F84");
		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forAge = new JTextField();
		forAge.setFont(new Font("宋体", Font.PLAIN, 16));
		forAge.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("\u6027\u522B");
		lblNewLabel_11.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_12 = new JLabel("\u7535\u8BDD");
		lblNewLabel_12.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_13 = new JLabel("\u5B66\u9662");
		lblNewLabel_13.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_14 = new JLabel("\u73ED\u7EA7");
		lblNewLabel_14.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_15 = new JLabel("\u5730\u5740");
		lblNewLabel_15.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel 密码 = new JLabel("\u5BC6\u7801");
		密码.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forTel = new JTextField();
		forTel.setFont(new Font("宋体", Font.PLAIN, 16));
		forTel.setColumns(10);
		
		forAcadamy = new JTextField();
		forAcadamy.setFont(new Font("宋体", Font.PLAIN, 16));
		forAcadamy.setColumns(10);
		
		forClass = new JTextField();
		forClass.setFont(new Font("宋体", Font.PLAIN, 16));
		forClass.setColumns(10);
		
		forAddress = new JTextField();
		forAddress.setFont(new Font("宋体", Font.PLAIN, 16));
		forAddress.setColumns(10);
		
		forPassword = new JTextField();
		forPassword.setFont(new Font("宋体", Font.PLAIN, 16));
		forPassword.setColumns(10);
		
		JRadioButton isMan = new JRadioButton("\u7537");
		
		JRadioButton isWoman = new JRadioButton("\u5973");
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(StudentAboutSelf.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(157)
							.addGroup(gl_p2.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_13)
								.addComponent(lblNewLabel_11)
								.addComponent(lblNewLabel_10)
								.addComponent(lblNewLabel_9)
								.addComponent(lblNewLabel_12)
								.addComponent(密码)
								.addComponent(lblNewLabel_15)
								.addComponent(lblNewLabel_14))
							.addGap(18)
							.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_p2.createParallelGroup(Alignment.LEADING, false)
									.addComponent(forPassword)
									.addComponent(forAddress)
									.addComponent(forClass)
									.addComponent(forAcadamy)
									.addComponent(forTel)
									.addComponent(forAge)
									.addComponent(forName, GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
								.addGroup(gl_p2.createSequentialGroup()
									.addComponent(isMan)
									.addGap(37)
									.addComponent(isWoman))))
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(197)
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(537, Short.MAX_VALUE))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(38)
					.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_9)
						.addComponent(forName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_10)
						.addComponent(forAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_11)
							.addComponent(isMan)
							.addComponent(isWoman))
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(42)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_12))))
					.addGap(18)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_13)
						.addGroup(gl_p2.createSequentialGroup()
							.addComponent(forAcadamy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forClass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_14))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_15))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_p2.createParallelGroup(Alignment.BASELINE)
								.addComponent(forPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(密码))))
					.addGap(32)
					.addComponent(submit)
					.addContainerGap(98, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		
		JPanel p3 = new JPanel();
		panel_1.add(p3, "search");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_p3 = new GroupLayout(p3);
		gl_p3.setHorizontalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
		);
		gl_p3.setVerticalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u8BFE\u7A0B\u53F7", "\u8BFE\u7A0B\u540D", "\u4EE3\u8BFE\u8001\u5E08", "\u6210\u7EE9", "\u7EE9\u70B9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(126);
		table.getColumnModel().getColumn(2).setPreferredWidth(102);
		table.getColumnModel().getColumn(3).setPreferredWidth(79);
		table.getColumnModel().getColumn(4).setPreferredWidth(79);
		scrollPane.setViewportView(table);
		p3.setLayout(gl_p3);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u60A8\uFF01");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 18));
		
		JLabel studentUser = new JLabel("\u5B66\u751F");
		studentUser.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton display = new JButton("\u67E5\u770B\u6211\u7684\u4FE1\u606F");
		display.setIcon(new ImageIcon(StudentAboutSelf.class.getResource("/images/\u4FE1\u606F.png")));
		display.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton update = new JButton("\u4FEE\u6539\u6211\u7684\u4FE1\u606F");
		update.setIcon(new ImageIcon(StudentAboutSelf.class.getResource("/images/\u4FEE\u6539.png")));
		update.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton search = new JButton("\u67E5\u770B\u6211\u7684\u6210\u7EE9");
		search.setIcon(new ImageIcon(StudentAboutSelf.class.getResource("/images/\u6210\u7EE9.png")));
		search.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton exit = new JButton("");
		exit.setIcon(new ImageIcon(StudentAboutSelf.class.getResource("/images/\u9000\u51FA\u767B\u5F55.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(67)
					.addComponent(studentUser)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel)
					.addGap(52)
					.addComponent(display)
					.addGap(26)
					.addComponent(update)
					.addGap(28)
					.addComponent(search)
					.addPreferredGap(ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
					.addComponent(exit)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(23, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(exit)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel)
							.addComponent(studentUser)
							.addComponent(display)
							.addComponent(update)
							.addComponent(search)))
					.addGap(30))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		studentUser.setText(student.getsname());
		id.setText(student.getId()+" ");
		name.setText(student.getsname());
		acadamy.setText(student.getsacademy());
		address.setText(student.getsaddress());
		clazz.setText(student.getsclass());
		sex.setText(student.getssex());
		tel.setText(student.getstel());
		age.setText(student.getsage()+" ");
		
		
	display.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "display");
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "update");
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
		
		submit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int parse = Integer.parseInt(forAge.getText());
				student.setsage(parse);
				student.setsacademy(forAcadamy.getText());
				student.setsaddress(forAddress.getText());
				student.setsclass(forClass.getText());
				student.setsname(forName.getText());
				student.setspassword(forPassword.getText());
				student.setstel(forTel.getText());
				if(isMan.isSelected())
					student.setssex("男");
				if(isWoman.isSelected())
					student.setssex("女");
					
					StudentDao_Imp studentDao_Imp = new StudentDao_Imp();
					boolean flag = studentDao_Imp.updateStudent(student);
					if(flag) {
						JOptionPane.showMessageDialog(submit, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "修改失败!");
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
		List<AllGrade> gradeList = managerDao_Imp.selectGrade(student.getId());
		for (AllGrade ag : gradeList) {
			Vector v =new Vector();
			v.add(ag.getCno());
			v.add(ag.getCname());
			v.add(ag.getTname());
			v.add(ag.getGrade());
			v.add(ag.getPoint());
			dft.addRow(v);
		}
	
	}
}
