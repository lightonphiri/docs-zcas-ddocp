package l4.ncc.ddoocp.t9;

import java.awt.Font;

import javax.swing.*;

public class Topic9Task5 {

	public static void main(String[] args) {
		try {
			Topic9Task5 t9T5 = new Topic9Task5();
			t9T5.go();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In main: " + e.toString());
		}
	}
	
	private void go() {
		try {
			GUI2D g2D = new GUI2D();
			g2D.display2D();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());
		}
	}
	
	class GUI2D extends JFrame {
		private JLabel lblHeading;
		private JTextArea txtDisplay;
		private TwoD tD = new TwoD();
		
		private GUI2D() {
			try {
				this.setSize(1050, 350);
				this.setLocation(100, 100);
				this.setTitle("Topic 9 Task 5");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLayout(null);
				Font f1 = new Font("Monospaced", Font.BOLD, 24);
				Font f2 = new Font("Dialog", Font.BOLD, 24);
				lblHeading = new JLabel("Displaying 2D Array");
				lblHeading.setBounds(10, 10, 300, 50);
				lblHeading.setFont(f2);
				this.add(lblHeading);
				
				txtDisplay = new JTextArea();
				txtDisplay.setFont(f1);
				txtDisplay.setTabSize(20);
				txtDisplay.setBounds(10, 100, 1000, 600);
				this.add(txtDisplay);
				this.setVisible(true);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "in GUI2D: " + e.toString());
			}
		}
		
		private void display2D() {
			int rowIndex;
			int colIndex;
			String strOut = "";
			try {
				strOut = "Country\t" + "Currency\t" + "Rate\t" + "Payment\n";
				for(rowIndex=0; rowIndex<4; rowIndex=rowIndex+1) {
					for(colIndex=0; colIndex<4; colIndex=colIndex+1) {
						strOut = strOut + tD.tab1[rowIndex][colIndex] + "\t";
					}
					strOut = strOut + "\n";
				}
				txtDisplay.setText(strOut);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "In display2D: " + e.toString());
			}
		}
	}
	
	private class TwoD {
		
		private String[][] tab1 = new String[4][4];
		private double euro_e;
		private double aus_e;
		private double usa_e;
		
		private String strEuro_e = "1.18";
		private String strAus_e = "1.76";
		private String strUsa_e = "1.61";
		
		private TwoD() {
			try {
				tab1[0][0] = "France";
				tab1[1][0] = "Spain";
				tab1[2][0] = "Australia";
				tab1[3][0] = "USA";
				
				tab1[0][1] = "Euro";
				tab1[1][1] = "Euro";
				tab1[2][1] ="AUS$";
				tab1[3][1] ="US$";
				
				tab1[0][2] = strEuro_e;
				tab1[1][2] = strEuro_e;
				tab1[2][2] = strAus_e;
				tab1[3][2] = strUsa_e;
				
				tab1[0][3] = "Card";
				tab1[1][3] = "Card";
				tab1[2][3] = "Cash";
				tab1[3][3] = "Cash";
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "In TowD: " + e.toString());
			}
		}
	}
}