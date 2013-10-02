package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample2 extends JFrame implements ActionListener {

	JButton myButton = new JButton("Press");
	
	public static void main(String[] args) {
		GUIExample2 ge2 = new GUIExample2();
	}
	
	public GUIExample2() {
		this.setLayout(new FlowLayout());
		this.setSize(400, 400);
		this.setTitle("JButton Illustration");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(myButton);
		myButton.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setTitle("Pressed");
	}

}
