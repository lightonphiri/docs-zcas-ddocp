package l4.ncc.ddoocp.t9;

import javax.swing.JOptionPane;

public class Topic9Task3 {

	public static void main(String[] args) {
		Topic9Task3 t9T3 = new Topic9Task3();
		t9T3.go();
	}
	
	private void go() {
		try {
			Search search = new Search();
			search.generateNums();
			search.searchBig();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In go: " + e.toString());
		}
	}
	
	private class Search {
		
		private double n[] = new double[30];
		private int bigIndex;
		private double bigValue;
		private Search() {
			//
		}
		
		private void generateNums() {
			try {
				int k;
				for(k=0; k<30; k=k+1) {
					n[k] = 50*Math.random();
				}
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "In Search: " + e.toString());
			}
		}
		
		private void searchBig() {
			try {
				int k;
				bigIndex = 0;
				bigValue = n[0];
				for(k=0; k<30; k=k+1) {
					if(n[k]>bigValue) {
						bigValue = n[k];
						bigIndex=k;
					}
				}
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, "In searchBig: " + e.toString());
			}
		}
	}
}