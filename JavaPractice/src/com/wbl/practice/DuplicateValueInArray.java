
//  In an integer array, there is 1 to 100 number, out of one is duplicate, how to find that duplicate number?

package com.wbl.practice;

import java.util.Arrays;

public class DuplicateValueInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18 };

		int num = 0;
		int i = 0;

		System.out.println("\n\nThe given array of numbers is : " + Arrays.toString(numbers));

		for (num = numbers[0], i = 1; i < numbers.length; num = numbers[i], i++) {

			// System.out.println("the array number is : " + numbers[i]);
			System.out.println("the num : " + num);

			if (numbers[i] == num) {

				break;
			}
		}

		System.out.println("\n\nThe duplicate number is : " + num);
	}

}
