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
 * (ע��ҳ��)
 * 1��ҳ�����岼����ƣ�
 * 2��ҳ�����������໥��֤��
 * 3��ҳ�������̨�¼���
 * 4���������Ϣͨ�����������TXT�ļ���
 * 5��ע����ɺ�����ҳ�棬�õ���Ҳ��ע��ҳ���ݽ�����֤��
 * @author Administrator
 *
 */
public class Registers_Page extends JFrame {
	//��������ĳ���
	boolean i = false;
	//=========================================
	
	JLabel user = new JLabel("�û�����");
	final static JTextField user_text = new JTextField(" ");
	JLabel password = new JLabel("��Կ��");
	final static JPasswordField password_text = new JPasswordField(" ");
	JLabel id = new JLabel("���֤��");
	final JTextField id_text = new JTextField();
	JLabel phone = new JLabel("�ֻ����룺");
	final JTextField phone_text = new JTextField();
	JRadioButton jr = new JRadioButton("�����Ķ���ͬ���û�ע��Э��", i);
	JLabel code1 = new JLabel();
	final JTextField code1_text = new JTextField();
	JButton register = new JButton("ע��");
	Font t = new Font("����", Font.PLAIN, 15);
	Container c = getContentPane();
	//=========================================
	//���췽���������ҳ����
	public Registers_Page() {
		this.setTitle("ע��ҳ��"+"         ������������"+"���Ӳ�����");
		this.setSize(600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(null);
		//======================================
		//�û��������Լ�����¼�
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
		//��Կ�������Լ�����¼�
		
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
		//���֤�������Լ�����¼�

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
		//�ֻ����������Լ�����¼�
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
		
		//������֤���������Լ�����¼�
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

		code1.setFont(new Font("����", Font.PLAIN, 40));
		code1.setBounds(220, 240, 120, 100);
		c.add(code1);
		// ===================================================

		code1_text.setFont(new Font("����", Font.PLAIN, 40));
		code1_text.setBounds(350, 270, 60, 40);
		c.add(code1_text);

		// ����ע�ᰴť�������Լ���̨��ת�������
		register.setFont(t);
		register.setBounds(240, 320, 100, 35);
		c.add(register);
		register.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (user_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "�û�������Ϊ�գ�");
				}
				if (password_text.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "��Կ����Ϊ�գ�");
				}
				if (id_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "���֤����Ϊ�գ�");
				}else if(id_text.getText().length() <18){
					JOptionPane.showMessageDialog(null, "���֤��ʽ����(����ʮ��λ�������֤����)");
				}
				if (phone_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "�ֻ����벻��Ϊ�գ�");
				}else if(phone_text.getText().length()<11){
					JOptionPane.showMessageDialog(null, "�ֻ������ʽ����(��֧���й���½ʮһλ�ֻ�����)");
				}
				if (code1_text.getText().length() == 0) {
					JOptionPane.showMessageDialog(null, "�𰸲���Ϊ�գ�");
				}else if(code1_text.getText().equals(szs)){
					JOptionPane.showMessageDialog(null, "ͨ����֤��");
					System.out.println(szs);
					
					//��ע�����������TXT�ļ�
					File f = new File("Date.txt");
					try {
						FileWriter fw = new FileWriter(f);
						String user = "�û���Ϊ��"+"\t"+user_text.getText()+"\r\n";
						String password = "  "+"��ԿΪ��"+"\t"+password_text.getText()+"\r\n";
						String id = "���֤Ϊ��"+"\t"+id_text.getText()+"\r\n";
						String phone = "�ֻ����룺"+"\t"+phone_text.getText()+"\r\n";
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
					JOptionPane.showMessageDialog(null, "�𰸴���");
					code1_text.setText("");
					code1_text.requestFocus();
					
				}

			}
		});

		//�Է��Ķ��û��ȹ�Ȩ�ޣ�ֻ�е���˲��ܽ�����һ������
		jr.setFont(new Font("����", Font.PLAIN, 15));
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
