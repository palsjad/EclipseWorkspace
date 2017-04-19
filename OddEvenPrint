 	/*

	3) Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers 
	first, and then odd numbers.

	Example

	Input  = {12, 34, 45, 9, 8, 90, 3}
	Output = {12, 34, 8, 90, 45, 9, 3}


	************************************************

	*/



package com.wbl.practice;

import java.util.Arrays;

public class OddEvenPrint {
	
	
	


	public static void main(String args[] ) {


	int[] numbers = { 2,6,4,5,9,2,1,3,8,7};

	int[] even = new int [5];

	int[] odd = new int [5];
	
	int[] result = new int[10];

	int i = 0;
	int j = 0;
	int k = 0;
	int val = 0;
	
 System.out.println("\n\nThe given array is : " + Arrays.toString(numbers));
 
 
 
	for(val = numbers[i], j = 0, k = 0; i < numbers.length; i++) {
      val = numbers[i];
	     if ((val % 2) == 0) {
		      even[j] = val;
			  j++;
		 }
		 else
		     {
			 odd[k] = val;
			 k++;
			 
			 }


	}
	
	System.out.println("\n\nPrinting the output in 3 different ways\n");
	
	System.out.println("**********************************************");

//****************** to put both even and odd arrays one after the other
	
	System.out.println("\nThe final output is : " + Arrays.toString(even)+"," + Arrays.toString(odd));
	
	
	
//********************************************************************************************

	
	
//****************** to put both even and odd arrays one element after the other one by one
	
	System.out.print("\n\nThe final output is : ");
 
	
	for(i = 0; i < even.length; i ++){
		
		System.out.print(even[i] + ", ");
	}
	
for(i = 0; i < odd.length; i ++){
		
	    
		System.out.print(odd[i] );
		
		if(i != odd.length-1){
			System.out.print( ", ");
		}
	}


//********************************************************************************************


//****************** to put both even and odd arrays into one array and print that array
    
i = 0;
 	
	for(j = 0; j < even.length; j++, i++) {
		result[i] = even[j];
		
	}
	
	for(j = 0; j < odd.length; j++, i++) {
		result[i] = odd[j];
		
	}
	
	
	System.out.println("\n\nThe final output is : " + Arrays.toString(result));

		 

 

}
	
	
}	
