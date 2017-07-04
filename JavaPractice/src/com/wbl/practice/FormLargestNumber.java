/*

Given a list of non negative integers, arrange them such that they form the largest number.
For example, given [3, 30, 34, 5, 9], the largest formed number is 9534330.
Note: The result may be very large, so you need to return a string instead of an integer.

*/

package com.wbl.practice;
 
public class FormLargestNumber {

	public static void main(String args[]) {
	int[] num = {3,30,34,5,9};
	
	
 	    String res = "";

	    for (int i = 0; i < num.length; i++) {
	        res = res + num[i];
	    }

	   
	    System.out.println(res);   
	    
		int[] numbers = new int[res.length()]; 

	    
	    for (int i = 0; i < res.length(); i++) {
	         numbers[i] = Character.getNumericValue(res.charAt(i));
	    }
	    
	    System.out.println("\n\nresult first character : " + numbers[6]);
	    
	    
	    int temp = 0;
 	    
	    int size = numbers.length;
	    
	    int i ,j = 0;
	    
	    for(i = 0 ; i < numbers.length; i++,size--) {
	    	
	    	System.out.println("size : " +  size);
	     
	       for(  j = 0; j < size; j++) {
	    	   
	    	   if ((j+1) == size) {
	    		   break;
	    	   }
	    	   
                if ( numbers[j] <= numbers[j+1]) {
			    	
			    	temp = numbers[j+1];
			    	numbers[j+1] = numbers[j];
			    	numbers[j] = temp;
			    	
			    }
 	    	  System.out.println("numbers after swap : " + numbers[j] + "  " + numbers[j+1]); 
 
			   
	       }
	       
	    	 
		    }
	    
	    
	    System.out.print("\n\n The sorted list is :  "); 

	       for ( i = 0; i < numbers.length; i++) {
	 	    	  System.out.print(numbers[i] ); 
 	       
	    }
	    	   
	  
	    
	}	    
}
