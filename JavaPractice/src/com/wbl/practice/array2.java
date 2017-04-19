/*
***********************************************************************************
2) Write a program to find whether a given number is perfect or not?
Ex - i/p - 6
o/p - This is a perfect number

3) Write a program to implement Arraylist? It should contain add(), get(), remove(), size() methods?
***********************************************************************************



*/

package com.wbl.practice;

import java.util.ArrayList;

public class array2 {

	
	public static void main(String args[]) {


		int value = 8128;
 
		ArrayList<Integer> finalValues = new ArrayList<Integer>();


		for( int i = 1; i < value; i++) {

		      if(( value % i ) == 0) {

		        finalValues.add(i);
		        
 		        
		//        System.out.println("entered");
		     }

		}
		int num = 0;

		for( int i = 0; i <= finalValues.size()-1 ; i++) {

		       num = num + finalValues.get(i);
 
		}
 	    System.out.println("\n\n The sum total of the divisors is :  " +  num + " and the given number is  :" + value);


		if (num == value) {

		System.out.println( value  + " is a perfect number \n");
		}
		else
		{
			System.out.println(value  + " is not a perfect number \n");

		}
		
		
	 	finalValues.remove(1);
		
		 

		System.out.println("The list without the first value are : ");

		for(int i : finalValues) {

		System.out.println( i + " " );


		}

		

	}	
}
