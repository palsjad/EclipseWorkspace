
// Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".

package com.wbl.assignments.Strings;

public class ConvertString {

	public static void main(String[] args) {
		
		
		String sentence = "I am a girl";
		
		System.out.println("\n\nThe original sentence is : " + sentence);

		System.out.print("\n\nThe altered sentence is : ");

		String[] words = sentence.split(" ");
		int i = 0;
		
		for(String s : words) {
			i++;
			System.out.print(s+i + " ");
		}
		

	}

}
