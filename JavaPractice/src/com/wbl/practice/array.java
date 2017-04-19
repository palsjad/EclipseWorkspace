package com.wbl.practice;

public class array {
	
	public static void main(String args[]) {

		int[] nums = {2,6,13,11,6,7,3,5,6};

		//int value = 0;
 	   System.out.println( nums.length);
       System.out.println(8 /2);
       System.out.println(8 %2);

		for(int i = 0; i < nums.length-1; i++ ){
		    
		 for (int value = 0; i < nums.length-1; i++) {
		        i++;
		        value = nums[i];
		    	   System.out.println(value + "  " + i);

		       if (value < nums[i]){
		    	   System.out.println("ejlloe");
		           break;
		       }
		       System.out.println("the number is " + value);
		 }
		}
}
}