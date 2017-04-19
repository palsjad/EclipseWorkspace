/*
2) Write a program to return index  in first array where you 
found complete second array , if not found return -1
eg:
{3,4,5,6,1}, {5,6}
o/p is 2 bcz at index 2 of first array i have second array

*/
package com.wbl.practice;

public class findArray1 {
	
	public static void main(String args[]) {

		int[] a = {3,4,5,6,1 };

		int[] b = {5,6};
		
/*		test cases 
		
		int[] b = {3,4};
  		int[] b = {4,5};
		int[] b = {5,6,1};
		int[] b = {6,1};
		int[] b = {1};
	
		
		*/
		
		
		int flag = -1;
		int i = 0;
		int tempi = 0;
		
		int bLength = b.length;
        
		for( int j = 0 ; i <= a.length-1; i++) {
		//	 System.out.println("OUTSIDE : j and its value : " + j + "  " + b[j] + "blength " + bLength + " a " + a[i]);
			
			 if (j <= bLength-1 && b[j] == a[i]) {
 				 
				 tempi  = i;
			 
 			    	 i++;
 			    	 j++;
 			    	 flag = 1;
		    	while(j <= bLength-1) {

		    		if(b[j] == a[i]){
 			    		i++;
 			    		j++;
 			    		flag = 1;
 			    	}	
		    	}
 			    	 
 			    
 		   	}
			 
  		 
			
		}
		
		
		if( flag == -1) {
			
			System.out.println("The 2nd array could not be found in the 1st array \n");
		}
		
		else if (flag == 1) {
			
			System.out.println("The starting index of the 2nd string in the 1st string is : " + tempi);
		}
		
		
	}
	
}