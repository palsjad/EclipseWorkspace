/*
Write an efficient  program to find smallest and second smallest element in an array.

Example:

Input:  arr[] = {12, 13, 1, 10, 34, 1}
Output: The smallest element is 1 and 
        second Smallest element is 10


*/

package com.wbl.practice;

import java.util.Arrays;

public class SmallestAndSecondSmallest {

	public static void main(String[] args) {
		
		
//	  int[] num = {12, 13, 1, 10, 34, 1};
		
		int[] num = {1,1,1,1,10, 1};
	  
 	  
	  sortArr(num);
	  
	  
	 	
 
	}
	
	public static void sortArr(int[] arr)  {
		
		int temp = 0;
		
		
		for(int i = 0; i < arr.length; i++ ) {
			
			
			
			for(int j = 0; j < arr.length; j++ ) {
				
				if(arr[i] < arr[j] ) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
					
				System.out.println("the element at las tposition is : " + arr[j]);	
					
					
				}
				
				
				
			}

		System.out.println("the element at las tposition is : " + Arrays.toString(arr));	

			System.out.println("the smallest number in the array is : " + arr[0]);
			
		 
		for(int a = 0; a < arr.length; a++) {	
			
			if ( arr[a] != arr[a+1]) {
		 
			 	System.out.println("the second smallest number in the array is : " + arr[a+1]);
			 	break;

			}
			
		}
		
		
		
		}
 
}
