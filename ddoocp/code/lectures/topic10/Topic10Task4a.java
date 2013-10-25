package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task4a {

	public static void main(String[] args) {
		
		try {
			File d = new File(".");
			if(d.isDirectory()) {
				File[] files = d.listFiles();
				for(File f: files) {
					System.out.println(f.getName());
					//System.out.println(f.getAbsolutePath());
				}
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());	
		}
	}
}