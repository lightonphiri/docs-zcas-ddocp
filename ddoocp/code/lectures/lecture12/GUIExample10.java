package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample10 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(10);
	JTextArea jta = new JTextArea(2, 30);
	JButton jb = new JButton("Submit");
	
	public static void main(String[] args) {
		
		GUIExample10 ge10 = new GUIExample10();
	}
	
	public GUIExample10() {
		
		this.setLayout(new FlowLayout());
		this.setSize(400, 120);
		this.setTitle("JTextArea Demo");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(new JLabel("Type your name:"));
		this.add(jtf);
		this.add(jb);
		jb.addActionListener(this);
		this.add(jta);
		jta.setEditable(false);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String name = jtf.getText();
		String message = "Hello " + name + "\nEnjoy your programming";
		jta.setText(message);
	}
}