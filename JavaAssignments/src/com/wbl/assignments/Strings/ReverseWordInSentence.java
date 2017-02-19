

//  Write a program to reverse each individual word in a sentence.


package com.wbl.assignments.Strings;

public class ReverseWordInSentence {

	public static void main(String[] args) {
 
		String sentence = "I am a girl";
		
		System.out.println("\n\nThe Original Sentence is : " + sentence);

		String[] words = sentence.split(" ");
 		
		
		System.out.print("\n\nThe Reversed Sentence is : ");
	
		for(String s : words) {
    		System.out.print(" ");
			char[] ch = s.toCharArray();
			for(int i = s.length()-1; i >= 0 ; i--){
				System.out.print (ch[i]);
				
				
				
			}
		}
		
	}

}
