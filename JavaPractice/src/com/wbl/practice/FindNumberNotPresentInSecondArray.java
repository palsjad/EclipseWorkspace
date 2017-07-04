package com.wbl.practice;

import java.util.Arrays;

public class FindNumberNotPresentInSecondArray {

	public static void main(String[] args) {

     int[] numbers1 = {1,2,3,4,5 };
     int[] numbers2 = {2,3,1,0,5};	 
     
     System.out.println("\n\nthe given arrays are : " + Arrays.toString(numbers1) + " and " + Arrays.toString(numbers2));
     
     findNumber(numbers1,numbers2);
     
     
     
     
	}
	
	
	public static void findNumber(int[] num1, int[] num2) {
		
	   int temp = 0;
	   int count = 0;
	   
		for(int i = 0; i < num1.length; i++) {
						
//			System.out.println("temp " + num1[i]);
			
			for (int j = 0; j < num2.length; j++ ) {
				
//				System.out.println("inside for temp " + num1[i]);

//				System.out.println("num2[j] : " + num2[j]);

				
				if(num1[i] == num2[j]) {
					count++;
//					System.out.println("inside temp : " + temp + " and the count is : " + count);
	
				}
				else {
					temp = num1[i];

					
				}
	 			
			}
			
			if(count == 0) {
				
				System.out.println("\n\nthe number not in the second array is : " + temp);
			}
			
			
				count = 0;

			 
		}
		
		
		
	}

}
