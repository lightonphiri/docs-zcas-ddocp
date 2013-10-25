package l4.ncc.ddoocp.t9;

import java.util.Arrays;

public class Topic9Task4 {
	
	public static void main(String[] args) {
		
		String[] names = {"dingi", "Arron", "Mubanga", "chabwera", "annie", "noah", "Amos", "thiloleko", "kk", "kutemba"};
		int[] numbers = {8, 2, 1, 4, 7, 0, 6, 10, 11, 20};
		for(String s: names) {
			System.out.print(s + " | ");
		}
		
		System.out.println();
		
		for(int i: numbers) {
			System.out.print(i + " | ");
		}

		System.out.println();
		
		Arrays.sort(names);
		Arrays.sort(numbers);

		for(String s: names) {
			System.out.print(s + " | ");
		}
		
		System.out.println();
		
		for(int i: numbers) {
			System.out.print(i + " | ");
		}
	}
}