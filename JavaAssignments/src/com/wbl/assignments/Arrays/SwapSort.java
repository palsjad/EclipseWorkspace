
/*
Write a program to locate and swap only 2 elements which are not 
sorted in a given sorted array.
For example given an array {1,2,5,6,4} locate 5 and 4 and then 
swap them as they are not as per sorted order
******************************************************************
*/


package com.wbl.assignments.Arrays;

public class SwapSort {

	public static void main(String[] args) {
		
 //.... Different Test cases................
		
 //	  	int[] arr = {1,2,6,4,3};
 	  	 
     	int[] arr = {6,2,4,3,5,1};
	 	 	
 // 	int[] arr = {1,2,4,3,5,6};
		
 //	    int[] arr = {1,5,3};
		
		
		int firstIndex, secondIndex = 0; 

		int[]  index = new int[2];
		int i,j,m = 0; 
		int temp = 0;		
		int reset = 0;
 		
// to print the unsorted array
//********************************************	
		
		 System.out.print("\n\n The Unsorted array is :  " );
	
		for(j = 0; j <= arr.length-1; j++) {
			System.out.print(arr[j] + "  "   );
		}
		
		System.out.print("\n\n");
	
		
//********************************************		
	 
	 
	
		for(  i = 0, j = 0; i < arr.length-1; i++, j++){
			
               if (reset == 1){
            	 j--;    
            	 
             }
			if( arr[j] > arr[i+ 1] ) {
 
		         index[m] = j;
		         index[m+1] = i+1;
		         reset = 1;
		         

		         if ((i+1) == (arr.length-1)){
		        	 
		        	 index[1] = arr.length-1;
		        	 
 		         }
 	        else 
 	             {
 	            	index[m+1] = i+1;
 	        	 			
 	             }
				 
 
			}  
			
		}
		
		m = 0;
		
 		   
			firstIndex = index[m];
			secondIndex = index[m+1];
			
			temp = arr[firstIndex];
			arr[firstIndex] = arr[secondIndex];
			arr[secondIndex] = temp;
			
 
			
			// to print the Sorted array
			//********************************************	
					
					 System.out.print(" The Sorted array is :  " );
				
					for(j = 0; j <= arr.length-1; j++) {
						System.out.print(arr[j] + "  "   );
					}			
	 		
		}
		
		}
 