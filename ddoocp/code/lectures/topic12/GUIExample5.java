package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample5 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(10);
	JButton jb = new JButton("Press Me");
	
	public static void main(String[] args) {
		
		GUIExample5 ge5 = new GUIExample5();
	}
	
	public GUIExample5() {
		this.setLayout(new FlowLayout());
		this.setSize(200, 100);
		this.setTitle("Hello");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.add(jtf);
		this.add(jb);
		jb.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jtf.setText("Hello DDOOCP!");
		// coursework example
	}
}