package com.wbl.practice;

public class StringToInt {

	public static void main(String[] args) {
 
		String temp = "12345";
		
  	    int[] numArr = new int[5];
  	    
		char[] chArr = temp.toCharArray();
	   
		
		for(int i = 0; i < temp.length(); i++) {
			
 			numArr[i] = Character.getNumericValue(chArr[i]);		
			
		}
		
		for(int i = 0; i < (numArr.length); i++) {
			
		System.out.println("The string converted to the int array is : " +numArr[i]);	

		
	}

		
}
	
	
}