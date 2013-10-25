package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task1 {

	public static void main(String[] args) {
		
		try {
			String line = "";
			//File f = new File("C:\\Users\\phiri\\workspace\\DDOOCP\\fileInput.txt");
			File f = new File("/home/phiri/Sandbox/file1.txt");
			BufferedReader br = new BufferedReader(new FileReader(f));

			while((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
			br.close();
		}
		catch(IOException ioe) {
			//JOptionPane.showMessageDialog(null, "In go: " + ioe.toString());
			ioe.printStackTrace();
		}
	}
}