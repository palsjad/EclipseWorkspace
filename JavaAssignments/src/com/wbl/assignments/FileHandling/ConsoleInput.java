package com.wbl.assignments.FileHandling;

public class ConsoleInput {

	public static void main(String[] args) {
		
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
	 
		
		
		
 
	}

 
