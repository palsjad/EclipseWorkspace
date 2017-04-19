package com.wbl.practice;

import java.util.Scanner;

public class SquareOfANumber {	
	
	public static int squareRoot(int num) {
		
		return (num * num) ;
		
	}

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your number\n");
			
		int num = scan.nextInt();	 
				
	 	
		System.out.println("the square root value for the number " + num + " is : " + squareRoot(num));
		
		scan.close();
		
	}

}
