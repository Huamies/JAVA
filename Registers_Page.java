package Loading;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.text.Format;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * (注册页面)
 * 1、页面整体布局设计；
 * 2、页面相关组件的相互验证；
 * 3、页面组件后台事件；
 * 4、将相关信息通过输出流生成TXT文件；
 * 5、注册完成后，隐藏页面，让登入也对注册页内容进行验证；
 * @author Administrator
 *
 */
public class Registers_Page extends JFrame {
	//定义所需的常量
	boolean i = false;
	//=========================================
	
	JLabel user = new JLabel("用户名：");
	final static JTextField user_text = new JTextField(" ");
	JLabel password = new JLabel("秘钥：");
	final static JPasswordField password_text = new JPasswordField(" ");
	JLabel id = new JLabel("身份证：");
	final JTextField id_text = new JTextField();
	JLabel phone = new JLabel("手机号码：");
	final JTextField phone_text = new JTextField();
	JRadioButton jr = new JRadioButton("我已阅读并同意用户注册协议", i);
	JLabel code1 = new JLabel();
	final JTextField code1_text = new JTextField();
	JButton register = new JButton("注册");
	Font t = new Font("黑体", Font.PLAIN, 15);
	Container c = getContentPane();
	//=========================================
	//构造方法，定义好页面框架
	public Registers_Page() {
		this.setTitle("注册页面"+"         ——————"+"顾子布制作");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(null);
		//======================================
		//用户相关组件以及点击事件
		user.setFont(t);
		user.setBounds(145, 20, 100, 35);
		c.add(user);
		// =====================================
		user_text.setText(null);
		user_text.setFont(t);
		user_text.setBounds(215, 20, 200, 35);
		c.add(user_text);
		user_text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = user_text.getText();
				if (s.length() >= 8)
					e.consume();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});
		// =====================================
		//秘钥相关组件以及点击事件
		
		password.setFont(t);
		password.setBounds(160, 80, 100, 35);
		c.add(password);
		//======================================
		password_text.setText(null);
		password_text.setEchoChar('*');
		password_text.setFont(t);
		password_text.setBounds(215, 80, 200, 35);
		c.add(password_text);
		password_text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				char[] s = password_text.getPassword();
				if (s.length >= 8)
					e.consume();
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
			}
		});

		// =======================================
		//身份证相关组件以及点击事件

		id.setFont(t);
		id.setBounds(145, 140, 100, 35);
		c.add(id);
		//========================================
		
		id_text.setFont(t);
		id_text.setBounds(215, 140, 200, 35);
		c.add(id_text);
		id_text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = id_text.getText();
				if (s.length() >= 18)
					e.consume();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// ========================================
		//手机号相关组件以及点击事件
		phone.setFont(t);
		phone.setBounds(130, 200, 100, 35);
		c.add(phone);
		//=========================================
		
		phone_text.setFont(t);
		phone_text.setBounds(215, 200, 200, 35);
		c.add(phone_text);
		phone_text.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				String s = phone_text.getText();
				if (s.length() >= 11)
					e.consume();
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		// =======================================================
		
		//定义验证数组内容以及点击事件
		String[] s1 = { "12", "23", "34", "32", "45", "56", "67", "78" };
		int[] s2 = { 12, 23, 34, 32, 45, 56, 67, 78 };
		int ss2 = 0;
		String ss1 = null;
		String ss0 = null;
		//===============================================
		for (int i = 0; i < 2; i++) {
			int ma = (int) (Math.random() * s2.length);
			ss2 += s2[ma];
			System.err.println(s2[ma]);
			if (i == 0) {
				ss0 = s1[ma];
			} else {
				ss1 = s1[ma];
			}
			code1.setText(ss1 + "+" + ss0 + "=");
		}
		final String szs =""+ss2;
		System.err.println(ss2);

		code1.setFont(new Font("黑体", Font.PLAIN, 40));
		code1.setBounds(220, 240, 120, 100);
		c.add(code1);
		// ===================================================

		code1_text.setFont(new Font("黑体", Font.PLAIN, 40));
		code1_text.setBounds(350, 270, 60, 40);
		c.add(code1_text);

		// 定义注册按钮相关组件以及后台跳转输出定义
		register.setFont(t);
		register.setBounds(240, 320, 100, 35);
		c.add(register);
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (user_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "用户名不能为空！");
				}
				if (password_text.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "秘钥不能为空！");
				}
				if (id_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "身份证不能为空！");
				}else if(id_text.getText().length() <18){
					JOptionPane.showMessageDialog(null, "身份证格式错误(必须十八位公民身份证号码)");
				}
				if (phone_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "手机号码不能为空！");
				}else if(phone_text.getText().length()<11){
					JOptionPane.showMessageDialog(null, "手机号码格式错误(仅支持中国大陆十一位手机号码)");
				}
				if (code1_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "答案不得为空！");
				}else if(code1_text.getText().equals(szs)){
					JOptionPane.showMessageDialog(null, "通过验证！");
					System.out.println(szs);
					
					//将注册内容输出成TXT文件
					File f = new File("Date.txt");
					try {
						FileWriter fw = new FileWriter(f);
						String user = "用户名为："+"\t"+user_text.getText()+"\r\n";
						String password = "  "+"秘钥为："+"\t"+password_text.getText()+"\r\n";
						String id = "身份证为："+"\t"+id_text.getText()+"\r\n";
						String phone = "手机号码："+"\t"+phone_text.getText()+"\r\n";
						fw.write(user);
						fw.write(password);
						fw.write(id);
						fw.write(phone);
						fw.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "答案错误！");
					code1_text.setText("");
					code1_text.requestFocus();
					
				}

			}
		});

		//以否阅读用户先关权限，只有点击了才能进行下一步操作
		jr.setFont(new Font("黑体", Font.PLAIN, 15));
		jr.setBounds(200, 240, 250, 30);
		register.setEnabled(i);
		jr.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//key(key1());
				if (i==false) {
					i=true;
					register.setEnabled(i);
				}else if(i==true){
					i=false;
					register.setEnabled(i);
				}
			}
		});
		c.add(jr);

		this.setVisible(true);
	}
//=====================================
	
	public static void main(String[] args) {
		new Registers_Page();
	}
}
