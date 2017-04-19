package com.wbl.practice;

import java.util.Scanner;

public class UserDataInput {

 		
		 
		     public static void main(String args[])
		     {
		         Scanner scn = new Scanner(System.in);
		         System.out.println("Enter an integer");
		         int a = scn.nextInt();
		         
		         scn.nextLine();                // giving this .nextLine() ensures that the cursor goes for the next input 
		        
		         System.out.println("Enter a String");
		         String b = scn.nextLine();
 		         System.out.printf("You have entered:- "
		                 + a + " " + "and name as " + b );
		         
		         scn.close();
		     }
		 
		
  

}
