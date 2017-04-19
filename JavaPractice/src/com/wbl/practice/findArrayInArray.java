package com.wbl.practice;

public class findArrayInArray {
	
	public static void main(String args[]) {

		int[] a = {3,4,5,6,1 };

		int[] b = {5,6,1};

		int flag = -1;
		int i = 0;
        
		for( int j = 0 ; i <= a.length-1;  ) {
			
 	 		if (flag == 1) {
			
 				i = i - b.length;
	     
	     	}
	 
		      while(j <= b.length-1){ 
/*		    		 System.out.println("j value: " + j + "  " +  b[j]);
		    		 System.out.println("i value: " + i + "  " +  a[i]);
*/
 	     if(a[i] == b[j]){
			     j++;
			     i++;
				 flag = 1;
 				 System.out.println("i and j  and flag : " + i + "   " + j +  "  "  + flag);
			 }
			 
			 else  {
				i++; 
			 flag= -1;
			 
			 System.out.println("inside else : " );
			 break;
		      }  
 	     
 	     	
 
		}

	 	System.out.println("the flag is : " + flag);

		}

}

}
