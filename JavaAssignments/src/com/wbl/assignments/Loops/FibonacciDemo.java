

// Write a program to print the Fibonacci Series


package com.wbl.assignments.Loops;	

public class FibonacciDemo {


	public static void main(String[] args) {
		
		int a, b, c;
        
	
		System.out.print( "\n \n \n The Fibonacci Series is :  " );
	     
        for(a = 1, b = 1, c = 2; c <= 20; a = a + b, b = a + b, c = c + 2){
        	
			System.out.print( "  " + a + "  " + b );

			
		}
		System.out.print( "  ...........  " );

	}

}
