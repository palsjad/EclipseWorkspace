
/*
Write a program to find the number of times the pattern of the letters “AB “ in the string
ÄBDCABDEFGAB is repeating.The answer is 3.

*/
package com.wbl.practice;

public class RepeatedPatternOne {
	
	public static void main(String[] args) {
	
	String pattern = "AB";
	String newPattern = "";
	
	int count = 0;
	
 
 	
	String str = "ABDCABDEFGAB";
	
    System.out.println("\n\nthe given string is : " + str);
 	
	  for(int i = 0 ; i < str.length()-1 ; i++ ) {
	 		  
		  newPattern =   Character.toString(str.charAt(i)) + Character.toString(str.charAt(i+1));
		  
		  System.out.println("new pattern : " + newPattern);
		  
		  if(pattern.equals(newPattern)) {
			  
			  count++;
 		  }
		  
 
	  }
	
	 System.out.println("the count of the pattern is : " + count);
	}	 

}
