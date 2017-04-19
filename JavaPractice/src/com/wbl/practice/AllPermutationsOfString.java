
/*How to find all permutations of String?
for example,input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".


*****************************************************
*/
package com.wbl.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AllPermutationsOfString {

	public static void main(String[] args) {

//		String str = "palsj";
//		String str = "xyz";
//		String str = "pals";

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\nEnter the string to find all possible arrangements (Eg : 'xyz', 'pals', 'palsj' )\n\n");
		
		String str = scan.nextLine();
		scan.close();

		char[] chArr = str.toCharArray();
		char[] temp1 = new char[chArr.length];

		temp1 = chArr;

		int len = chArr.length;
 
 
		for (int cnt = 0; cnt < len; cnt++) {
			
			System.out.println("letter : " + temp1[0]);

			
			for (int i = 1; i < len; i++) {

		    	temp1 = printString(temp1);  // to print the first swap
			}

			temp1 = moveString1(temp1, 0);

 
		}

	}

	public static char[] printString(char[] ch) {
 
		int j = 0;
		int i = 0;
		char[] temp = new char[ch.length];
		char res1 = 0;
		char res2 = 0;

		for (j = i, i = 0; i < ch.length - 2; i++, j++) {

			temp[j] = ch[i];

		}

		res1 = ch[i];
		res2 = ch[i + 1];
		temp[j] = res2;
		temp[j + 1] = res1;

		System.out.println("P : " + Arrays.toString(temp));
        if (ch.length > 3) {
		temp = moveString(ch);
        }
		return temp;

	}

	public static char[] moveString(char[] arr) {

		char value = ' ';
		char[] newArr = new char[arr.length];
		int i = 0;
		int j = 0;

		newArr[0] = arr[0];

		value = arr[1];                // store the 2nd value in a temp value and move it to the last index in the new array

 		for (i = 1, j = 2; j < arr.length; i++, j++) {
			newArr[i] = arr[j];

		}
		newArr[i] = value;
 	
  		System.out.println("M : " + Arrays.toString(newArr));


		return newArr;

	}
	

	public static char[] moveString1(char[] arr, int index) {

		char value = ' ';
		char[] newArr = new char[arr.length];
		int i = 0;
		int j = 0;

		value = arr[index];          // store the 2nd value in a temp value and move it to the last index in the new array

		for (i = 0, j = 0; j < arr.length; j++) {

			 
			if (j != index) {
 				newArr[i] = arr[j];
				i++;
			}

		}
		
		newArr[i] = value;
 
		return newArr;

	}

}
