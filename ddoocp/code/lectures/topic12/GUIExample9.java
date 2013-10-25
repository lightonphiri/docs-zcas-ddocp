package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample9 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(10);
	JButton jb = new JButton("Submit");
	
	public static void main(String[] args) {
		
		GUIExample9 ge9 = new GUIExample9();
	}
	
	public GUIExample9() {
		
		this.setLayout(new FlowLayout());
		this.setSize(400, 100);
		this.setTitle("Label Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(new Label("Type your name"));
		this.add(jtf);
		this.add(jb);
		jb.addActionListener(this);
		
		this.setVisible(true);
		this.setResizable(false);
	}
	
	public void actionPerformed(ActionEvent e) {
		this.jtf.setText("");
	}
}
