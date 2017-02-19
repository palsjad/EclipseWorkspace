
/*   Write a program to check if a given string of parenthesis has balanced parenthesis or not.
     For example a string as "(())" is a valid string where as strings like ")(" or "(()))" are not valid strings.
*/


package com.wbl.assignments.Strings;

import java.util.Scanner;

public class BalancedParenthesis {

	public static void main(String[] args) {
		
	//	String temp = "(()"; // "(())"  ")("	
		
		Scanner scan = new Scanner(System.in);
		
    	System.out.println("\nEnter the Parenthesis : ");

		String temp = scan.next();
		
//		String temp = ")(";
		
		char[] paren = temp.toCharArray();
		
/*      char paren1 = ')';
		char paren2 = '('; 
		
		int value1 = (int) paren1; // casting
		int value2 = (int) paren2; // casting
*/
		scan.close();
		
		int i, j, k;
				
		for(i = 0, j = 0,k = 0; i <= paren.length-1; i++){
			
			if(paren[0] == ')'){
				j = 1;  // have to change the values for j and k to print that its not balanced
				k = 2;
				break;
			}
			
			if(paren[i] == '('){
				j++;
			}
			else if (paren[i] == ')'){
				k++;
			}
			else {
				System.out.println("Invalid inputs\n");
			}
		}
		
		if (j == k){
			
			System.out.println("\n\n" + temp + " : : The parenthesiss' are balanced");
		}
		else {
			System.out.println("\n\n" + temp + " : : The parenthesiss' are not balanced");

		}
		
		
	}

}
