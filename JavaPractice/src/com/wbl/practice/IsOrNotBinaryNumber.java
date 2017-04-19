/*
	
	2) Write a program to check the given number is binary number or not?

			Ex - 
			101011 - a binary number
			345 - not a binary number

			*********************************************8

*/

package com.wbl.practice;

import java.util.Arrays;

public class IsOrNotBinaryNumber {
	
	
			public static void main(String args[] ) {


	//		int[] numbers = {1,2,3,4};
	//		int[] numbers = {0,1,0,1};
			int[] numbers = {0,1,2,3};


			int i = 0;
 			int count = 0;

			for(i = 0; i < numbers.length; i++ ) {

			    if( numbers[i] == 0 || numbers[i] == 1) {
				     
				    count++;
				
				}

			   
			}

			if(count == numbers.length){
			System.out.println("The number : " + Arrays.toString(numbers)  + " is a Binary Number\n");

			}
			else {
				
				System.out.println("The number : " + Arrays.toString(numbers)  + " is not a Binary Number\n");

			}
  
			}
         
			}
	

 
