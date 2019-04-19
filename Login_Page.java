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
 * (用户登入页面)
 * 1、主题页面框架；
 * 2、页面相关组件；
 * 3、相应的后台组件，后台跳转，和获取；
 * @author Administrator
 *
 */
public class Login_Page extends JFrame {
//相关需要常量
	Font t = new Font("宋体", Font.PLAIN, 20);
	String s ="admin";
	String p = "admin";
	//构造方法
	public Login_Page(){
		//框架相关项
		this.setTitle("登入页面"+"         ——————"+"顾子布制作");
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//------------------------------------------------------
		//建立容器
		Container c = getContentPane();
		this.setLayout(null);
		//用户组件
		JLabel user = new JLabel("用户名：");
		user.setFont(t);
		user.setBounds(140, 60, 100, 35);
		c.add(user);
		
		final JTextField user_text = new JTextField();
		user_text.setFont(t);
		user_text.setBounds(215, 60, 200, 35);
		c.add(user_text);
		//秘钥组件
		JLabel password = new JLabel("秘钥：");
		password.setFont(t);
		password.setBounds(160, 120, 100, 35);
		c.add(password);
		
		final JPasswordField password_text  = new JPasswordField();
		password_text.setEchoChar('*');
		password_text.setFont(t);
		password_text.setBounds(215, 120, 200, 35);
		c.add(password_text);
		
		//登入按钮组件及后台验证且点击事件
		JButton login = new JButton("登入");
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
					//JOptionPane.showMessageDialog(null, "该账号不存在或者用户名、秘钥错误！");
				}
				if (password_text.getText().equals(p)) {
					JOptionPane.showMessageDialog(null, "登入成功！");
				}else{
					JOptionPane.showMessageDialog(null, "该账号不存在或者用户名、秘钥错误！");
				}
			}
		});
		
		
		//======================================
		//注册按钮组件及后台跳转
		JButton register = new JButton("注册");
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
