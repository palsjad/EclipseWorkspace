

// Write a program to print the Fibonacci Series


package com.wbl.assignments.Loops;

import java.util.Scanner;

public class FibonacciDemo {


	public static void main(String[] args) {
		
		int a, b, c;
        
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number \n");
		int num = scan.nextInt();
		
		scan.close();
	
		System.out.print( "\n \n \n The Fibonacci Series is :  " );
	     
		int count = 0 ; 
		
        for(a = 0, b = 1, c = 2; c <= num; a = a + b, b = a + b, c = c + 2){
					 
        	System.out.print( "  " + a + "  " + b );
        	
       	count = count + 2;
        	 
        	 
        	
		}
 
      /*  
        if (count < num) {
   		System.out.print( "  " + a );
        }*/
	}

}
