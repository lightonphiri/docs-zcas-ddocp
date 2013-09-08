/**
 * 
 */
package l4.ncc.ddoocp.problemset2;

/**
 * @author phiri
 *
 */
//public class Problem4Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Problem4 employee1 = new Problem4("ZN113281", 192, 52);
		System.out.println(employee1.employeePay());
		
		Problem4 employee1a = new Problem4();
		employee1a.setEmployeeNumber("487033/52/1");
		employee1a.setEmployeeHours(192);
		employee1a.setEmployeeRate(52);
		System.out.println(employee1a.employeePay());
	}

}
