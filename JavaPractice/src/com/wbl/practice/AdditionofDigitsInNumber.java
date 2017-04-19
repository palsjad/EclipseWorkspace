/*

2) Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
For example:
Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?

*/

package com.wbl.practice;

public class AdditionofDigitsInNumber {

	public int addDigits(char[] value) {

		int j = 0;

		String result = "";

		for (int i = 0; i < value.length; i++) {

			j = Character.getNumericValue(value[i]) + j;

		}
		
		result = String.valueOf(j);

		char[] arr = result.toCharArray();

		if (arr.length > 1) {

			j = addDigits(arr);

		}
		
		return j;
	}

	public static void main(String args[]) {

		AdditionofDigitsInNumber adn = new AdditionofDigitsInNumber();

		int givenNum = 345678;
		String num = String.valueOf(givenNum);

		char[] val = num.toCharArray();

		System.out.println("\n\nThe given number is : " + givenNum);
		System.out.println(
				"\n\nThe addition of all the digits in the number till 1 digit remains is : " + adn.addDigits(val));

	}

}
