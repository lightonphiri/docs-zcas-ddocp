package l4.ncc.ddoocp.t9;

import javax.swing.JOptionPane;

public class DieSimulation {
	private int[] cup = new int[7];
	private int noOfThrows = 0;
	
	private DieSimulation() {
		//
	}
	
	private void emptyCups() {
		try {
			int k = 1;
			for(k=1; k<=6; k=k+1) {
				cup[k] = 0;
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In DieSimulation.emptyCups: " + e.toString());
		}
	}
	
	private void throwDie() {
		try {
			int k = 1;
			int thrown = 0;
			for(k=1; k<=noOfThrows; k=k+1) {
				thrown = 1 + (int)(6*Math.random());
				cup[thrown] = cup[thrown] + 1;
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In DieSimulation.throwDie: " + e.toString());
		}
	}
}