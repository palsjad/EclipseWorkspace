package com.wbl.JavaProblem;

public class Max2Numbers {

	public static void main(String[] args) {
		
		
		int[] nums = {-45,-5,-78,-87,-10,-12};
		
		maxNums(nums);
 
	}
	
	
	
	public static void maxNums(int[]arr) {

		int largest = arr[0];

		int secondLargest = arr[0];
		
		for(int i = 1; i < arr.length-1; i++) {

		    if(largest < arr[i]) {
			
			    secondLargest = largest;
			    largest = arr[i];
			   
			}else if(secondLargest <arr[i]){
				secondLargest= arr[i];
			}
			

		}

		 System.out.println(" the 2 max numbers in the array are : " + secondLargest + "  " + largest);

		}

}
