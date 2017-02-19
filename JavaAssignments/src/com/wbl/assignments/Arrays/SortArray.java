
// Write a program to sort an Array

package com.wbl.assignments.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
	//	int [] arr = {5,0,3,4,1,6};
	//	int [] arr = {0,6,2,1,7};
		int [] arr = {22,34,7,12,9,0};
		
		
		System.out.println("");
		int temp = 0; 

		
// to print the unsorted array
//********************************************	
		
		 System.out.print(" The Unsorted array is :  " );
	
		for(int j = 0; j <= arr.length-1; j++) {
			System.out.print(arr[j] + "  "   );
		}
		
//********************************************		
		
		for(int j = 0; j <= arr.length-1; j++) {
//			System.out.println("inside first for loop the j value is : " +j);

		for(int i = 0 ; i < arr.length-1; i++){
//			System.out.println("inside 2nd for lopp and outside if the i value is : " + i);

			if( arr[i] > arr[i+ 1] ) {
//				System.out.println("inside if the i value is : " + i);
				temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;
			}  
		}
		
		}
		
		
// to print the  sorted array
//*****************************************			
 System.out.print("\n \n The sorted array is :  " );

		for(int j = 0; j <= arr.length-1; j++) {
			System.out.print(arr[j] + "  " );
		}

	}
}
 
 

 
