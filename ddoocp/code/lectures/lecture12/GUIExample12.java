package l4.ncc.ddoocp.examples;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GUIExample12 extends JFrame implements ActionListener {

	JComboBox jcb = new JComboBox();
	JTextArea jta = new JTextArea(2, 15);
	JButton jb = new JButton("Finish");
	
	public static void main(String[] args) {

		GUIExample12 ge12 = new GUIExample12();
	}

	public GUIExample12() {
		
		this.setLayout(new BorderLayout());
		this.setSize(400, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
		jcb.addItem("Joshua");
		jcb.addItem("Mubanga");
		jcb.addItem("Annie");
		jcb.addItem("Wendy");
		
		jPanel.add(new JLabel("Choose your favourite tutor"));
		jPanel.add(jcb);
		
		this.add("North", jPanel);
		this.add("Center", jta);
		this.add("South", jb);
		
		jb.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String comment = "";
		if(jcb.getSelectedItem()=="Joshua") {
			comment = "Software Development Techniques";
		}
		else if(jcb.getSelectedItem()=="Mubanga") {
			comment = "Designing& Developing Object Oriented Computer Programs";
		}
		else if(jcb.getSelectedItem()=="Dingi") {
			comment = "Computer Systems";
		}
		else {
			comment = "Designing& Developing Websites";
		}
		
		jta.setText(comment);
	}
}