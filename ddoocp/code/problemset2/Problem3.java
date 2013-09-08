/**
 * 
 */
//package l4.ncc.ddoocp.problemset2;

/**
 * @author phiri
 *
 */
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*System.out.println(largestOfThree(1,2,3));
		System.out.println(largestOfThree(1,3,2));
		System.out.println(largestOfThree(2,1,3));
		System.out.println(largestOfThree(2,3,1));
		System.out.println(largestOfThree(3,1,2));
		System.out.println(largestOfThree(3,2,1));
		
		System.out.println(largestOfThree2(1,2,3));
		System.out.println(largestOfThree2(1,3,2));
		System.out.println(largestOfThree2(2,1,3));
		System.out.println(largestOfThree2(2,3,1));
		System.out.println(largestOfThree2(3,1,2));
		System.out.println(largestOfThree2(3,2,1));*/
		double[] numbers = {1, 2, 3};
		System.out.println(largestOfThree2(numbers));
	}
	
	public static double largestOfThree(double number1, double number2, double number3) {
		double current;
		double largest;
		
		largest = number1;
		current = number2;
		
		if (current > largest) {
			largest = current;
			current = number3;
			if (current > largest) {
				largest = current;
			}
		}
		else {
			largest = largest;
			current = number3;
			if (current > largest) {
				largest = current;
			}
		}
		
		return largest;
	}
	
	public static double largestOfTwo(double number1, double number2) {
		
		double largest;
		if (number1 > number2) {
			largest = number1;
		}
		else {
			largest = number2;
		}
		
		return largest;
	}
	
	public static double largestOfThree2(double number1, double number2, double number3) {
		
		double largest;
		largest = largestOfTwo(largestOfTwo(number1, number2), number3);
		return largest;
	}
	
	public static double largestOfThree2(double[] nums) {
		
		double largest;
		largest = nums[0];
		for(int i=1; i<nums.length; i++) {
			largest = largestOfTwo(largest, nums[i]);
		}
		
		return largest;
	}
}
