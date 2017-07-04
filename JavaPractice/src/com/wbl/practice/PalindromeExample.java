package com.wbl.practice;

import java.util.ArrayList;
import java.util.List;

public class PalindromeExample {
	
	
	
	public static void main(String args[] ) {

		String[] words = {"cat", "bat", "tab"};
 
		   int flag = 0;
		   
		   char[] str1 = new char[words[0].length()];
		   char[] str2 = new char[words[1].length()];
		   
		   
		/*   
		 	List<Integer> palinIndex = new ArrayList<Integer>();
		 	List<Integer> palinString = new ArrayList<Integer>();
		 	*/
		   
		  int[][]  palinIndex  = new int [0][0];
		  
		  String[][] palinString;
		 	
		 	
		   
 int m,n;
 
 	for( m = 0, n=1; m < words.length-1; m++ , n = 0)	   {
 		
 		System.out.println("first for loop m : " + m + " n : " + n);

	 
		 	for( int a=0, b=0 ; n <= words.length-1;  n++,  flag = 0)	   {
		 		
		 		System.out.println("second for loop m : " + m + " n : " + n); 		 		
				 
				   if(n == m ) {
					   
					   break;
				   }
		 		   else {
				   
		           	int res = compareStrings(words[m], words[n]);
		           	 
		           	
		            if(res == 0)
		           	
		           	palinIndex[a][b] = m;
		           	palinIndex[a][b] = n;

		        //    palinString
		           	
				   
		 		   }
		   
		 	}
		 	
 	}
	
	
	
 	}	
	
 
	
	
	public static int compareStrings(String word1, String word2){
		
	 	char[] str1;
	 	char[] str2;
	 	
		str1 = word1.toCharArray();
	    str2 = word2.toCharArray();
	    
	    
	 	int flag = 0; 
	 	
	     String[] palinString ;
//	     int[] 
  
	 	
		
   for(int i = 0, j = 2; i < str1.length; i++, j--) {
			   
			   System.out.println(str1[i] + "  " + str2[j]);
  
			   
			     if(str1[i] != str2[j]) {
			    	 flag = 1;
			    	 break;
			     }
			     
 		   }
		   
	    System.out.println("flag : " + flag);
		   
		   if( flag ==  0) {
 			   
			   System.out.println("the words " + word1 + " and " + word2 + "  is a palindrome");
			   
			   

			  
		
		
	}
	
	
			return flag;
			
			

	
}
	
	
}
