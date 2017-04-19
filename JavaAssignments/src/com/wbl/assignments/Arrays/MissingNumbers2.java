package com.wbl.assignments.Arrays;

import java.util.Arrays;

public class MissingNumbers2 {

	public static void main(String[] args) {
		
		
//		int[] arr = {0,2,5,9,12};
		
		int[] arr = {0,7,15,19,22,25};	
		
		
		
// to print the given array

//********************************************	
		
    	    System.out.println("\n\nThe given array is :  " + Arrays.toString(arr) + " \n");
			int k = 0;
		    
			int lastVal = (arr[5]);
 	 
				for(int j = 0; j <= lastVal ; j++) {
 	
					if(arr[k] == j) {
						k++;
						System.out.print("   ");
					 	continue;
					}
					
					else
					{
						System.out.print( j + " ");
					}
					
 				}
 
    	}

  }
