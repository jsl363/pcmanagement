package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login extends JFrame {
	JPanel panel1, panel2, panel0;
	JButton b1, b2;
	JLabel jl;	Font font;
	Login() {
		this.setTitle("회원 로그인");
		this.setLayout(new BorderLayout());
		this.setBackground(Color.black);
		
		font = new Font("굴림체", Font.BOLD, 40);
		
		panel1 = new LoginPanel();
		panel2 = new JPanel();
		panel0 = new JPanel();
		b1 = new JButton();
		b1.setText("사용시작");
		b2 = new JButton();
		b2.setText("회원가입");
		panel2.setBackground(Color.black);
		panel0.setBackground(Color.black);
		panel2.setForeground(Color.black);
		this.add("North", panel0);
		this.add("Center", panel1);
		panel2.add(b1);
		panel2.add(b2);
		this.add("South", panel2);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new Login();
	}

	class LoginPanel extends JPanel {
		JTextField id, pw;
		JLabel id_, pw_;
		JPanel p1, p2, p3, p4;
		Font font;

		void set() {
			id = new JTextField(20);
			pw = new JTextField(20);
			id_ = new JLabel();
			font = new Font("굴림체", Font.BOLD, 20);
			id_.setText("아이디");
			id_.setFont(font);
			id_.setForeground(Color.white);
			id_.setFont(font);
			pw_ = new JLabel();
			pw_.setText("비밀번호");
			pw_.setFont(font);
			pw_.setForeground(Color.white);
			pw_.setFont(font);
			p1 = new JPanel();
			p2 = new JPanel();
			p3 = new JPanel();
			p4 = new JPanel();

		}

		LoginPanel() {
			this.setForeground(Color.black);
			this.setLayout(new GridLayout(4, 1));
			set();
			p1.setBackground(Color.black);
			p2.setBackground(Color.black);
			p3.setBackground(Color.black);
			p4.setBackground(Color.black);
			p1.add(id_);
			p1.add(id);
			p2.add(pw_);
			p2.add(pw);
			this.add(p3);
			this.add(p1);
			add(p2);
			add(p4);
		}
	}
}
