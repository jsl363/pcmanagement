package frame;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Chat2 extends JFrame{
	JPanel[] pa;
	JTextArea ta;
	JTextField tf;
	JButton jb;

	void hanasi(){
		ta = new JTextArea(150,150);
		tf = new JTextField(20);
		jb = new JButton("전송");
		pa = new JPanel[4];
		for(int i=0; i<pa.length; i++) {
			  pa[i] = new JPanel();
			  pa[i].setBackground(Color.BLACK);
		}
	}
	Chat2(){
		hanasi();
		
		add("Center",ta);
		
		pa[0].add(tf);
		pa[0].add(jb);
		add("South",pa[0]);
		add("North",pa[1]);
		add("East",pa[2]);
		add("West",pa[3]);
		
		this.setTitle("채팅");
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
	new Chat2();	
	}
}
