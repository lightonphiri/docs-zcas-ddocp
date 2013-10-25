package l4.ncc.ddoocp.t10;

import java.io.*;

import javax.swing.JOptionPane;

public class Topic10Task3 {
	
	private int ref = 0;
	private String tray = "";
	private int numberInStock = 0;
	private Topic10Task3(int ref, String tray, int numberInStock) {
		this.ref = ref;
		this.tray = tray;
		this.numberInStock = numberInStock;
	}
	
	public static void main(String[] args) {
		
		try {
			int kIndex = 0;
			String wholeRecord = "";
			File f = new File("/home/phiri/Sandbox/201310_file2.txt");
			FileWriter fW = new FileWriter(f, false);
			BufferedWriter bW = new BufferedWriter(fW);
			PrintWriter pW = new PrintWriter(bW, true);
			Topic10Task3 t10T3 = new Topic10Task3(0, "", 0);
			
			for(kIndex=0; kIndex<21; kIndex=kIndex+1) {
				t10T3.ref = 1000 + kIndex;
				t10T3.tray = "A" + Integer.toString(100+kIndex);
				t10T3.numberInStock = 1 + (int)(20*Math.random());
				wholeRecord = Integer.toString(t10T3.ref) + "\t" + t10T3.tray + "\t" + t10T3.numberInStock;
				pW.println(wholeRecord);
			}
			pW.close();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In main: " + e.toString());
		}
	}
}