
//   Write a program to perform a linear search on any given array.
//   Linear search is the basic search where you look for the element to be searched in a sequential way.


package com.wbl.assignments.Arrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
   int[] numArr = {2,3,6,7,5,8,5,1};
   
   Scanner scanner = new Scanner(System.in);
   System.out.print("\n\nEnter the number you want to search in the given array - {2,3,6,7,5,8,5,1} ");
   String st = scanner.nextLine();
   scanner.close();
   
   
   int num = Integer.parseInt(st);
   String f = "not found";
   
   System.out.println("\n\nThe number to be found is : " + num + "\n\n");
   		
		for(int i = 0; i <= numArr.length-1; i++){
			if(num == numArr[i]) {
				System.out.println("\nFound the number " + num + " in the array. It is at the " + i + " index");
				 f = "found";
			}
		}
        if (f == "not found"){
        	System.out.println("Number not found");
        }
        

        	
        }
	}
 
	 