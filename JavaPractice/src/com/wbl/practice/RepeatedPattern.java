 
/*2.Write a program to find 2 letter repeated patterns in string and their count?
eg: i/p - String input = "ababahjabaghjabiaba";
o/p:
5::ab
2::hj
2::ja
4::ba
*/



package com.wbl.practice;

import java.util.ArrayList;
 import java.util.List;
 
 
public class RepeatedPattern {

	public static void main(String[] args) {
		
		String patternString = "ababahjabaghjabiaba";
	 		
	 	int i = 0;
	 	int m = 0;
		int count = 1 ;

	 	String pattern = " ";
		String newPattern = " ";
		
		char[] letters = patternString.toCharArray();
		
	    List <String> finalCount = new ArrayList<String>();
	 	  	 
        System.out.println("\n\nPattern String : " + patternString);
        
		for(m = i; i < letters.length-1; i = m, count = 1, i++){
			
             m = i;
             
             pattern = Character.toString(letters[i]) + Character.toString(letters[i+1]);
 			
 			 			
             if(!finalCount.contains(pattern)) 	{	
 				
 				for(i = i + 2; i < letters.length-1; i++) {

 					newPattern = Character.toString(letters[i]) + Character.toString(letters[i+1]);	
 				
// 	 			 	System.out.println(" pattern " + pattern +" new pattern: " + newPattern );
 					

 					if ( pattern.equals(newPattern)) {
 						count++;
 					}
                   
 				
			}
 				
			 if  (count > 1) {
			 
				 finalCount.add(pattern);
		 
			     System.out.println( pattern + " :: " + count); 
 	 
		    }
				 
		}	
             
	}
		
		
      /*  for(String s : finalCount) {
        	
        	System.out.println("final count : " + s);
        }*/
	}

}
