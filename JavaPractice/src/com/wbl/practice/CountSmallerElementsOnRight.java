/*
Write a function to count number of smaller elements on right of each element in an array. Given an unsorted array arr[] of distinct integers,
construct another array countSmaller[] such that countSmaller[i] contains count of smaller elements on right side of each element arr[i] in array.

Examples:

Input:   arr[] =  {12, 1, 2, 3, 0, 11, 4}
Output:  countSmaller[]  =  {6, 1, 1, 1, 0, 1, 0} 

(Corner Cases)
Input:   arr[] =  {5, 4, 3, 2, 1}
Output:  countSmaller[]  =  {4, 3, 2, 1, 0} 

Input:   arr[] =  {1, 2, 3, 4, 5}
Output:  countSmaller[]  =  {0, 0, 0, 0, 0}

*/


package com.wbl.practice;

import java.util.Arrays;

public class CountSmallerElementsOnRight {

	public static void main(String[] args) {
 
		
//		int[] arr = {12, 1, 2, 3, 0, 11, 4};
		
//		int[] arr = {5, 4, 3, 2, 1};
		
		int arr[] =  {1, 2, 3, 4, 5};
		
		int temp = 0;
				
		int count = 0;
		
		int[] result = new int[arr.length];
		
		System.out.println("\n\nThe given array is : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++ ) {
			
 			temp = arr[i];
 			
			if(i == arr.length-1){
				break;
			}
			
			
	 		for(int j = i+1; j < arr.length; j++ ) {
				
				if(temp > arr[j]){
					
					count++;
				}
				
				
			}
			
	 		result[i] = count;
			
			count = 0;
		}
		
		System.out.println(Arrays.toString(result ));
		
	}

}
