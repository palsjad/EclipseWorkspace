package com.wbl.practice;

import java.util.Scanner;

public class FindNonRepeatedCharacter {
	
	
public static void main(String[] args  ) {	
	//String name = "pallavi";
	
	System.out.println("Please ener a string" );
	
	Scanner scan = new Scanner(System.in);
	
	String name = scan.nextLine();
	
	scan.close();
	
	
	FindNonRepeatedCharacter fnr = new FindNonRepeatedCharacter();
   
	fnr.readStr(name);
//	name.
}



public void readStr(String nm) {
	
	char[] nmCh = nm.toCharArray();
    char temp ;
    int count = 1;
    
    temp = nmCh[0];
    
	for(int i = 0; i < nmCh.length; i++ ) {
		
 		temp = nmCh[i];
 		
 		System.out.println("temp : " + temp);
		
		for(int j = 0; j < nmCh.length; j++) {
			  
			 if(i != j) {
				 
				 if(temp == nmCh[j]) {
					 
					// System.out.println("the first non repeated character in the string is : " + nmCh[i]);
					  count++;
				 }
			 }
		}
		
 		if (count == 1){
 			System.out.println("the first non repeated character in the string is : " + temp);
 			break;
 		}
 		
 		else {
 			count = 1;
 		}
		
		
	}
}
}
