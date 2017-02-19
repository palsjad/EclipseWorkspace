package com.wbl.assignments.AdditionalJavaAssignments;

public class GarbageCollectionDemo {
	

	public void printString1(String garbage){
		
		System.out.println(garbage);
		
	}

	
public void printString2(String garbage){
		
		System.out.println(garbage);
		
	}

	

	public static void main(String[] args) {
 
		String garbage1 = " \n\nProgram to demonstrate Garbage Collection ";
		String garbage2 = " \n\nGarbage is collected";
		
		
		GarbageCollectionDemo gcd1 = new GarbageCollectionDemo();
		GarbageCollectionDemo gcd2 = new GarbageCollectionDemo();
		
		gcd1.printString1(garbage1);
		gcd2.printString2(garbage2);
		
		
		gcd1 = null;
		gcd2 = null;

// to collect the garbage
		
		
		System.gc();
		
// to test if the object is garbage collected
		
		try{
		gcd1.printString1(garbage1);
		}
		catch(NullPointerException e){
			System.out.println("\n\nCannot access created object gcd1 anymore. The object gcd1 is already garbage collected\n");
		}
		
	}

}
