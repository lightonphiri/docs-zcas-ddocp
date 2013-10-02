/**
 * 
 */
package l4.ncc.ddoocp.problemset1;

/**
 * @author phiri
 *
 */
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* 
		 * ax^2 + bx + c = 0
		 * a != 0
		 * a, b& c are real numbers
		 * 
		 * x = (-b [-,+]  sqareroot(b^2 - 4ac)) / 2a
		 * 
		 * D = b^2 - 4ac
		 * 
		 * ### D > 0
		 * 
		 * 
		 * ### D = 0
		 * 
		 * 
		 * ### D < 0
		 * 
		 * 
		 * ### if a = 0, b != 0 and c != 0
		 * x = -b/c
		 * 
		 * ### if a = b = c = 0
		 * 
		 * */
		
		// variable declaration
		double a = 0; 
		double b = 0;
		double c = 0;
		double descriminant = 0;
		
		// variable value assignment
		a = 1;
		b = 5;
		c = 25;
		
		// computations
		// descriminant
		descriminant = Math.pow(b, 2) - (4*a*c); // Note: equivalent is of Math.pow(b, 2) is b * b
		
		// flow control
		if (descriminant > 0) {
			// D > 0
			if ((a==0) & (b!=0) & (c!=0)) {
				// a=0
				// 
				
			}
			else if ((a==0) & (b==0) & (c==0)) {
				// a=b=c=0
				// infinite number roots
				
			}
		} else if (descriminant == 0) {
			// D = 0
			if ((a==0) & (b!=0) & (c!=0)) {
				// a=0
				// 
				
			}
			else if ((a==0) & (b==0) & (c==0)) {
				// a=b=c=0
				// infinite number roots
				
			}
		} else {
			// D < 0
			if ((a==0) & (b!=0) & (c!=0)) {
				// a=0
				// 
				
			}
			else if ((a==0) & (b==0) & (c==0)) {
				// a=b=c=0
				// infinite number roots
				
			}
		}
		System.out.println("Hello ha");
	}
}