package Loading;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeOperationsException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

/**
 * (�û�����ҳ��)
 * 1������ҳ���ܣ�
 * 2��ҳ����������
 * 3����Ӧ�ĺ�̨�������̨��ת���ͻ�ȡ��
 * @author Administrator
 *
 */
public class Login_Page extends JFrame {
//�����Ҫ����
	Font t = new Font("����", Font.PLAIN, 20);
	String s ="admin";
	String p = "admin";
	//���췽��
	public Login_Page(){
		//��������
		this.setTitle("����ҳ��"+"         ������������"+"���Ӳ�����");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//------------------------------------------------------
		//��������
		Container c = getContentPane();
		this.setLayout(null);
		//�û����
		JLabel user = new JLabel("�û�����");
		user.setFont(t);
		user.setBounds(140, 60, 100, 35);
		c.add(user);
		
		final JTextField user_text = new JTextField();
		user_text.setFont(t);
		user_text.setBounds(215, 60, 200, 35);
		c.add(user_text);
		//��Կ���
		JLabel password = new JLabel("��Կ��");
		password.setFont(t);
		password.setBounds(160, 120, 100, 35);
		c.add(password);
		
		final JPasswordField password_text  = new JPasswordField();
		password_text.setEchoChar('*');
		password_text.setFont(t);
		password_text.setBounds(215, 120, 200, 35);
		c.add(password_text);
		
		//���밴ť�������̨��֤�ҵ���¼�
		JButton login = new JButton("����");
		login.setFont(t);
		login.setBounds(230, 220, 150, 50);
		c.add(login);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String s=Registers_Page.user_text.getText();
				String p=Registers_Page.password_text.getText();
				
				if (user_text.getText().equals(s)) {
					
				}else {
					//JOptionPane.showMessageDialog(null, "���˺Ų����ڻ����û�������Կ����");
				}
				if (password_text.getText().equals(p)) {
					JOptionPane.showMessageDialog(null, "����ɹ���");
				}else{
					JOptionPane.showMessageDialog(null, "���˺Ų����ڻ����û�������Կ����");
				}
			}
		});
		
		
		//======================================
		//ע�ᰴť�������̨��ת
		JButton register = new JButton("ע��");
		register.setFont(t);
		register.setBounds(230, 280, 150, 50);
		c.add(register);
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Registers_Page();
				
			}
		});
		
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Login_Page();
	}
}
