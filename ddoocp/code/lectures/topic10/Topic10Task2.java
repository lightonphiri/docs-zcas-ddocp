package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task2 {

	public static void main(String[] args) {
		
		try {
			//File f = new File("C:\\Users\\phiri\\workspace\\DDOOCP\\fileInput12.txt");
			File f = new File("/home/phiri/Sandbox/201310_file1.txt");
			BufferedReader br = new  BufferedReader(new FileReader(f));
			
			String line;
			
			if(f.renameTo(new File("/home/phiri/Sandbox/X201310_file1.txt"))) {
				System.out.println("File renamed!");
			}
			else {
				System.out.println("File NOT renamed!");
			}
		}
		catch(IOException e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());	
		}
	}
}