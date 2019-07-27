package frame;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat1 extends JFrame {
	JTextArea ta;  JTextField tf; JButton jb;
    JPanel p1, p2, p3, p4;
	Chat1() {
		this.setTitle("메신저");
		this.setSize(500,400);
		
		ta = new JTextArea(20,10);
		tf = new JTextField(30);
		jb = new JButton("보내기");
		jb.setFont(new Font("굴림체",Font.BOLD,20));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p1.setBackground(Color.BLACK);
		p2.setBackground(Color.BLACK);
		p3.setBackground(Color.BLACK);
		p4.setBackground(Color.BLACK);
		add("Center", ta);p1.add(tf);p1.add(jb);
		add("South", p1);add("West",p2); add("East",p3);add("North",p4);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] arg0) {
		new Chat1();
	}
}
