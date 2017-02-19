/*

  Write a program that is expected to throw a null pointer exception and in 
  turn handles it using try catch and finally.

  Write a program containing a function which is expected to throw any kind 
  of exception say NullPointerException or ArithmeticException etc and then 
  handle this function in the parent function which calls this function.

******************************************************************************
*/


package com.wbl.assignments.ExceptionHandling;

 import java.util.Scanner;

public class Exceptions {

 public static String nullStr1 = null;
	
 public  float divideBy;

 
// *******************************************************
 
// ************* NullPointerException*****************	
 

 public void nullPointExp()	{	
			
 	
	    try{
		 System.out.println(nullStr1.toString());    // the nullStr is pointing to null so it throws a nullpointer exception
	    }
	    catch(NullPointerException e){
	    	System.out.println("the nullStr is pointing to null so it throws a nullpointer exception \n");
	    	
	    }
		 
	}	 

 
//*******************************************************
 
 
// **** illegal State Exception-- implementing finally with try-catch


	public void illStateExp() {
		 
		
		Scanner scan = new Scanner(System.in);
	 try{
		System.out.println("this is exception testing \n");
		scan.close();
		String rdStr = scan.nextLine();
	 	System.out.println(rdStr);
	 } catch (IllegalStateException e){
		 
		 System.out.println("Got an Illegal State Exception as the scanner is closed before it can read \n");
	 }
		finally {
			
			scan.close();
		}
		
	}

	
	
//*******************************************************
	
// ************* ArrayOutOfBoundException*****************	
	
 
	public void arrOutOfBoundExp() {
		
		
		int[] myArray = {1,2,3,4,5,6};

		for(int i = 0; i <= myArray.length-1; i++ ){
	//		System.out.println(myArray[i]);
		}
		 
	}  
 
	
//****************************************************************	 
 
//******* Function where we catch the Arithmetic Exception ********** 
	
	
 public void calculations(float value){  
	 
	System.out.println("The value entered is : " + value + " \n "); 
	
	try{
		
	 calculateHalf(value);
	 
	} 
	catch(ArithmeticException e){
		
        System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
     }
	 
 }
	
 
 public float calculateHalf(float val){
  
	 System.out.print(" The entered value " + val + "  divided in half is "  );
	  
	 return   val / divideBy ;
	 
 }

//*****************************************************************************



	public static void main(String[] args) {
		
		Exceptions exp = new Exceptions();
		  
         exp.nullPointExp();
         exp.illStateExp();
		 exp.arrOutOfBoundExp();
		 
 	
// Calling a function that throws a null pointer exception and handling it here at the parent function	
	
		float num = 84;
		exp.calculations(num);
	}
	 
	}

 
