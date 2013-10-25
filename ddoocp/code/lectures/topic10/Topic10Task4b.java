package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task4b {

	public static void main(String[] args) {
		
		try {
			//File f = new File("C:\\Users\\phiri\\workspace\\DDOOCP\\ddoocpd\\Invitation for Medical Equipment Euro Bond ii.pdf");
			File f = new File("/home/phiri/Sandbox/X201310_file1XXXXX.txt");
			if(f.delete()) {
				System.out.println("File deleted");
			}
			else {
				System.out.println("File Not deleted");
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());	
		}
	}
}