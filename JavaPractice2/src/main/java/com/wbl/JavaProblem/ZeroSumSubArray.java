/*
How to find if there is a sub array with sum equal to zero? 

Examples:

Input: {4, 2, -3, 1, 6}
Output: true 
There is a sub-array with zero sum from index 1 to 3.

*/

package com.wbl.JavaProblem;

public class ZeroSumSubArray {

	public static void main(String[] args) {

		
		int[] arr = {4, 2, -3, 1, 6};
		
		int num = arr[1]+arr[2]+arr[3];
		
		System.out.println(num);
		
		findSubArray(arr);

	}

	
	public static void findSubArray(int[] numArr) {
		
		int flag = 0;
		int i = 0;
		int negativeVal = 0;
		int val = 0;
		
		for( i = 0; i < numArr.length; i++ ) {
			
			if(numArr[i] < 0) {
				
				flag = 1;
				negativeVal = numArr[i];
			}
			
     	}
		
		for(  i = 0; i < numArr.length; i++) {
			
			 if (flag != 1) {
				 
				 System.out.println("there are all positive numbers so a sub array with sum of zero is impossible\n");;
				 return;
			 }
			 
			 val = Math.abs(negativeVal);
			 System.out.println("the positive value is : " + val);
			
		}
		
		
		
	}
}
