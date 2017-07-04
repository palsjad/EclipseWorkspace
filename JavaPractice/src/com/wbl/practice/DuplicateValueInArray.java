
//  In an integer array, there is 1 to 100 number, out of which one is duplicate, how to find that duplicate number?

//  In an integer array, there is 1 to 100 number, out of which many are duplicate, how to find those duplicate numbers?


package com.wbl.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateValueInArray {

	public static void main(String[] args) {

//		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18 };
		
		
 		int[] numbers = { 1, 2, 3, 4, 18, 4, 5, 6, 7, 8, 9, 10, 11, 11, 12, 13, 14, 15, 1, 16, 17, 3, 18 };


		int num = 0;
		int i = 0;

		List<Integer> finalList = new ArrayList<Integer>();
		
		
		System.out.println("\n\nThe given array of numbers is : " + Arrays.toString(numbers));

		for (num = numbers[0], i = 1; i < numbers.length; num = numbers[i], i++) {

			// System.out.println("the array number is : " + numbers[i]);
			System.out.println("the num : " + num);

			if (numbers[i] == num) {
				
				finalList.add(numbers[i]);

		//		break;
			}
		}

//		System.out.println("\n\nThe duplicate number is : " + num);
		
		System.out.println("\n\nThe duplicate number is : " + finalList.toString());

		
		
	}

}
