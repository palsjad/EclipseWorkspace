package com.wbl.practice;

public class NumbersNotRepeated {
	
	
	public static void main(String ars[] ) {


	 	int[] numbers = {2,5,2,6,3,4,6,8,1,9,1,3,7};
		
 //	int[] numbers = {2,5,6,3,4,6,8,1,9};
	

		int i = 0;
		int j = 0;
		int val = 0;

		int flag = 0;	
	
	
	
	for(i = 0, val = 0 , j = 0; i < numbers.length; i++ ){
		  
	      j = i;
	for(i = 0, val = numbers[j]; i < numbers.length; i++) {
	  
		if( i != j)  {
	     if( val == numbers[i] ) {
		     flag = 1; 
		     i = j;
		     break;
		 
		 }
		}

	}

	if( flag == 0) {

	 System.out.println("the number is :" + val);
	 i = j;
	}
	
	flag = 0;
	
	}
	
	}
}
