
//  Finding palindrome words and non-palindrome words in the given sentence?


package com.wbl.JavaProblem;

import java.util.ArrayList;
import java.util.List;

public class PalindromeInASentence {

	public static void main(String[] args) {
		
		
		
		String sentence = "Anna my racecar is faster than your kayak";
		
		System.out.println("\n\nThe given sentence is : " + sentence );

		
		findPalindrome(sentence);
		

	}
	
	
	
	public static void findPalindrome(String sent) {
		
	//	List<String> words = new ArrayList<String>();
		
		 int len = sent.split(" ").length;
		 
//		 System.out.println("length : " + len);
		 
		 String[] words = new String[len];
		 
		 words = sent.split(" ");
		 
		 String temp = "";
 		
		for (int i = 0; i < len; i++) {
			
			
	//		System.out.println(words[i]);
			
			temp = words[i].toLowerCase();
			
			int m ,n = 0;
			
	//		for(int m = 0, n = temp.length()-1; m < temp.length(); m++,n--) {
				
				if(temp.length() % 2 != 0) {    //   5 % 2 = 2 != 0 
					
					m = (temp.length()/2) - 1;
					n = (temp.length()/2 ) + 1;
					
			
				}
				
				else {
					
					m = (temp.length()/2) - 1;
					n = (temp.length()/2 );
				}
			
				
				compareString(temp, m , n);

	//	}
		
	}

}
	public static void compareString(String str, int a, int b) {
 		
		char[] strArr = str.toCharArray();
		int flag = 0;
		
		
		
		for ( ; a >= 0 ; a--, b++) {
			
 			
			if(strArr[a] != (strArr[b])) {
				flag = 1;
				break;
				
			}
	 		
			
		}
		
		if(flag == 0) {
			
			System.out.println("\nthe word '" + str + "' is a palindrome." );
			
		}
		
		else {
			
			System.out.println("\nthe word '" + str + "' is not a palindrome." );

		}
		
		
		return ;
	}
	
}	
