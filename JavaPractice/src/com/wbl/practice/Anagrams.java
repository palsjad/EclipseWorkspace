package com.wbl.practice;

public class Anagrams {

	public static void main(String args[]) {

	/*	String anagram1 = "silent";
		String anagram2 = "listnr";*/

		
		String anagram1 = "debit card";
		String anagram2 = "bad credit";
		
 
		 matchString(anagram1, anagram2);

	}

	public static void matchString(String an1, String an2) {
		
		char ch ;
 		int count = 0;

		if (an1.length() != an2.length()) {
			
			System.out.println("the strings are not the same size , hence they cannot be anagrams");
		}
		
		else {

			for (int i = 0; i < an1.length(); i++) {
				
				ch = an1.charAt(i);
				
				 
				
				for (int j = 0; j < an1.length(); j++) {
					
					if(an2.charAt(j) == ch){
						
						count++;
						
						System.out.println("char : " + ch);
						break;
						
					}
					
				}
				
			}
			
			

		}  
		
		
		if (count == an1.length()){
			
			System.out.println("The strings '" + an1 + "' and  '" + an2 + "'  are anagrams\n");
		}
		else {
			
			System.out.println("The strings '" + an1 + "' and  '" + an2 + "'  are not anagrams\n");
		}
	}

}
