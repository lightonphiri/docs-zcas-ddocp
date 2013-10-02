package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample3 extends JFrame implements ActionListener {

	ImageIcon ii = new ImageIcon("zcas.gif");
	JButton jb = new JButton("Press", ii);
	
	public static void main(String[] args) {
		GUIExample3 ge3 = new GUIExample3();
	}
	
	public GUIExample3() {
		
		this.setLayout(new FlowLayout());
		this.setSize(400, 400);
		this.setTitle("JButton");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(jb);
		jb.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setTitle("Zambia Centre for Accountancy Studies");
	}
}