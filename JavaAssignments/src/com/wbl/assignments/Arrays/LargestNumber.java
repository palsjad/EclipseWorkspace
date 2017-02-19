
//  Write a program to find the largest number in a given array.

package com.wbl.assignments.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
 
		  int[] num = {2,250,32,14,5000,7 };
		 
	 
          int    temp = num[0];
			  System.out.print("\n\nThe numbers in the array are : \n");

		  for(int i = 0; i <= num.length-1; i++){
 			  System.out.println(num[i]);
			   if(temp < num[i]){    
				   temp = num[i];
	//				  System.out.println("inside if  temp  : " + temp);
 
			   }
	
	//			  System.out.println("inside for temp  : " + temp);

		  }	
		  
		  System.out.println("\n\nThe largest number in the array is : " + temp);
	}

}
