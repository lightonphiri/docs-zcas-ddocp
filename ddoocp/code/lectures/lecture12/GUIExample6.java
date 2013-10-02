package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample6 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(10);
	JCheckBox jcb = new JCheckBox("Try checking it");
	
	public static void main(String[] args) {
		
		GUIExample6 ge6 = new GUIExample6();
	}
	
	public GUIExample6() {
		this.setLayout(new FlowLayout());
		this.setSize(600, 120);
		this.setTitle("JCheckBox Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.add(jtf);
		this.add(jcb);
		jcb.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jtf.setText("You did it!");
	}
}