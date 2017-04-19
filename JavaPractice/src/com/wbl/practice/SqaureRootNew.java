package com.wbl.practice;

import java.util.Scanner;

public class SqaureRootNew {

	public static void main(String[] args) {
 
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the numberr to find the square root \n" );
	double num = scan.nextDouble();
	scan.close();
	
	//double num = 35;
		
		double  val = 0; 
		double temp = 0;
		double i = 0;
		double j = 0;
		
 		
	for ( i = 0; val <= num; val = (i * i) ) {
		temp = val;
		i++;
		
	}
	
	i--;

	 System.out.println("the value is : " + temp + " " +  i);
	 
	
	 
	for(j = 0, val = 0; val <= num; i = j){
		j = num / i;
		  j = (j + i) / 2;         // calcalulate the average of 3 and 3.33 
		 System.out.println("the average value  of j is : " + j);		 
		 temp = j;
		 val = j *j;
 		
	}
		
		
	 System.out.println("the val  is : " + val + " j is " + j);
	
		
		
	}

}
