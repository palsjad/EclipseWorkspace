
//     Write a program to find a substring in a given string and then replace it with another string.


package com.wbl.advanced.StringBasics;

public class ReplaceSubString {

	public static void main(String[] args) {
		
		String sentence = "I am a girl";
		
	//	sentence = sentence.replace(sentence.substring(7,10), "boy");
		
		System.out.println("\n\nThe original sentence is : " + sentence);

		
		sentence = sentence.replace(sentence.substring(7 ), "boy.");

		System.out.println("\nThe new sentence is : " + sentence);
		
	}
}
