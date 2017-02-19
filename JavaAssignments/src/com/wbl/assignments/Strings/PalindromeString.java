
//  Write a program to check for a Palindrome string

package com.wbl.assignments.Strings;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		String palindrome = "kayak";  //kayak, 
				
		char[] ch = palindrome.toCharArray();
 		
		char[]	chReverse = new char[5];
		
		
		for(int i = 0; i <= ch.length-1; i ++ ) {
			
			chReverse[i] = ch[i];
			
		}
	 
		System.out.print("\n\nOriginal word spelling : " + palindrome);
 
		System.out.print("\n\nReverse word spelling  : ");
		
		for (int i = 0,  j = chReverse.length-1; i <= ch.length-1; i++, j--) {
 
			if(ch[i] == chReverse[j]){
				System.out.print(chReverse[i]);
              
			}
			else {
				System.out.println("\n\n" + palindrome + " : This word is not a Palindrome");
				break;
			}
			
			
		}
			
			
 
	}

}
