

/* Write a program  to check an Armstrong number i.e. whether the if we
   power up the each individual number to the total number of digits in
   the number and add them it should be equal to the number itself.
   For example 153 has 3 digits in it and if we do 1^3+5^3+3^3=153.
*/ 

package com.wbl.assignments.Loops;



public class ArmstrongDemo {


public static void main(String[] args) {
		

//int input=1234;	

//Integer n = new Integer(input);
	
Integer n = 456789;	
	

String num = n.toString();
 
char[] arr  = num.toCharArray();

// System.out.println("The input number is : " + arr);

 System.out.println(arr);

 
int result = 0;
 
  for (char ch : arr ) {

	  int temp,temp1 = 1 ;
	  temp = Character.getNumericValue(ch);
	  
      System.out.println ("The integer is : " + temp + "\n");   
 

      for(int i = 0; i < arr.length; i++) {
	     temp1 = temp * temp1;
	     
	}
      
    System.out.println (ch + " raised to the power of " + arr.length + " is : " + temp1 + " \n");
  
    result = result + temp1;
    
  }		

    System.out.println ("the armstrong number is : " + result);
 
	}

}
