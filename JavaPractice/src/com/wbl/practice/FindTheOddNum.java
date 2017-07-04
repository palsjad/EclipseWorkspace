/*
Given an array of positive integers. All numbers occur even number of times except one number which occurs odd number of times.
 write logic to meet O(n) time complexity
Example:
I/P = [10, 2, 3, 2, 3,45, 10, 3, 3, 45, 45]
O/P = 45

*/
package com.wbl.practice;

public class FindTheOddNum {
	
	public static void main(String arg[]) {
	
	int[] num =  {10, 2, 3, 3, 45, 2, 10, 3, 3, 45, 45};
	int val = 0;
	int count = 0;
	int flag = 0;
	
	for(int i = 0 ; i < num.length; i++) {
		
		val = num[i];
		
		for(int j = 0; j < num.length; j++)  {
	 	
	    	if( val == num[j]) {
		    	count++;
 			
	    	}
		 
		
	}
		System.out.println("the count is : " + count + " and the val is : " + val);
		if ( count % 2 != 0) {
			
			System.out.println("the number is : " + val);
			flag = 1;
			
		}
		
		if ( flag == 1) {
			
			break;
		}
		 
		
		count = 0;
	}	
	
	
	}
	
	

}
