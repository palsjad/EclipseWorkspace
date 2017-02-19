


/*
  	 Write a program that swaps 2 given numbers. You need to have 2 separate functions in the program.
   --> One Function should swap the numbers without any third new variable.
	 --> Second function should swap the numbers using a third variable.
	 
	 */
 
package com.wbl.assignments.Loops;

public class SwapNumsWithoutTemp {
  
	
	public static void main(String[] args) {
	
	int a = 3;
	int b = 2;
	
	System.out.println("\nThe original value of a is : " + a + "  and the original  value of b is : " + b);

	
	a = a + b;   // therefore a = 5
	b = a - b;   // therefore b = 2
	a = a - b;   // therefore a = 3;
	
	System.out.println("\nThe new value of a is : " + a + "  and the new value of b is : " + b);
  
	
	// now swap the numbers with the use of a third variable
	
	int temp ;
	temp = a;
	a = b;
	b = temp;
	System.out.println("\nUsing temp variable the new value of a is : " + a + "  and the new value of b is : " + b);

	
	
			
	}

}
