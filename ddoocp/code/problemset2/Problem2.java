/**
 * 
 */
//package l4.ncc.ddoocp.problemset2;

import javax.swing.JOptionPane;

/**
 * @author phiri
 *
 */
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Enter set of four numbers
		String number1String = JOptionPane.showInputDialog("Enter number 1");
		double number1 = Double.parseDouble(number1String);
		String number2String = JOptionPane.showInputDialog("Enter number 2");
		double number2 = Double.parseDouble(number2String);
		String number3String = JOptionPane.showInputDialog("Enter number 3");
		double number3 = Double.parseDouble(number3String);
		String number4String = JOptionPane.showInputDialog("Enter number 4");
		double number4 = Double.parseDouble(number4String);
		
		double computedAverage = computeAverage(number1, number2, number3, number4);
		
		if (computedAverage < 50) {
			
			JOptionPane.showMessageDialog(null, "Sorry! You failed comrade! :(");
		}
		else {
			JOptionPane.showMessageDialog(null, "Congratulations comrade! You passed :)");
		}
	}
	
	public static double computeAverage(double a, double b, double c, double d) {
		
		return (a + b + c + d)/4;
	}

}
