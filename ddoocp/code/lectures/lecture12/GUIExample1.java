package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample1 extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new GUIExample1();
	}
	
	public GUIExample1() {
		// frame layout manager
		this.setLayout(new FlowLayout());
		// frame size
		this.setSize(400, 300);
		// frame title
		this.setTitle("NCC Level 4 ---DDOOCP");
		// frame default close operation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// frame visibility
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		// handle events here
	}
}