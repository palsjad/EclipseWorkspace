
/*
Given a sorted array of n distinct integers where each integer is in the range from 0 to m-1 and m > n. 
Find the smallest number that is missing from the array.

Examples
Input: {0, 1, 2, 6, 9}, n = 5, m = 10
Output: 3

Input: {4, 5, 10, 11}, n = 4, m = 12
Output: 0

Input: {0, 1, 2, 3}, n = 4, m = 5
Output: 4

Input: {0, 1, 2, 3, 4, 5, 6, 7, 10}, n = 9, m = 11
Output: 8


*/


package com.wbl.practice;

public class MissingNumFromSortedArray {
	
	
	
	public static void main(String arg[] ) {
		
		
//		int[] num = {0, 1, 2, 6, 9};
//		int m = 10;
		
//		int[] num = {4, 5, 10, 11};
//		int m = 12;
		
//	    int[] num = {0, 1, 2, 3};
//		int m = 5;

		int[] num =  {0, 1, 2, 3, 4, 5, 6, 7, 10};
		int m = 11;
		
 	    
		int flag = 0;
 	    int i = 0;
 	    
		for( i = 0; i < num.length ; i++) {
			
						
			if( num[i] != i) {
				
				System.out.println("the missing number is : " + i);
				
				flag = 1;
				
				break;				
				
			}
			 
			
		}
		
		if (flag == 0) {
			
			
			if (i < m){
  
				System.out.println("the missing number is : " + i);
				
			}
		}
		
		
	}

}
