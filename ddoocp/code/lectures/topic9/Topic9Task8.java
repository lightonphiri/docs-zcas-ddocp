package l4.ncc.ddoocp.t9;

import java.util.*;

public class Topic9Task8 {

	public static void main(String[] args) {
		Topic9Task8 t9T8 = new Topic9Task8();
		t9T8.go();
	}
	
	private void go() {
		int kIndex = 0;
		ALDataAndMethods alDM = new ALDataAndMethods();
		MyRecord mR = new MyRecord(0, "");
		alDM.addALR(new MyRecord(100, "Door"));
		alDM.addALR(new MyRecord(200, "Window"));
		alDM.addALR(new MyRecord(300, "Floor"));
		alDM.addALR(new MyRecord(100, "Wall"));
		for(kIndex=0; kIndex<alDM.sizeALS(); kIndex=kIndex+1) {
			mR = alDM.getALR(kIndex);
			System.out.println(mR.ref + " " + mR.description);
		}
		System.out.println();
		mR = new MyRecord(159, "Inserted");
		alDM.insertALI(2, mR);
		for(kIndex = 0; kIndex<alDM.sizeALS(); kIndex=kIndex+1) {
			mR = alDM.getALR(kIndex);
			System.out.println(mR.ref + " " + mR.description);
		}
		System.out.println();
		mR = new MyRecord(500, "Fire Place");
		alDM.insertALI(3, mR);
		for(kIndex = 0; kIndex<alDM.sizeALS(); kIndex=kIndex+1) {
			mR = alDM.getALR(kIndex);
			System.out.println(mR.ref + " " + mR.description);
		}
	}
	
	private class MyRecord {
		private int ref = 0;
		private String description = "";
		private MyRecord(int pRef, String pDescription) {
			ref = pRef;
			description = pDescription;
		}
	}
	
	private class ALDataAndMethods {
		ArrayList<MyRecord> alDemo = new ArrayList<MyRecord>();
		private ALDataAndMethods() {
			//
		}
		
		private void addALR(MyRecord mR) {
			alDemo.add(mR);
		}
		
		private MyRecord getALR(int kIndex) {
			return alDemo.get(kIndex);
		}
		
		private int sizeALS() {
			return alDemo.size();
		}
		
		private void insertALI(int pos, MyRecord mr) {
			alDemo.add(pos, mr);
		}
		
		private void setALSet(int pos, MyRecord mr) {
			alDemo.set(pos, mr);
		}
	}
}