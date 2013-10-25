package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task5 {

	public static void main(String[] args) {
		
		try {
			String wholeRecord = "";
			File f = new File("fileInputx.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			while((wholeRecord = br.readLine())!=null) {
				String[] data = wholeRecord.split("\t");
				int ref = Integer.parseInt(data[0]);
				String first = data[1];
				System.out.println(ref + " " + first);
			}
			br.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());	
		}
	}
}