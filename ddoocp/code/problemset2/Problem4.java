/**
 * 
 */
//package l4.ncc.ddoocp.problemset2;

/**
 * @author phiri
 *
 */
public class Problem4 {

	private String employeeNumber;
	private double employeeHours;
	private double employeeRate;
	
	public Problem4() {
		employeeNumber = "ZN113281";
		employeeRate = 52.08;
	}
	
	public Problem4(String employeeNumber, double employeeHours, double employeeRate) {
		this.employeeNumber = employeeNumber;
		this.employeeHours = employeeHours;
		this.employeeRate = employeeRate;
	}
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getEmployeeRate() {
		return employeeRate;
	}

	public void setEmployeeRate(double employeeRate) {
		this.employeeRate = employeeRate;
	}

	public double getEmployeeHours() {
		return employeeHours;
	}

	public void setEmployeeHours(double employeeHours) {
		this.employeeHours = employeeHours;
	}
	
	public double employeePay() {
		double totalEmployeePay = 0.0;
		double employeeHoursWorked = getEmployeeHours();
		double employeeHourlyRate = getEmployeeRate();
		if (employeeHoursWorked > 170) {
			totalEmployeePay = (employeeHoursWorked * employeeHourlyRate) + ((employeeHoursWorked - 170) * 1.5 * employeeHourlyRate);
		} 
		else {
			totalEmployeePay = employeeHoursWorked * employeeHourlyRate;
		}
		
		return totalEmployeePay;
	}
}
