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
import javax.swing.BoxLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.yjy.bean.AllGrade;
import com.yjy.bean.Course;
import com.yjy.bean.Grade;
import com.yjy.bean.Manager;
import com.yjy.dao.imp.ManagerDao_Imp;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;

public class ManagerAboutGrade extends JFrame {

	private JPanel contentPane;
	private JTextField searchText;
	private JTextField forSno;
	private JTextField forCno;
	private JTextField forGrade;
	private JTextField forPoint;
	private JTextField first;
	private JTextField next;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public ManagerAboutGrade(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 919, 667);
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
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 891, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 891, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 571, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		
		JButton up = new JButton("\u56DE\u4E0A\u5C42");
		up.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/\u8FD4\u56DE\u4E0A\u5C42\u7EA7.png")));
		up.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton add = new JButton("\u6DFB\u52A0\u6210\u7EE9");
		add.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/icon_add.png")));
		add.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton delete = new JButton("\u5220\u9664\u6210\u7EE9");
		delete.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/icon_delete.png")));
		delete.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JButton update = new JButton("\u4FEE\u6539\u6210\u7EE9");
		update.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/\u4FEE\u6539.png")));
		update.setFont(new Font("宋体", Font.PLAIN, 16));
		
		searchText = new JTextField();
		searchText.setFont(new Font("宋体", Font.PLAIN, 16));
		searchText.setColumns(10);
		
		JButton search = new JButton("\u67E5\u8BE2");
		search.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/search.png")));
		search.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(up)
					.addGap(32)
					.addComponent(add)
					.addGap(31)
					.addComponent(delete)
					.addGap(32)
					.addComponent(update)
					.addGap(36)
					.addComponent(searchText, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(search)
					.addContainerGap(37, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(up)
						.addComponent(add)
						.addComponent(delete)
						.addComponent(update)
						.addComponent(searchText, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(search))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel p1 = new JPanel();
		panel_1.add(p1, "add");
		
		JLabel lblNewLabel = new JLabel("\u5B66\u53F7");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forSno = new JTextField();
		forSno.setFont(new Font("宋体", Font.PLAIN, 16));
		forSno.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFE\u7A0B\u53F7");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forCno = new JTextField();
		forCno.setFont(new Font("宋体", Font.PLAIN, 16));
		forCno.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u6210\u7EE9");
		lblNewLabel_2.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forGrade = new JTextField();
		forGrade.setFont(new Font("宋体", Font.PLAIN, 16));
		forGrade.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u7EE9\u70B9");
		lblNewLabel_3.setFont(new Font("宋体", Font.PLAIN, 16));
		
		forPoint = new JTextField();
		forPoint.setFont(new Font("宋体", Font.PLAIN, 16));
		forPoint.setColumns(10);
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/\u63D0\u4EA4.png")));
		submit.setFont(new Font("宋体", Font.PLAIN, 16));
		
		JLabel lblNewLabel_4 = new JLabel("\u5B66\u53F7\u5FC5\u987B\u4E0E\u5B66\u751F\u4FE1\u606F\u76F8\u5BF9\u5E94");
		lblNewLabel_4.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_5 = new JLabel("\u8BFE\u7A0B\u53F7\u5FC5\u987B\u4E0E\u8BFE\u7A0B\u4FE1\u606F\u76F8\u5BF9\u5E94");
		lblNewLabel_5.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_6 = new JLabel("\u6210\u7EE9\u4E3A0~100");
		lblNewLabel_6.setFont(new Font("黑体", Font.PLAIN, 14));
		
		JLabel lblNewLabel_7 = new JLabel("\u7EE9\u70B9\u6839\u636E\u6210\u7EE9\u6765\u7B97\uFF0C100\u5206\u4E3A5\u7EE9\u70B9\uFF0C\u51CF\u4E00\u5206\u5C110.1");
		lblNewLabel_7.setFont(new Font("黑体", Font.PLAIN, 14));
		GroupLayout gl_p1 = new GroupLayout(p1);
		gl_p1.setHorizontalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(127)
							.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel))
							.addGap(37)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING, false)
								.addComponent(forPoint)
								.addComponent(forGrade)
								.addComponent(forCno)
								.addComponent(forSno, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
							.addGap(50)
							.addGroup(gl_p1.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_4)))
						.addGroup(gl_p1.createSequentialGroup()
							.addGap(232)
							.addComponent(submit, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_p1.setVerticalGroup(
			gl_p1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_p1.createSequentialGroup()
					.addGap(98)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
							.addComponent(forSno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_4))
						.addComponent(lblNewLabel))
					.addGap(37)
					.addGroup(gl_p1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1)
						.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
							.addComponent(forCno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_5)))
					.addGap(42)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(forGrade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_6))
					.addGap(36)
					.addGroup(gl_p1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(forPoint, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_7))
					.addGap(56)
					.addComponent(submit)
					.addContainerGap(173, Short.MAX_VALUE))
		);
		p1.setLayout(gl_p1);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "delete");
		
		JLabel lblNewLabel_8 = new JLabel("\u8BF7\u8F93\u5165\u5B66\u53F7\uFF1A");
		lblNewLabel_8.setFont(new Font("宋体", Font.PLAIN, 16));
		
		first = new JTextField();
		first.setFont(new Font("宋体", Font.PLAIN, 16));
		first.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("\u8BF7\u8F93\u5165\u8BFE\u7A0B\u53F7\uFF1A");
		lblNewLabel_9.setFont(new Font("宋体", Font.PLAIN, 16));
		
		next = new JTextField();
		next.setFont(new Font("宋体", Font.PLAIN, 16));
		next.setColumns(10);
		
		JButton submit_1 = new JButton("\u63D0\u4EA4");
		submit_1.setIcon(new ImageIcon(ManagerAboutGrade.class.getResource("/images/\u63D0\u4EA4.png")));
		submit_1.setFont(new Font("宋体", Font.PLAIN, 16));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(308)
							.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(next, Alignment.LEADING)
								.addComponent(lblNewLabel_9, Alignment.LEADING)
								.addComponent(first, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
								.addComponent(lblNewLabel_8, Alignment.LEADING)))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(340)
							.addComponent(submit_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(388, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(109)
					.addComponent(lblNewLabel_8)
					.addGap(35)
					.addComponent(first, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(lblNewLabel_9)
					.addGap(38)
					.addComponent(next, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(55)
					.addComponent(submit_1)
					.addContainerGap(181, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "search");
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setFont(new Font("宋体", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5B66\u53F7", "\u59D3\u540D", "\u8BFE\u7A0B\u53F7", "\u8BFE\u7A0B\u540D", "\u4EE3\u8BFE\u8001\u5E08", "\u6210\u7EE9", "\u7EE9\u70B9"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(127);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.getColumnModel().getColumn(2).setPreferredWidth(82);
		table.getColumnModel().getColumn(3).setPreferredWidth(112);
		table.getColumnModel().getColumn(4).setPreferredWidth(105);
		table.getColumnModel().getColumn(5).setPreferredWidth(68);
		table.getColumnModel().getColumn(6).setPreferredWidth(70);
		scrollPane.setViewportView(table);
		panel_3.setLayout(gl_panel_3);
		contentPane.setLayout(gl_contentPane);
		
	add.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "add");
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				CardLayout cardLayout= (CardLayout)panel_1.getLayout();
				cardLayout.show(panel_1, "delete");
			}
		});
		
		update.addActionListener(new ActionListener() {
			
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
				Grade grade = new Grade();
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();				
				int parse = Integer.parseInt(forCno.getText());
				grade.setCno(parse);
				int parse0 = Integer.parseInt(forSno.getText());
				grade.setSno(parse0);
				Grade grade1 = managerDao_Imp.selectGrade(parse0,parse);
				float parse1 = Float.parseFloat(forGrade.getText());
				grade.setGrade(parse1);
				float parse2 = Float.parseFloat(forPoint.getText());
				grade.setPoint(parse2);
				if(grade1!=null) {
					boolean flag = managerDao_Imp.updateGrade(grade);
					if(flag) {
						JOptionPane.showMessageDialog(submit, "修改成功!");
					}else {
						JOptionPane.showMessageDialog(submit, "修改失败!");
					}
				}					
				else {
					boolean flag = managerDao_Imp.insertGrade(grade);	
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
					ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
					int sno = Integer.parseInt(first.getText());
					int cno = Integer.parseInt(next.getText());
					boolean flag=managerDao_Imp.deleteGrade(sno,cno);
					if(flag) {
						JOptionPane.showMessageDialog(submit_1, "删除成功!");
					}else {
						JOptionPane.showMessageDialog(submit_1, "删除失败!请检查该成绩是否存在!");
					}
				}			
		});
	}
	
	private void setTable() {
		DefaultTableModel dft = (DefaultTableModel) table.getModel();
		dft.setRowCount(0);
		ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
		int parse;  
		if(searchText.getText().isEmpty()) {
			parse = -1;
		}else {
			parse=Integer.parseInt(searchText.getText());
		}
		List<AllGrade> gradeList = managerDao_Imp.selectGrade(parse);
		for (AllGrade ag : gradeList) {
			Vector v =new Vector();
			v.add(ag.getSno());
			v.add(ag.getSname());
			v.add(ag.getCno());
			v.add(ag.getCname());
			v.add(ag.getTname());
			v.add(ag.getGrade());
			v.add(ag.getPoint());
			dft.addRow(v);
		}
	
	}

}
