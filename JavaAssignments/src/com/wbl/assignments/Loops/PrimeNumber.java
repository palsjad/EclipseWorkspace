

//    Write a program  to check if a given number is prime or not.

 
package com.wbl.assignments.Loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		System.out.println("\n Enter the number \n" );
		Integer num = scan.nextInt();
		scan.close();
		Integer[] divisors = new Integer[20];
		int j = 0;
 		

		for(int i = 2; i < num; i++){
			
			   if((num % i) == 0) {
 
				divisors[j] = i;
				j++;
			   }
 	
		}
		if (j > 0)	{
			System.out.print("\nThe given number is not a Prime Number. It is divisible by : ");

			int i = 0;
 			while(divisors[i] != null)	{
			System.out.print(divisors[i] + "  ");
			i++;
			}
		}
		else
		{
			System.out.println("\n" + num + "  is a Prime Number \n");
		}	
		
	}

}
