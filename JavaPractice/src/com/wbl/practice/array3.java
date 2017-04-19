/*
1) Find leader elements from an array?
Element is said to be leader if all the elements to its right side are smaller than itself.
i/p : {6,9,15,1,11,3,10}
o/p : 15, 11, 10

*/
package com.wbl.practice;

public class array3 {
	
	
	public static void main(String args[]) {

		int[] nums = {15,2,6,13,11,6,7,3,5,8,6,5};


          int i = 0;
          
			int temp = 0;

		for(int j = nums[i];  i <= nums.length-1;  i = temp + 1 ){
			
		  while( i <= nums.length-1){
             if (j > nums[i]) {
                    i++;
            	 
             }
             else
             {
            	 j = nums[i];
            	 temp = i;
            	 i++;

             }
		}
		  
	System.out.println(j);
	
	if (temp == nums.length-1){
		
		break;
	}else 
	{
	   j = nums[temp + 1];
	   
	}
		}
}
}