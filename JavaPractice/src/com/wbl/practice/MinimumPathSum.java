
/*
Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.
For example, given the following triangle

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]

The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

*/


package com.wbl.practice;


public class MinimumPathSum {
	
	public static void main(String args[] ) {
	int[][] num = {
			{2},
			{3,4},
			{6,5,7},
			{4,1,8,3}
	};
	
	MinimumPathSum mps = new MinimumPathSum();
	
	int result = mps.printPath(num);
	
	System.out.println("\n\n The minimum path sum from top to bottom in the given traingle is : " + result);
	}
	
	
	public int  printPath(int[][] numbers) {
		
		int[] temp = new int[4];
		int least = 0;
		int total = 0;
	
	for(int i = 0; i < numbers.length; i++) {
		least = numbers[i][0];
		for(int j = 0; j <= numbers[i].length-1; j++ ) {
			
			temp[j] = numbers[i][j];
 		
	        if(least >= (temp[j])) {
	        					
				least = temp[j];
			}
 
		
 		System.out.println("number : " + temp[j]  );
		}
		
		System.out.println( "least : "  + least);

 		total = total + least;
 		
 		
	}
		
		return total;
	}
	 
}
