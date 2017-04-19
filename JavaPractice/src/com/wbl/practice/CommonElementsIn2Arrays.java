/*
Write a program to identify common elements or numbers between 
two given arrays.

{2,3,4,6}
{3,7,10}

o/P: 3

************************************************************************
*/
package com.wbl.practice;

public class CommonElementsIn2Arrays {
	
	public static void main(String args[]) {
	int[] num1 = {2,5,1,7,4};
	int[] num2 = {4,9,0,7,2,1};

	System.out.println("the matching numbers are ");

		for( int i = 0; i < num2.length; i++) {
		for( int j = 0; j < num1.length; j++) {
		if( num2[i] == num1[j] ) {
		  System.out.print(num2[i] + " ");
		  break;

		}

		}
		}


		}
 
}
