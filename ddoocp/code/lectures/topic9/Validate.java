package l4.ncc.ddoocp.t9;

import javax.swing.JOptionPane;

public class Validate {
	
	public Validate() {
		//
	}
	
	public boolean isInteger(String s) {
		int testInt = 0;
		try {
			testInt = Integer.parseInt(s.trim());
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean isDouble(String s) {
		double testDouble = 0.0;
		try {
			testDouble = Double.parseDouble(s.trim());
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public boolean isAlphabetic(String s) {
		boolean result = true;
		int k = 0;
		int position = 0;
		String oneChar = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		try {
			String sUpperCase = s.toUpperCase().trim();
			result = true;
			for(k=0; k<sUpperCase.length(); k=k+1) {
				oneChar = sUpperCase.substring(k, k+1);
				position = alphabet.indexOf(oneChar);
				if(position==-1) {
					result = false;
				}
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error in isAlphabetic");
			JOptionPane.showMessageDialog(null, e.toString());
		}
		return result;
	}
	
	public boolean isLetter(String s) {
		boolean result = false;
		int position = 0;
		String firstChar = "";
		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		try {
			String sUpperCase = s.toUpperCase().trim();
			firstChar = sUpperCase.substring(0, 1);
			position = alphabet.indexOf(firstChar);
			if(position==-1) {
				result = false;
			}
			else {
				result = true;
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error in isLetter");
			JOptionPane.showMessageDialog(null, e.toString());
		}
		return result;
	}
	
	public boolean isDigit(String s) {
		boolean result = false;
		int position = 0;
		String digits = "0123456789";
		String firstChar = "";
		try {
			firstChar = s.substring(0, 1).trim();
			position = digits.indexOf(firstChar);
			if(position==-1) {
				result = false;
			}
			else {
				result = true;
			}
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error in isDigit");
			JOptionPane.showMessageDialog(null, e.toString());
		}
		return result;
	}
}