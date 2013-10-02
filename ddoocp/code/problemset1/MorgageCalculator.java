/**
 * 
 */
package l4.ncc.ddoocp.problemset1;

/**
 * @author phiri
 *
 */
public class MorgageCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//M = (P x i x (1 + i)^n) / ((1 + i)^n – 1)
		double principle = 0;
		double interestRate = 0;
		double paymentPeriod = 0;
		double morgagePayment = 0;
		double expression = 0;
		
		principle = 250000;
		interestRate = 17.0/100.00;
		paymentPeriod = 10 * 12;
		expression = Math.pow((1 + interestRate), paymentPeriod);
		
		morgagePayment = (principle * interestRate * expression)/((expression) - 1);
		System.out.println(morgagePayment);
		System.out.println((2 ^ 8));
	}

}