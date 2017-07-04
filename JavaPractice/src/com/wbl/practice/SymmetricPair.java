/*
Two pairs (a, b) and (c, d) are said to be symmetric if c is equal to b and a is equal to d. For example (10, 20) and (20, 10) are symmetric. 

Given an array of pairs find all symmetric pairs in it.

It may be assumed that first elements of all pairs are distinct.

Example:

Input: arr[] = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}}
Output: Following pairs have symmetric pairs
        (30, 40)
        (5, 10) 
  
  

*/

package com.wbl.practice;

public class SymmetricPair {
	
	
	
	public static void main(String[] args) {
		
		
		
		
//	 int[][] nums = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
	
 	 int[][] nums = {{11, 20}, {20, 11}, {5, 10}, {40, 30}, {10, 5}};
 	 
 //	 int[][] result = new int[3][3];
 	 
 	 comparePair(nums);
 	 
	}	 
	
	
 	 
 	 public static void comparePair(int[][] nums) {

		
	 int [] arr1 = new int[2];
	 int [] arr2 = new int[2];
	 
//	
	 
	 
	 for(int i = 0 ; i < nums.length; i++ ) {
		 
		 arr1[0] =  nums[i][0];
		 arr1[1] =  nums[i][1];
 
        
 		 
 		 for(int j = 0; j < nums.length; j++ ) {
	 
		 arr2[0] =  nums[j][0];
		 arr2[1] =  nums[j][1];
		 
//		 System.out.println(arr2[0]+ "  " + arr2[1]);
		 
		 if(arr1[0] == arr2[1] && arr1[1] == arr2[0]) {
			 
 			 System.out.println("the symmetric pairs are : ");
 			 
			 
	 		 System.out.println(arr1[0]+ "  " + arr1[1]);
			 System.out.println(arr2[0]+ "  " + arr2[1]);
			 
	 
		 }
 		 
	 }

 
	 }	
	 
	 
		
	}
	
	
}
	
	
 

