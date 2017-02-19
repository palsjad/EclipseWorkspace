
// Write a program to reverse a string

package com.wbl.assignments.Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "pallavi";
		
		char[] charName = name.toCharArray() ;
	//	char[] temp;
		for(int i = charName.length-1; i !=0; i--){
          System.out.println("  " + charName[i]); 
	}
		System.out.println("  " + charName[0]); 
}
}