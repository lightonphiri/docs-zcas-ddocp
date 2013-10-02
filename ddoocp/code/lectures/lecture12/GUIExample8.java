package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample8 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(50);
	JRadioButton jrb1 = new JRadioButton("Click here for Red", true);
	JRadioButton jrb2 = new JRadioButton("Click here for Green", false);
	ButtonGroup bg = new ButtonGroup();
	
	public static void main(String[] args) {
		
		GUIExample8 ge8 = new GUIExample8();
	}
	
	public GUIExample8() {
		this.setLayout(new FlowLayout());
		this.setSize(600, 120);
		this.setTitle("Red or Green?");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		bg.add(jrb1);
		bg.add(jrb2);
		
		this.add(jtf);
		this.add(jrb1);
		jrb1.addActionListener(this);
		this.add(jrb2);
		jrb2.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jrb1) {
			jtf.setText("You have chosen Red");
			// coursework illustration
		}
		else if(ae.getSource()==jrb2) {
			jtf.setText("You have chosen Green");
			// coursework illustration
		}
	}
}