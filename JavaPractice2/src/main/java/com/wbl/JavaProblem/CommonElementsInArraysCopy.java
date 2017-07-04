
/*
How to find common elements in three sorted array? 
Examples:

input1 = {1, 5, 10, 20, 40, 80}
input2 = {6, 7, 20, 80, 100}
input3 = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
*/

package com.wbl.JavaProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
 import java.util.Set;

public class CommonElementsInArraysCopy {
	
	
//  public static Map<Integer, Integer> newList = new HashMap<Integer, Integer>();


	public static void main(String[] args) {
 
		int[] arr1 = {1, 5, 10, 20, 40, 80};
		int[] arr2 =  {6, 7, 20, 20, 80, 100};
		int[] arr3 = {3, 4, 15, 30, 70, 80, 120};
		
		int val = 0;
				
	//	Map<Integer, Integer> newList = new HashMap<Integer, Integer>();
		
//		  Set<Integer> newSet = new HashSet<Integer>();	
		
//		int[][] arr = new int[3][];
		
		List<int[]> arrList = new ArrayList<int[]>();
		
		List<Integer> commonNumbers = new ArrayList<Integer>();

		
		arrList.add(arr1);
		arrList.add(arr2);
		arrList.add(arr3);

		 System.out.println("\n\nThe common numbers in the given 3 arrays are - " );
         
         System.out.print("\n\nOutput : ");
	 
         int flag  = 0; 
         
		for(int i = 0 ; i < arrList.size(); i++ ) {
			
			int[] temp = arrList.get(i);
			
			
			for(int j = 0; j < temp.length; j++ ) {

			val = temp[j];  // first value from the first array
			
 			commonNumbers = compareNums(val, i, arrList, commonNumbers);
			
			}
			
			System.out.println("1 : " + commonNumbers.toString());

			
			Collections.sort(commonNumbers);
			Set<Integer> result = new HashSet<Integer>(commonNumbers);
			
			System.out.println("2 : " + result.toString());
		}
		
		
 		
	}
	
	
	public static List<Integer> compareNums(int val, int m, List<int[]> arr, List<Integer> commonNums){
		
//		System.out.println(val + "  " + m + "  " + Arrays.toString(arr.get(m)));
	 	 
		
		if((m+1) < arr.size()) {
			m++;
			
		}
		
		else {
			
	//		System.out.println("1111 " );
			return commonNums;

			
		}
	
		int[] nums = arr.get(m);

		
		for(int n = 0; n < nums.length; n++ ) {
			
			if(nums[n] > val) {
//				System.out.println("22222 " );

				return commonNums;

				
			}
			
			else if(nums[n] <= val){
				
				if(nums[n] == val) {
					
		//			System.out.println("matching number : " +  m + "  " + val);
					
 		    	 	commonNums.add(val);
					
		//		commonNums = findCommon(val, commonNums);
					 
		//			System.out.println("beofre size : " + commonNums.size());

					return commonNums;
				}
			}
			

		}
		
		return commonNums;

	}
	
	public static List<Integer> findCommon(int val, List<Integer> commonNums) {
		
 		System.out.println("pallavi : " + val + "  common nums " + commonNums.size());
		
		if(commonNums.isEmpty()){
			
			commonNums.add(val);
            return commonNums;
		}

	/*if(	commonNums.contains(val)){
		
		System.out.print( val);

	}
	
	else {
		
		commonNums.add(val);

	}
	*/
 
		for(int i = 0; i < commonNums.size(); i++) {			
			System.out.println("inside - commonNums numbers : " + commonNums.get(i));

 			if(commonNums.get(i).equals(val)) {
				
				System.out.println("inside : " + val);
			}
			
			else {
				
				commonNums.add(val);
			}
		}
		 
		return commonNums;
		
	}
	
	 	
		
	}
 
