/*

	4) Write a Java program to find the second largest element in an array.
	Example

	Input  = {12, 34, 45, 9, 8, 90, 3}
	Output = 45

*/


package com.wbl.practice;

import java.util.Arrays;

public class SecondLargestNumber {
	
	
	
	


	public static void main(String args[] ) {



 	int[] numbers = {12, 34, 45, 95, 8, 90, 91};

 //   int[] numbers = {12, 34, 45, 9, 8, 90, 3};
    
	int largest = 0;
	int secondLargest = 0; 
     int i = 0;

   System.out.println("\n\nThe given input is : " + Arrays.toString(numbers));

   
   if(numbers[0] < numbers[1]){
		  
		  secondLargest = numbers[0];
	      largest  = numbers[1];
   }
     
	for(i = 2; i < numbers.length; i++) {
		
  		
 	      if(numbers[i] > largest){
 	    	  
 	    	 secondLargest = largest;
		      largest  = numbers[i];
		      
 	      }
 	      else {
 	    	  
		      if(numbers[i] > secondLargest) {
		    	  secondLargest = numbers[i];
		    	  
		      }
			 
	 
		  }

	     
	}
	 
	 System.out.println("\n\nThe Second largest Number is : " + secondLargest);


	}

}
