package com.wbl.practice;

public class testJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 	frequencyOfString();
		
	}
	
	
	
	public static void  frequencyOfString() {


		String str = "java is java is not fun";


		String[] str1 = str.split(" ");

		String word = "";
		int count = 0;
		
 		for(int i = 0; i < str1.length; i++ ) {

		     word = str1[i];    //java
		     
		     System.out.println("word : " + word);
		     count++;
		     
		     for(int j = 0; j < str1.length; j++ ) {
		     
		      if (j != i) {
		      
		    	  System.out.println("word : " + word + " j " +  j + "i  " + i + " count : " + count);
		    	  
		    	  
		     if ( word.equalsIgnoreCase(str1[j]) ) {
		      
		          count++;
		          
		          } // end of if
		          
		       }  //end of if
		          
		      } // end of for loop 
		      
		   
		         
		System.out.println("the count for the word " +  word  + " is : " + count);

		count = 0; 
		
		
		}  // end of for loop




		}   // end of method 

}
