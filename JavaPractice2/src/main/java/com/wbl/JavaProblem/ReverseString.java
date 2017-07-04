package com.wbl.JavaProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
 
		
		reverseStr();
	 	reverseStr2();

		
	}

	
	
	public static void reverseStr() {


		String str = "Hello Human Being";


		String[] str1 = str.split(" " );

		System.out.println(str1.length);


		for(int i = str1.length-1; i >= 0; i--) {


		System.out.print(str1[i]);
		
		if(i != 0) {
			
		System.out.print(" ");
		
		}



		}



		}
	
	public static void reverseStr3() {
		
		String str = "Hello Human Being";
		
	//	for(int i = 0; )
		
	}
	
	public static void reverseStr2() {
		
		String str = "Hello Human Being";
		
		 
		
		char[] newCh = str.toCharArray();
		
		System.out.println("pallavi : " + newCh.length);

		for(int i = newCh.length-1; i > 0 ; i-- ) {
			System.out.println("pallavi : " + newCh.length);

			if(newCh[i] == ' ') {
				
				printStr(newCh, i);
				
				
			}
		 			
			
			 
			
			
		}
		
		
		}
	
	
	
	public static void printStr(char[] temp, int i){
		
		System.out.println("entered print str " + Arrays.toString(temp));

		
		for(; (i > temp.length || temp[i] != ' '); i++) {
			
			
			System.out.print(temp[i]);
		}
		
	}
}
