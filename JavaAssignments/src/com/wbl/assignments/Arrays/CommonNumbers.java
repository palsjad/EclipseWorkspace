
//  Write a program to find the common number in any given two arrays.

package com.wbl.assignments.Arrays;

 
public class CommonNumbers {

	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {2,3,6,7,5,8,5,1};
		
 
		
		for(int i = 0; i <= num1.length-1; i++){
			for (int j = 0; j <= num2.length-1; j++) {
				
				if(num1[i] == num2[j]){
					System.out.println("The common number is : " + num1[i]);
					break;
				}
			}
			
		}
 
	}

}
