/*
Given array of numbers and expected sum,  return pair of numbers in array whose sum is equal to expected sum
eg:{2,3,5,7} ,  sum=10
o/p: {3,7

*/
package com.wbl.JavaProblem;

public class FindSumOFNumsInArray {

	public static void main(String[] args) {

		int[] numbers = { 2, 3, 5, 7 };
		int sum = 10;
		int total = 0;
		int val = 0;
		int i;
		int count = 0;

		for (i = 0; i < numbers.length; i++) {
			val = numbers[i];
			total = numbers[i];
			count = 1;

			for (int j = 0; j < numbers.length; j++) {

				if (i != j) {
 
					total = numbers[j] + total;
					count++;
				}

				if (count == 2) {
 
					if (total == sum) {

						System.out.println("\nthe numbers that make up the given sum of  " + sum + "  are : " + val + "  " + numbers[j]);
 
					}

					count = 1;
					total = numbers[i];
					
 				}

			}
		}

	}

}
