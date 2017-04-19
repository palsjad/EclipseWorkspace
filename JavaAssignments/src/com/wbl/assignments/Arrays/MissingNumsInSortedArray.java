
//    Write a program to find the missing number in a series of sorted numbers stored in an array.


package com.wbl.assignments.Arrays;

public class MissingNumsInSortedArray {
	
	public static void main(String[] args) {

		
//		int[] arr = {0,2,5,9,12};
	
		int[] arr = {0,7,15,19,22,25};	
		
		
		
// to print the given array
//********************************************	
		
		System.out.print("\n\nThe given array is :  " );
	
		for(int j = 0; j <= arr.length-1; j++) {
			System.out.print(arr[j] + "  "   );
		}
				
	    	System.out.println("\n\n");
		//********************************************			
		
 
		int num, num1, temp = 0;
				
		System.out.print ("The missing numbers are : " );
		
		for(int i = 0; i < arr.length-1; i++){
 			
			num = arr[i];   // assign the first value to num
			num1 = arr[i+1]; // assign the second value to num1 and find the values missing between these 2 numbers
			
			if(num1 != (num+1)){
				temp = num + 1;
				while(temp < num1){
					
                System.out.print(temp++ + " "  );				
			}
			
	}
        System.out.print("   "  );

	}	
	
	}
}
