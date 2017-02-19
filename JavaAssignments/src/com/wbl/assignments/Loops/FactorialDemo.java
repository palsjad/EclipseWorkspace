
//  Write a program  to calculate factorial of a given number.
//  You need to compute the factorial with one logic that uses recursion 
//  and another logic without recursion.


package com.wbl.assignments.Loops;

public class FactorialDemo {
	
// This is a Recursive Function
	
	 public static long factorial(long input, long temp) {
		 
		 
	 while(input != 1) {
		 
	 System.out.print( input + " X "); 
	 
	 return  temp = factorial(input - 1,temp = temp * input);  
	 
	 }
	 System.out.print( input );
	 
	 return temp;	
	}

	 
// This is NonRecursive Function
	 
public static long nonRecursive(long input) {
	
    long result = 1;
	for(long a = input ; a != 0; a--){
		
    	result = result * a;
	 System.out.print( a + " X "); 
	}
	System.out.print(" = " + result);
	return result;
}

	public static void main(String[] args) {
		
		long a = 10;
		long b = 1;
 		System.out.println("\nThe Factorial of " + a + " in Recursive Function is : ");

		long result = factorial(a, b);
		System.out.print(" = " + result);
		
 		System.out.println("\n\nThe Factorial of " + a + " in Non Recursive Function is : ");

		result = nonRecursive(a);

		
	}
}
