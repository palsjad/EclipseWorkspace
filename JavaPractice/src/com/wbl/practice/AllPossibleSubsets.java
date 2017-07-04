/*
Given a set of distinct integers, nums, return all possible subsets.
Note: The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]

*/

package com.wbl.practice;

import java.util.Arrays;

public class AllPossibleSubsets {
	// 1,2,3

public void printSubsets(int[] numbers) {
	
	int[] result = new int[numbers.length-1];
	
	for(int i = 0, j = 1; i < numbers.length-1; j++)  {
 
		if (j >= numbers.length) {
			i++;
			j=0;
		}
		
		if(i != j) {
		result[0] = numbers[i];
		result[1] = numbers[j];
		
		System.out.println(Arrays.toString(result));
 
		
		}
 	
	}
	
	
	int[] num = new int[1];
	for( int i = 0; i < numbers.length-1; i++) {
		num[0]= numbers[i];
		System.out.println(Arrays.toString(num));
		}
		
		System.out.println(Arrays.toString(numbers));

}
	
	
public static void main(String args[] ) {
	
	int[] num = {1,2,3};
	
System.out.println("\n\nThe given array is : " + Arrays.toString(num)+ " \n\n ");
	AllPossibleSubsets aps = new AllPossibleSubsets();
	
	
	aps.printSubsets(num);
	
	
	
	
	
	
	
}

}
