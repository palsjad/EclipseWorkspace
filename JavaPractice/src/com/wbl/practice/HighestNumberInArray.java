



package com.wbl.practice;

public class HighestNumberInArray {
	
	
	
	
	public static void main (String args[] )  {


		 int[] numList = {4,8,24,9,3,50,4};

		int num = numList[0];
		 

		for(int i = 1 ; i <= numList.length-1; i++) {
			   

		     if (num < numList[i] ){
		    	 
		    	 System.out.println("val : " + num + " numlist[i] " + numList[i]);
			      num = numList[i]; 
			 
			 }

		}

		System.out.println("The highest value is : " + num);

		}

}
