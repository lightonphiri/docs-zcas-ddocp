package l4.ncc.ddoocp.t9;

import java.util.*;
import javax.swing.*;

public class Topic9Task10 {

	public static void main(String[] args) {
		try {
			Topic9Task10 t9T9 = new Topic9Task10();
			t9T9.go();
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "In main: " + e.toString());
		}
	}
	
	private void go() {
		int kIndex = 0;
		// constructing an LinkedList object
		LinkedList<String> demoAL = new LinkedList<String>();
		// adding elements to LinkedList object
		demoAL.add("First element");
		demoAL.add("Second element");
		demoAL.add("Third element");
		demoAL.add("Four element");
		// accessing elements from LinkedList object
		for(kIndex=0; kIndex<demoAL.size(); kIndex=kIndex+1) {
			System.out.println(demoAL.get(kIndex));
		}
		System.out.println();
		// inserting elements
		demoAL.add(2, "Inserted");
		for(kIndex=0; kIndex<demoAL.size(); kIndex=kIndex+1) {
			System.out.println(demoAL.get(kIndex));
		}
		System.out.println();
		
		// updating elements
		demoAL.set(3, "New one here");
		for(kIndex=0; kIndex<demoAL.size(); kIndex=kIndex+1) {
			System.out.println(demoAL.get(kIndex));
		}
		System.out.println();
		// delete elements
		demoAL.remove(0);
		for(kIndex=0; kIndex<demoAL.size(); kIndex=kIndex+1) {
			System.out.println(demoAL.get(kIndex));
		}
		System.out.println();
		// delete all elements
		demoAL.clear();
		demoAL.add("Just the one");
		for(kIndex=0; kIndex<demoAL.size(); kIndex=kIndex+1) {
			System.out.println(demoAL.get(kIndex));
		}
	}
}