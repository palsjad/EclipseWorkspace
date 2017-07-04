/*
write a program that sorts array of elements by ignoring the negative sign of integers.
eg: i/p : {2, 10, -5}
o/p : {2, -5, 10}

 

*/


package com.wbl.practice;

public class SortArrayWithNegativeNums {
	
	
	
	public static void main(String args[]) {
		
		int[] input = {2, 10, -5};
		
		
	//	String temp = input.toString();
		
//		String[] val = temp.split("");
		
		
 		 
//	char[] ch = temp.toCharArray();
		
		int num = 0;
		int temp = 0;
		int flag = 0;
		int negativeVal = 0;
		
	for(int i = 0; i < input.length; i++ ) {
		
		 num = input[i];
		 
		if(input[i] < 0) {
			num = Math.abs(input[i]);
			flag = 1;
			
			negativeVal = i;
		}
		 
		if(num > input[i+1]) {
			
			temp = input[i+1];			
			input[i+1] = num;			
			input[i] = temp;			
			
			if(flag ==1) {
				
				negativeVal = i+1;
			}
 			
		}
		
		
	//	System.out.println(val[i]);
		
	}
		
	}

}
