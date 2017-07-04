package com.wbl.practice;

import java.util.Arrays;

public class RemoveCharFromString {

	public static void main(String[] args) {
 
		
     String name = "riva";
    
    StringBuffer sb = new StringBuffer("riva") ;
    
//    sb = "riva";
    
    char remove = 'v';	
    
	System.out.println("\n\n\nthe given string is : " + sb);

  // using string buffer  
    stringBufferremoveChar(sb, remove);
    
  // using regular string
    stringRemoveChar(name, remove);
		
	}

	
	public static void stringBufferremoveChar(StringBuffer nm, char rem) {
		
		System.out.println("Using String Buffer method\n");

		
//		char[] str = nm.to
		
		
		
		
		for ( int i = 0; i < nm.length(); i++) {
			
			  if(nm.charAt(i) == rem) {
					System.out.println("entered " +  nm.charAt(i));

			      nm.deleteCharAt(i);
			      
				  break;
				  
			  }
 			
		}
		
		System.out.println("\n\n\nthe new string is : " + nm);
	
	}
	
	
	public static void stringRemoveChar(String nm, char rem) {
		
		System.out.println("Using regular String method\n");

		
		char[] str = new char[nm.length()-1];
		
		for(int i = 0, j = 0; i < nm.length(); i++ ) {
		 
		//	System.out.println("nm.char : " + nm.charAt(i) );
			if(nm.charAt(i) != rem) {
				str[j] = nm.charAt(i);
				j++;
			}
			
		}
		
		System.out.println("\n\n\nthe new string is : " + Arrays.toString(str));

		
	}
}
