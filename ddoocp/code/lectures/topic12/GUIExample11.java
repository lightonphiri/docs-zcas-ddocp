package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample11 extends JFrame implements ActionListener {

	JComboBox jcb = new JComboBox();
	JLabel jl = new JLabel("Choose a color from the drop down menue");
	JTextField jtf = new JTextField(15);
	JButton jb = new JButton("Finish");
	
	public static void main(String[] args) {

		GUIExample11 ge11 = new GUIExample11();
	}

	public GUIExample11() {
		
		this.setLayout(new FlowLayout());
		this.setSize(400, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jcb.addItem("Red");
		jcb.addItem("Yellow");
		jcb.addItem("Blue");
		jcb.addItem("Green");
		
		this.add(jl);
		this.add(jcb);
		this.add(jtf);
		this.add(jb);
		jb.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(jcb.getSelectedItem()=="Red") {
			jtf.setText("For popples");
		}
		else if(jcb.getSelectedItem()=="Yellow") {
			jtf.setText("Like the sun");
		}
		else if(jcb.getSelectedItem()=="Blue") {
			jtf.setText("Like the skype");
		}
		else {
			jtf.setText("Like the grass");
		}
	}
}