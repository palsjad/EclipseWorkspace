package com.wbl.JavaProblem;

import java.util.Arrays;

public class GiveSpaceBetweenLetters {

	public static void main(String[] args) {
		
		String name = "pallavi";
		
		
		GiveSpaceBetweenLetters gs = new GiveSpaceBetweenLetters();
		
		gs.giveSpaces(name);
		
 
	}
	
	public void giveSpaces(String nm) {
		
		char[] str = nm.toCharArray();
		
	// 	char[] strNew = new  char[(nm.length() + (nm.length()-1))];
		
		int len = nm.length();
		
   char[] strNew = new  char[len + (len-1)];

	 	 
	 	for(int i = 0, j=0; i < nm.length(); i++, j++) {
	 		
	 		strNew[j] = str[i];
	 		j++;
	 		strNew[j] = ' ';
	 		
	 		
	 		
	 	}
 
		System.out.println(Arrays.toString(strNew));
	}

}
