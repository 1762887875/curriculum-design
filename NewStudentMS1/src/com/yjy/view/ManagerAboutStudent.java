package com.yjy.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.yjy.bean.Manager;
import com.yjy.bean.Student;
import com.yjy.dao.imp.ManagerDao_Imp;
import com.yjy.dao.imp.StudentDao_Imp;

import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class ManagerAboutStudent extends JFrame {

	private JPanel contentPane;
	private JTextField searchText;
	private JTextField forId;
	private JTextField forName;
	private JTextField forAge;
	private JTextField forTel;
	private JTextField forSacademy;
	private JTextField forClass;
	private JTextField forAddress;
	private JTextField forPassword;
	private JTextField firstId;
	private JTextField secondId;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ManagerAboutStudent(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 938, 684);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		
		JButton add = new JButton("\u6DFB\u52A0");
		add.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/icon_add.png")));
		add.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton delete = new JButton("\u5220\u9664");
		delete.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/icon_delete.png")));
		delete.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton update = new JButton("\u4FEE\u6539");
		update.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/\u4FEE\u6539.png")));
		update.setFont(new Font("宋体", Font.PLAIN, 16));
		
		searchText = new JTextField();
		searchText.setFont(new Font("宋体", Font.PLAIN, 16));
		searchText.setColumns(10);
		
		JButton search = new JButton("\u67E5\u8BE2");
		search.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/search.png")));
		search.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JPanel p1 =new JPanel();
		
		JPanel p2 =new JPanel();
		
		JPanel p4 =new JPanel();
		
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout());
		panel_1.add(p1, "button");
		
		JLabel id = new JLabel("\u5B66\u53F7");
		id.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forId = new JTextField();
		forId.setColumns(10);
		
		JLabel sname = new JLabel("\u59D3\u540D");
		sname.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forName = new JTextField();
		forName.setColumns(10);
		
		JLabel ssex = new JLabel("\u6027\u522B");
		ssex.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JRadioButton isMan = new JRadioButton("\u7537");
		
		JRadioButton isWoman = new JRadioButton("\u5973");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		
		buttonGroup.add(isWoman);
		
		buttonGroup.add(isMan);
		
		JLabel sage = new JLabel("\u5E74\u9F84");
		sage.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forAge = new JTextField();
		forAge.setColumns(10);
		
		JLabel stel = new JLabel("\u7535\u8BDD");
		stel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forTel = new JTextField();
		forTel.setColumns(10);
		
		JLabel sacademy = new JLabel("\u5B66\u9662");
		sacademy.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forSacademy = new JTextField();
		forSacademy.setText("");
		forSacademy.setColumns(10);
		
		JLabel sclass = new JLabel("\u73ED\u7EA7");
		sclass.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forClass = new JTextField();
		forClass.setColumns(10);
		
		JLabel saddress = new JLabel("\u5730\u5740");
		saddress.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forAddress = new JTextField();
		forAddress.setText("");
		forAddress.setColumns(10);
		
		JLabel spassword = new JLabel("\u5BC6\u7801");
		spassword.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forPassword = new JTextField();
		forPassword.setText("");
		forPassword.setColumns(10);
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("\u5B66\u53F7\u4E3A10\u4F4D\u6570\uFF0C\u524D\u56DB\u4F4D\u4E3A\u5165\u5B66\u5E74\u4EFD");
		lblNewLabel.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D2~4\u4F4D\u6C49\u5B57\uFF0C\u62163~10\u4F4D\u82F1\u6587");
		lblNewLabel_1.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_2 = new JLabel("\u6027\u522B\u5FC5\u987B\u9009\u62E9\u4E3A\u7537\u6216\u5973");
		lblNewLabel_2.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_3 = new JLabel("\u5E74\u9F84\u4E3A0~99");
		lblNewLabel_3.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_4 = new JLabel("\u7535\u8BDD\u4F4D\u6570\u4E3A11\u4F4D");
		lblNewLabel_4.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5 = new JLabel("\u5B66\u9662\u5FC5\u987B\u9009\u62E9\u8BA1\u7B97\u673A\u5B66\u9662\u6216\u7406\u5B66\u9662");
		lblNewLabel_5.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_6 = new JLabel("\u73ED\u7EA7\u4E3A\u8BA1\u79D11801\u73ED\uFF0C\u6216\u8BA1\u79D11802\u73ED\uFF0C\u6216\u8F6F\u5DE51801\u73ED");
		lblNewLabel_6.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_7 = new JLabel("\u5730\u5740\u5199\u6E05\u7701\u5E02\uFF0C\u5177\u4F53\u5230\u53BF");
		lblNewLabel_7.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_8 = new JLabel("\u5BC6\u7801\u6700\u591A16\u4F4D\uFF0C\u6CE8\u610F\u533A\u5206\u5927\u5C0F\u5199");
		lblNewLabel_8.setFont(new Font("黑体", Font.PLAIN, 14));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(101)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addComponent(id)
						.addComponent(sname)
						.addComponent(sage)
						.addComponent(ssex)
						.addComponent(stel)
						.addComponent(sacademy)
						.addComponent(sclass)
						.addComponent(saddress)
						.addComponent(spassword))
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(40)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
								.addComponent(forName, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
								.addComponent(forId, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
								.addComponent(forAge, 166, 166, 166)
								.addComponent(forTel, 166, 166, 166)
								.addComponent(forSacademy, 166, 166, 166)
								.addComponent(forClass, 166, 166, 166)
								.addComponent(forAddress, 166, 166, 166)
								.addComponent(forPassword, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
							.addGap(63))
						.addGroup(Alignment.TRAILING, gl_p1.createSequentialGroup()
							.addGap(65)
							.addComponent(isMan)
							.addGap(29)
							.addComponent(isWoman)
							.addGap(89)))
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_8)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_4)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_7))
					.addGap(171))
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(150)
					.addComponent(submit, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(588, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(forId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(id))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(forName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sname))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p1.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(21)
							.addComponent(lblNewLabel_3))
						.addGroup(gl_p1.createSequentialGroup()
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
									.addComponent(isWoman)
									.addComponent(isMan))
								.addComponent(ssex))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
								.addComponent(forAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(sage))))
					.addGap(21)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(forTel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(stel))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_5)
						.addComponent(forSacademy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sacademy))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(forClass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(sclass))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_7)
						.addComponent(forAddress, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(saddress))
					.addGap(18)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_8)
						.addComponent(forPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(spassword))
					.addGap(35)
					.addComponent(submit)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		panel_1.add(p2, "text");
		
		JLabel lblNewLabel_9 = new JLabel("\u8F93\u5165\u8981\u5220\u9664\u5B66\u751F\u7684\u5B66\u53F7\uFF1A");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 16));
		
		firstId = new JTextField();
		firstId.setFont(new Font("宋体", Font.PLAIN, 16));
		firstId.setText("");
		firstId.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\u518D\u6B21\u8F93\u5165\u5B66\u751F\u5B66\u53F7\uFF1A");
		lblNewLabel_10.setFont(new Font("宋体", Font.PLAIN, 16));
		
		secondId = new JTextField();
		secondId.setFont(new Font("宋体", Font.PLAIN, 16));
		secondId.setText("");
		secondId.setColumns(10);
		
		JButton submit_1 = new JButton("\u63D0\u4EA4");
		submit_1.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_p2 = new GroupLayout(p2);
		gl_p2.setHorizontalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(313)
							.addGroup(gl_p2.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_10)
								.addComponent(lblNewLabel_9)
								.addGroup(gl_p2.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(secondId, Alignment.LEADING)
									.addComponent(firstId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))))
						.addGroup(gl_p2.createSequentialGroup()
							.addGap(326)
							.addComponent(submit_1, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(404, Short.MAX_VALUE))
		);
		gl_p2.setVerticalGroup(
			gl_p2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p2.createSequentialGroup()
					.addGap(58)
					.addComponent(lblNewLabel_9)
					.addGap(27)
					.addComponent(firstId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(lblNewLabel_10)
					.addGap(32)
					.addComponent(secondId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(57)
					.addComponent(submit_1)
					.addContainerGap(186, Short.MAX_VALUE))
		);
		p2.setLayout(gl_p2);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(18)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(77, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(157))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(31)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(43)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(23, Short.MAX_VALUE))
		);
		
		JButton up = new JButton("\u56DE\u4E0A\u5C42");
		up.setIcon(new ImageIcon(ManagerAboutStudent.class.getResource("/images/\u8FD4\u56DE\u4E0A\u5C42\u7EA7.png")));
		up.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(4)
					.addComponent(up)
					.addGap(18)
					.addComponent(add)
					.addGap(18)
					.addComponent(delete)
					.addGap(18)
					.addComponent(update)
					.addGap(18)
					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(search)
					.addGap(25))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(search)
						.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(update)
						.addComponent(delete)
						.addComponent(add)
						.addComponent(up)))
		);
				
		panel_1.add(p4, "grades");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_p4 = new GroupLayout(p4);
		gl_p4.setHorizontalGroup(
			gl_p4.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
		);
		gl_p4.setVerticalGroup(
			gl_p4.createParallelGroup(Alignment.TRAILING)
				.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "\u59D3\u540D", "\u6027\u522B", "\u5E74\u9F84", "\u7535\u8BDD", "\u5B66\u9662", "\u73ED\u7EA7", "\u5730\u5740"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(115);
		table.getColumnModel().getColumn(2).setPreferredWidth(55);
		table.getColumnModel().getColumn(3).setPreferredWidth(57);
		table.getColumnModel().getColumn(4).setPreferredWidth(127);
		table.getColumnModel().getColumn(5).setPreferredWidth(105);
		table.getColumnModel().getColumn(6).setPreferredWidth(83);
		table.getColumnModel().getColumn(7).setPreferredWidth(104);
		scrollPane.setViewportView(table);
		p4.setLayout(gl_p4);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		
		
		
		add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "button");
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "text");
			}
		});
		
		update.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "button");
			}
		});
		
		search.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "grades");
				
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
				Student student =new Student();
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
				int parse = Integer.parseInt(forId.getText());
				student.setId(parse);
				Student student1 = managerDao_Imp.selectStudent(parse);
				parse = Integer.parseInt(forAge.getText());
				student.setsage(parse);
				student.setsacademy(forSacademy.getText());
				student.setsaddress(forAddress.getText());
				student.setsclass(forClass.getText());
				student.setsname(forName.getText());
				student.setspassword(forPassword.getText());
				student.setstel(forTel.getText());
				if(isMan.isSelected())
					student.setssex("男");
				if(isWoman.isSelected())
					student.setssex("女");
				if(student1!=null) {
					boolean flag = managerDao_Imp.updateStudent(student);
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "修改失败!");
					}
				}					
				else {
					boolean flag = managerDao_Imp.insertStudent(student);	
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "添加成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "添加失败!");
					}
				}
				
			}
		});
		
		submit_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(firstId.getText().equals(secondId.getText())) {
					ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
					int id = Integer.parseInt(firstId.getText());
					boolean flag=managerDao_Imp.deleteStudent(id);
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
		List<Student> studentList = managerDao_Imp.selectStudent(searchText.getText());
		for (Student student2 : studentList) {
			Vector v =new Vector();
			v.add(student2.getId());
			v.add(student2.getsname());
			v.add(student2.getssex());
			v.add(student2.getsage());
			v.add(student2.getstel());
			v.add(student2.getsacademy());
			v.add(student2.getsclass());
			v.add(student2.getsaddress());
			dft.addRow(v);
		}
	}
}
