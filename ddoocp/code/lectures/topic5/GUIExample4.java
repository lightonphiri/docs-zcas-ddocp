package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample4 extends JFrame implements ActionListener {

	JTextField jtf = new JTextField(10);
	
	public static void main(String[] args) {
		GUIExample4 ge4 = new GUIExample4();
	}
	
	public GUIExample4() {
		this.setLayout(new FlowLayout());
		this.setSize(200, 100);
		this.setTitle("JTextField");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jtf);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
	}
}