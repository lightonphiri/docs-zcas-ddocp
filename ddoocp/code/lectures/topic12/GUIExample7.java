package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample7 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(50);
	JCheckBox jcb1 = new JCheckBox("Click here for Red");
	JCheckBox jcb2 = new JCheckBox("Click here for Green");
	
	
	public static void main(String[] args) {
		
		GUIExample7 ge7 = new GUIExample7();
	}
	
	public GUIExample7() {
		this.setLayout(new FlowLayout());
		this.setSize(600, 120);
		this.setTitle("JCheckBox Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.add(jtf);
		this.add(jcb1);
		jcb1.addActionListener(this);
		this.add(jcb2);
		jcb2.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jcb1) {
			jtf.setText("You have chosen Red");
			// coursework illustration
		}
		else if(ae.getSource()==jcb2) {
			jtf.setText("You have chosen Green");
			// coursework illustration
		}
	}
}