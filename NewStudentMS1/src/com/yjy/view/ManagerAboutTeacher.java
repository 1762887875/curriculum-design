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
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.bean.Teacher;
import com.yjy.dao.imp.ManagerDao_Imp;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class ManagerAboutTeacher extends JFrame {

	private JPanel contentPane;
	private JTextField searchTeacher;
	private JTextField forId;
	private JTextField forName;
	private JTextField forAge;
	private JTextField forProtitle;
	private JTextField forCno;
	private JTextField forPassword;
	private JTextField firstId;
	private JTextField nextId;
	private JTable table;

	/**
	 * Create the frame.
	 */
	public ManagerAboutTeacher(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JButton addTeacher = new JButton("\u589E\u52A0\u8001\u5E08");
		addTeacher.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/icon_add.png")));
		addTeacher.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton deleteTeacher = new JButton("\u5220\u9664\u8001\u5E08");
		deleteTeacher.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/icon_delete.png")));
		deleteTeacher.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton updateTeacher = new JButton("\u4FEE\u6539\u8001\u5E08");
		updateTeacher.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/\u4FEE\u6539.png")));
		updateTeacher.setFont(new Font("宋体", Font.PLAIN, 16));
		
		searchTeacher = new JTextField();
		searchTeacher.setFont(new Font("宋体", Font.PLAIN, 16));
		searchTeacher.setColumns(10);
		
		JButton search = new JButton("\u67E5\u8BE2");
		search.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/search.png")));
		search.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton up = new JButton("\u56DE\u4E0A\u5C42");
		up.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/\u8FD4\u56DE\u4E0A\u5C42\u7EA7.png")));
		up.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(up)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(addTeacher)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(deleteTeacher)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(updateTeacher)
					.addGap(33)
					.addComponent(searchTeacher, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(search)
					.addContainerGap(93, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(searchTeacher, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(search)
						.addComponent(up)
						.addComponent(addTeacher)
						.addComponent(deleteTeacher)
						.addComponent(updateTeacher)))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 904, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 597, GroupLayout.PREFERRED_SIZE))
		);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel p2 = new JPanel();
		panel_1.add(p2, "delete");
		
		JLabel lblNewLabel_6 = new JLabel("\u8BF7\u8F93\u5165\u8981\u5220\u9664\u8001\u5E08\u7684ID\uFF1A");
		lblNewLabel_6.setFont(new Font("宋体", Font.PLAIN, 16));
		
		firstId = new JTextField();
		firstId.setFont(new Font("宋体", Font.PLAIN, 16));
		firstId.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\u8BF7\u518D\u6B21\u8F93\u5165\uFF1A");
		lblNewLabel_7.setFont(new Font("宋体", Font.PLAIN, 16));
		
		nextId = new JTextField();
		nextId.setFont(new Font("宋体", Font.PLAIN, 16));
		nextId.setColumns(10);
		
		JButton submit_1 = new JButton("\u63D0\u4EA4");
		submit_1.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/\u63D0\u4EA4.png")));
		submit_1.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(309)
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addComponent(submit_1, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_p2.createParallelGroup(Alignment.LEADING, false)
							.addComponent(lblNewLabel_7)
							.addComponent(firstId)
							.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(nextId)))
					.addContainerGap(419, Short.MAX_VALUE))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(76)
					.addComponent(lblNewLabel_6)
					.addGap(18)
					.addComponent(firstId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(lblNewLabel_7)
					.addGap(29)
					.addComponent(nextId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(42)
					.addComponent(submit_1)
					.addContainerGap(280, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		
		JPanel p3 = new JPanel();
		panel_1.add(p3, "search");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_p3 = new GroupLayout(p3);
		gl_p3.setHorizontalGroup(
			gl_p3.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
		);
		gl_p3.setVerticalGroup(
			gl_p3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p3.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 569, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "\u59D3\u540D", "\u5E74\u9F84", "\u804C\u79F0", "\u5E26\u8BFE\u53F7"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(110);
		table.getColumnModel().getColumn(1).setPreferredWidth(104);
		table.getColumnModel().getColumn(2).setPreferredWidth(63);
		table.getColumnModel().getColumn(3).setPreferredWidth(96);
		scrollPane.setViewportView(table);
		p3.setLayout(gl_p3);
		
		JPanel p1 = new JPanel();
		panel_1.add(p1, "add");
		
		JLabel lblNewLabel = new JLabel("\u5DE5\u53F7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_2 = new JLabel("\u5E74\u9F84");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_3 = new JLabel("\u804C\u79F0");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u8BFE\u53F7");
		lblNewLabel_4.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_5 = new JLabel("\u5BC6\u7801");
		lblNewLabel_5.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forId = new JTextField();
		forId.setFont(new Font("宋体", Font.PLAIN, 16));
		forId.setColumns(10);
		
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
		submit.setIcon(new ImageIcon(ManagerAboutTeacher.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_8 = new JLabel("\u5DE5\u53F7\u4E3A\u516D\u4F4D\u6570\uFF0C\u4E0D\u5F97\u51FA\u73B0\u5176\u4ED6\u7C7B\u578B\u5B57\u7B26");
		lblNewLabel_8.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_9 = new JLabel("\u59D3\u540D\u4E3A2~4\u4F4D\u6C49\u5B57\u62162~10\u4F4D\u82F1\u6587\u5B57\u7B26");
		lblNewLabel_9.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_10 = new JLabel("\u5E74\u9F84\u4E3A0~99\u5C81");
		lblNewLabel_10.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_11 = new JLabel("\u804C\u79F0\u5FC5\u987B\u4E3A\u8BB2\u5E08\uFF0C\u6559\u6388\uFF0C\u526F\u6559\u6388\u4E2D\u7684\u4E00\u79CD");
		lblNewLabel_11.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_12 = new JLabel("\u8BFE\u53F71~20\uFF0C\u5FC5\u987B\u4E0E\u5DF2\u6709\u8BFE\u7A0B\u76F8\u5BF9\u5E94");
		lblNewLabel_12.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_13 = new JLabel("\u5BC6\u7801\u6700\u591A16\u4F4D\uFF0C\u5141\u8BB8\u6570\u5B57\u5B57\u6BCD\u7B26\u53F7\u7EC4\u5408");
		lblNewLabel_13.setFont(new Font("黑体", Font.PLAIN, 14));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(194)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addGap(18)
									.addComponent(forCno))
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addGap(18)
									.addComponent(forProtitle))
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel_2)
									.addGap(18)
									.addComponent(forAge))
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(18)
									.addComponent(forName))
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(forId, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_p1.createSequentialGroup()
									.addComponent(lblNewLabel_5)
									.addGap(18)
									.addComponent(forPassword)))
							.addGap(35)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_9)
								.addComponent(lblNewLabel_10)
								.addComponent(lblNewLabel_11)
								.addComponent(lblNewLabel_12)
								.addComponent(lblNewLabel_13)))
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(256)
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(218, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(70)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(forId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_8))
					.addGap(32)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(forName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_9))
					.addGap(27)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(forAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10))
					.addGap(29)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(forProtitle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_11))
					.addGap(35)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(forCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_12))
					.addGap(32)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_5)
						.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
							.addComponent(forPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_13)))
					.addGap(39)
					.addComponent(submit)
					.addContainerGap(154, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		contentPane.setLayout(gl_contentPane);
		
		addTeacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		deleteTeacher.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "delete");
			}
		});
		
		updateTeacher.addActionListener(new ActionListener() {
			
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
				Teacher teacher =new Teacher();
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
				int parse = Integer.parseInt(forId.getText());
				teacher.setId(parse);
				Teacher teacher1 = managerDao_Imp.selectTeacher(parse);
				parse = Integer.parseInt(forAge.getText());
				teacher.settage(parse);
				parse = Integer.parseInt(forCno.getText());
				teacher.setcno(parse);
				teacher.settname(forName.getText());
				teacher.settpassword(forPassword.getText());
				teacher.settprotitle(forProtitle.getText());				
				if(teacher1!=null) {
					boolean flag = managerDao_Imp.updateTeacher(teacher);
					if(flag) {
						JOptionPane.showMessageDialog(submit, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "修改失败!");
					}
				}					
				else {
					boolean flag = managerDao_Imp.insertTeacher(teacher);	
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
				if(firstId.getText().equals(nextId.getText())) {
					ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
					int id = Integer.parseInt(firstId.getText());
					boolean flag=managerDao_Imp.deleteTeacher(id);
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "删除成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "删除失败!请检查该id是否存在!");
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
		List<Teacher> teacherList = managerDao_Imp.selectTeacher(searchTeacher.getText());
		for (Teacher teacher2 : teacherList) {
			Vector v =new Vector();
			v.add(teacher2.getId());
			v.add(teacher2.gettname());
			v.add(teacher2.gettage());
			v.add(teacher2.gettprotitle());
			v.add(teacher2.getcno());			
			dft.addRow(v);
		}
	}
}
