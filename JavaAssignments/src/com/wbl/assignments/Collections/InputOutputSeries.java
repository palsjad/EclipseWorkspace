

/*
Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn 
and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.
*/


package com.wbl.assignments.Collections;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class InputOutputSeries {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> result = new ArrayList<String>();

//		InputOutputSeries ios= new InputOutputSeries();
//		
//		ios.usingList(scan);
        
		String st1 = "";		
		String st2 = "";

		
		System.out.println("Enter the 5 numbers in the first series with a space in between");
		st1 =  scan.nextLine();
 	 
		System.out.println("Enter the 5 numbers in the  second series with a space in between");
	 
		
		
		st2 =   scan.nextLine();

		 scan.close();
		 
	     String[] words1 = st1.split(" ");
	     String[] words2 = st2.split(" ");

 
// To rpint the output 
		
		 
		int i = 0; 
		System.out.println("the seize of word1 is : " + words1.length );
		System.out.println("the seize of series2 is : " + words2.length );
		
		
		for (String s : words1) {
		System.out.println("words1 : " + s);	
			
		}

		for (String s : words2) {
			System.out.println("words2 : " + s);	
				
			}

		
	  for( i = 0; i < 5 ; i++) {
		  
		  System.out.println("inside while " + words1[i] + " " + words2[i]);
		  
		  result.add(words1[i]);
		  result.add(" ");  
		  result.add(words2[i]);
		  result.add(" ");
			  
	  } 
		  
	 System.out.println("the Result size is : " + result.size());
	
	 System.out.println(" the Result is : " );

	 
	 for(i = 0; i < result.size() -1; i = i + 2){
		 System.out.print(result.get(i)+ result.get(i+1));
		 System.out.println(", ");
	 }
	 
	}
	
	

// Please ignore the below code as it gives the output with [ and ] for the first and last element	
	
	
	
	
 	public void usingList(Scanner scan) {
		
		List<String> series1 = new ArrayList<String>();
 		List<String> series2 = new ArrayList<String>();
		List<String> result = new ArrayList<String>();
		
		System.out.println("Enter the 5 numbers in the first series with a space in between");
		     series1.add(scan.nextLine());
		     
		System.out.println("Enter the 5 numbers in the second series with a space in between");

		     series2.add(scan.nextLine());
		     
		    
		 
	     
 	         String[] words1 = series1.toString().split(" ");
 		     String[] words2 = series2.toString().split(" ");
	 
 		 // To rpint the output 
 			
 			 
 			int i = 0; 
 			System.out.println("the seize of series1 is : " + words1.length );
 			System.out.println("the seize of series2 is : " + words2.length );
 			
 			
 			for (String s : words1) {
 			System.out.println("words1 : " + s);	
 				
 			}

 			for (String s : words2) {
 				System.out.println("words2 : " + s);	
 					
 				}

 			
 		  for( i = 0; i < 5 ; i++) {
 			  
 			  System.out.println("inside while " + words1[i] + " " + words2[i]);
 			  
 			  result.add(words1[i]);
 			  result.add(" ");  
 			  result.add(words2[i]);
 			  result.add(" ");
 				  
 		  } 
 			  
 		 System.out.println("the Result size is : " + result.size());
 		
 		 System.out.println(" the Result is : " );

 		 
 		 for(i = 0; i < result.size() -1; i++){
 			 System.out.print(result.get(i));
 			 
 		 }	           
		     

	}
 
	
	
}
