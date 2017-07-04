package com.wbl.JavaProblem;

import java.util.Arrays;

public class PrimeNumberArray {

	public static void main(String[] args) {
		 
		int[] nums = {3,10,2,4,11,7};
		
		primeNums(nums);

	}
	
	
	
	public static void primeNums(int[] arr) {

 
	 	int[] newArr = new int[5];
	 	
	 

 		int temp = 0;
		int flag = 0;

		for(int i = 0, m = 0; i < arr.length; i++) {

		      temp = arr[i];
		
		      System.out.println(temp);
			  
			  for(int j = 2; j < temp; j++) {
			  
		     if(temp % j == 0 ){
			   System.out.println("entered : " + temp);
			     flag = 1;
				 break;
			 }

		    }

			if(flag == 0) {
			   
			   newArr[m] = temp;
			   m++;
			   
			}
			else {
			
			 flag = 0;
			 
			}
		}

		if(newArr != null) {

 		 for(int i : newArr) {
//		 System.out.println("the array with prime numbers is : " + Arrays.toString(newArr));
 			 
 		if( i != 0 )	{ 
 	 System.out.println("the array with prime numbers is : " + i);

 		}	 

		}
		}
		}


}
