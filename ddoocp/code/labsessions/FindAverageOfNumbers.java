/**
 * DDOOCP ---Problem set #2
 */

import javax.swing.JOptionPane;

/**
 * @author Lighton Phiri
 *
 */
public class FindAverageOfNumbers {

	static double number1;
	static double number2;
	static double number3;
	static double number4;
	static double nums[];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		displayAverages();
	}
	
	/**
	 * 
	 */
	public static void getInputValues() {
		
		try {
			String number1String = JOptionPane.showInputDialog("Enter number 1");
			number1 = Double.parseDouble(number1String);
			String number2String = JOptionPane.showInputDialog("Enter number 2");
			number2 = Double.parseDouble(number2String);
			String number3String = JOptionPane.showInputDialog("Enter number 3");
			number3 = Double.parseDouble(number3String);
			String number4String = JOptionPane.showInputDialog("Enter number 4");
			number4 = Double.parseDouble(number4String);
		} catch (NumberFormatException nfe) {
			System.out.println("NumberFormatException occurred: Please enter a valid number string");
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException: User cancelled operation");
		}
	}
	
	/**
	 * 
	 */
	public static void getInputValues2() {
		
		nums = new double[10];
		for(int i=0; i<10; i++) {
			try {
				String numberString = JOptionPane.showInputDialog("Enter number " + (i+1));
				nums[i] = Double.parseDouble(numberString);
			} catch(NumberFormatException nfe) {
				System.out.println("NumberFormatException occurred: Please enter a valid number string");
				break; 
			} catch(NullPointerException npe) {
				System.out.println("NullPointerException: User cancelled operation");
				break;
			}
		}
		number1 = nums[0];
		number2 = nums[1];
		number3 = nums[2];
		number4 = nums[3];
	}
	
	/**
	 * @param num1,num2,num3
	 */
	public static double calcSumOfNumbers(double num1, double num2, double num3) {
		
		double sum = num1 + num2 + num3;
		return sum;
	}

	/**
	 * @param num1,num2,num3,num4
	 */
	public static double calcSumOfNumbers(double num1, double num2, double num3, double num4) {
		
		double sum = num1 + num2 + num3 + num4;
		return sum;
	}
	
	/**
	 * @param nums
	 */
	public static double calcSumOfNumbers(double[] nums) {
		
		double sum = 0.0;
		for (int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	public static void displayAverages() {
		
		double averageOfThree;
		double averageOfFour;
		double averageOfTen;
		String resultString;
		
		getInputValues2();
		
		averageOfThree = calcSumOfNumbers(number1, number2, number3)/3;
		averageOfFour = calcSumOfNumbers(number1, number2, number3, number4)/4;
		averageOfTen = calcSumOfNumbers(nums)/10;
		resultString = "The average of first three numbers is: " + averageOfThree + "\n" + "The average of first four numbers is: " + averageOfFour + "\n" + "The average of ten numbers is: " + averageOfTen;
		
		JOptionPane.showMessageDialog(null, resultString);
	}
}
