
/*
Given a String- find pivot of the String and reverese string before and after pivot.
eg: WALMART - M is pivot so o/p is LAWMTRA
if its even then just reverse halves of string
eg: WALLMART - No pivot -so o/p is LLAWTRAM

*/
package com.wbl.JavaProblem;

public class FindPivotAndReverse {

	public static void main(String[] args) {
		
		int pivot = 0;
		int flag = 0;
		
		String str = "wallmart";
		
		if(str.length() % 2 == 0 ) {
			
			pivot = (str.length() / 2) - 1;
			flag = 1;
		}
		
		else {
			
			pivot = str.length() / 2 ;
		}
 
 		System.out.println("pvot : " + pivot);
		
		reverseString(str, pivot, flag);

	}
	
	
	public static void reverseString(String str, int pivot, int flag) {
		
		char[] word = str.toCharArray();
		
		
		for(int i = pivot-1 ; i >= 0; i--) {
			
			 System.out.print(word[i] );			
			
		}
		
 		if(flag == 0) {
	 	 System.out.print(word[pivot]);	
		}
		 
		 for(int i = str.length() - 1 ; i > pivot; i--) {
				
			 System.out.print(word[i] );			
			
		}

	}

}
