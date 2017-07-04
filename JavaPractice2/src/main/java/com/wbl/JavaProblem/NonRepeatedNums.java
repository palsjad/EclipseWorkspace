package com.wbl.JavaProblem;

public class NonRepeatedNums {

	public static void main(String[] args) {
		
		int[] nums = {2,3,4,2,3,7,5};
		
		nonRepeatedNums(nums);
 
	}
	
	
	
	public static void nonRepeatedNums(int[] arr) {

		  int temp = 0;
		  int flag = 0;
		   for(int i = 0; i < arr.length; i++) {
		       
			   temp = arr[i];
			   
 		 	   
			   for(int j = 0; j < arr.length; j++) {
				   
 			    
				  if(j != i) {
				   if(arr[j] == temp) {
 	 			   
				      flag = 1;
					  break;
			 	   
				   }
			   
			   }
			   			   
		   }
		       
		     if(flag == 0) {
			 
			    System.out.print(arr[i] + " ");
				flag = 0;
			 }
		     
		     else  {
		    	 
		    	 flag = 0;
		     }
		   
		   
		   }


		}


}
