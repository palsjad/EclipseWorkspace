
 /*
   Write a program that takes input from user dynamically using below classes.
	--> Scanner: Use this class to input 2 integer numbers and sum them.
	--> BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them.
	--> DatainputStream: Use this class to input 2 integer numbers and multiply them.
	--> Console: Use this class to input 2 integer numbers and divide them.


*/
package com.wbl.assignments.FileHandling;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
//import java.io.EOFException;
import java.io.FileInputStream;
// import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicUserInput {

	// Accepting input from the user using Scanner Class 		
		public void ScannerClass() {	
			Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter your First Number : ");
	    	String input1 = scanner.next();
	    	System.out.println("Enter your Second Number : ");
	    	String input2 = scanner.next();
	    	scanner.close();
	   
	    	int num1 = Integer.parseInt(input1);
	    	int num2 = Integer.parseInt(input2);
	    	
	    	System.out.println("The Entered numbers are : " + num1 + " and " + num2);
	    	
	    	System.out.println("The sum of the two numbers is : " + (num1+num2));

	    	
		}
		
		public void  BufferedReaderandInputStreamReader() throws IOException {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			boolean status =  br.ready(); //to check if the buffered reader iss ready to read ...by defaultits true
			
			System.out.println(status);
			System.out.println("Enter 2 numbers for Subtraction : \n" );
		 	String input1 = br.readLine();
		  
			String input2 = br.readLine(); 
			 
		    br.close();
	// convert the String to integer by using Integer.parseInt()	
			
	//		int num1 = Integer.parseInt(input1);
			int num1 = Integer.valueOf(input1); // this or parseInt can be used
			int num2 = Integer.parseInt(input2);
			
			
	        int result = (num1-num2);
	        
	        System.out.println("The reesult of Subtracting "+ num2 + " from " + num1 + " is : "  + result);
			
	        
			 
		}
		
	public void DataInputStream() throws IOException {	
		DataInputStream din = null;
 	    try {
	      FileInputStream fin = new FileInputStream("test1.txt");

	      
	      din = new DataInputStream(fin);
	      
	      int count = din.available();  // gives the count of the elemetns in the file
	         
	      System.out.println("count : " + count);
	      	      
          byte[] b  = new byte[4];
	      
          din.read(b) ;
    
//      int c = Character.getNumericValue(b[0])  ;  // to convert the ascii value that i am getting into an int
	      
		   int i = 0 ;
	          
	        for(int s = 0; s <= b.length-1; s++)	{
	        	
	        i = Character.getNumericValue(b[s]) ;     // to convert the ascii value that i am getting into an int
	      
	        System.out.println("the int is : " + i);
	        }
	        
	        din.close();
 
	     
	      }
	     catch (EOFException ex) {
	    	System.out.println("eof" );
	      din.close();
	    } catch (IOException ex) {
	      System.err.println(ex);
	    }
	    
}
		
// giving 	java.lang.NullPointerException	
		 
		public void ReadFromConsole() {
			
 			System.out.print("Please enter the first number ");
 			 
			String input1 = System.console().readLine().toString();
        	String input2 = System.console().readLine();
			 
			System.out.println("Please enter the second number " + input1 + " " + input2);

			int num1 = Integer.parseInt(input1);
			int num2 = Integer.parseInt(input2);
 
			int temp = 1;
			temp = num1 / num2;
			
			System.out.println("The answer is : " + temp);
			
			}	
		 
	
	
	public static void main(String[] args) throws IOException {
		
	   DynamicUserInput input = new DynamicUserInput();
		
    input.ScannerClass(); 
  //  input.BufferedReaderandInputStreamReader();
		
  //     input.DataInputStream();
        
 //     input.ReadFromConsole();
    
     
        
}
}