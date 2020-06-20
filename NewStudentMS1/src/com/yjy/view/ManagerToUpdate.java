package com.yjy.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.yjy.bean.Manager;
import com.yjy.dao.imp.ManagerDao_Imp;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ManagerToUpdate extends JFrame {

	private JPanel contentPane;
	private JPasswordField oldPassword;
	private JPasswordField newPassword;

	/**
	 * Create the frame.
	 */
	public ManagerToUpdate(Manager manager) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 774, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u8FD9\u91CC\u662F\u7BA1\u7406\u5458\u4FEE\u6539\u5BC6\u7801\u754C\u9762");
		lblNewLabel.setFont(new Font("隶书", Font.PLAIN, 26));
		
		JLabel label = new JLabel("\u539F\u5BC6\u7801");
		label.setIcon(new ImageIcon(ManagerToUpdate.class.getResource("/images/lock.png")));
		
		oldPassword = new JPasswordField();
		
		newPassword = new JPasswordField();
		
		JLabel lblNewLabel_1 = new JLabel("\u65B0\u5BC6\u7801");
		lblNewLabel_1.setIcon(new ImageIcon(ManagerToUpdate.class.getResource("/images/lock.png")));
		
		JButton submit = new JButton("\u63D0\u4EA4");
		submit.setIcon(new ImageIcon(ManagerToUpdate.class.getResource("/images/\u63D0\u4EA4.png")));
		
		JButton exit = new JButton("");
		exit.setIcon(new ImageIcon(ManagerToUpdate.class.getResource("/images/\u9000\u51FA\u767B\u5F55.png")));
		
		JButton up = new JButton("");
		up.setIcon(new ImageIcon(ManagerToUpdate.class.getResource("/images/\u8FD4\u56DE\u4E0A\u5C42\u7EA7.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(206)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
								.addComponent(up))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(exit))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(label)
								.addComponent(lblNewLabel_1))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(submit)
								.addComponent(newPassword, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)
								.addComponent(oldPassword, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(exit, Alignment.TRAILING)
						.addComponent(up, Alignment.TRAILING))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(102)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(label)
								.addComponent(oldPassword, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(newPassword, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_1))
							.addGap(60)
							.addComponent(submit)))
					.addContainerGap(105, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
	exit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				HomeWindow hw = new HomeWindow();
				dispose();
			}
		});
	
	submit.addActionListener(new ActionListener() {
		
		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(manager.getPassword().equals(oldPassword.getText())) {
				manager.setPassword(newPassword.getText());
				ManagerDao_Imp managerDao_Imp = new ManagerDao_Imp();
				boolean flag = managerDao_Imp.updateManager(manager);
				if(flag) {
					JOptionPane.showMessageDialog(submit, "密码修改成功，请重新登陆！");
					HomeWindow hw = new HomeWindow();
					dispose();
				}else {
					JOptionPane.showMessageDialog(submit, "密码修改失败，请再试一次！");
				}
			}else {
					JOptionPane.showMessageDialog(submit, "密码修改失败，请输入正确的原密码！");
			}
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
	}
}
