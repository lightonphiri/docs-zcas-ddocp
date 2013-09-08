/**
 * DDOOCP ---Problem set #2
 */
//package l4.ncc.ddoocp.problemset2;

import javax.swing.JOptionPane;

/**
 * @author Lighton Phiri
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String testString = JOptionPane.showInputDialog("Enter string to convert to Pig Latin");
		String testResultString = pigLatinTranslator(testString);
		JOptionPane.showMessageDialog(null, testString + " in Pig Latin is: " + testResultString);
	}
	
	/**
	 * @param inputString
	 */
	public static String pigLatinTranslator(String inputString) {
		
		String finalResultString;
		char firstWordCharacter;
		
		firstWordCharacter = inputString.charAt(0); // get first character of input string
		
		if (firstWordCharacter != 'a' && firstWordCharacter != 'e' && firstWordCharacter != 'i' && firstWordCharacter != 'o' && firstWordCharacter != 'u') {
			finalResultString = inputString.substring(1); // get string starting at second character --e.g. for "zcas", get cas
			finalResultString = finalResultString + firstWordCharacter; // append first character to string in previous step --e.g for "zcas", get casz
			finalResultString = finalResultString + "ay"; // append the string "ay"
		} else {
			finalResultString = inputString + "way"; // append the string "way"
		}
		return finalResultString;
	}
}
