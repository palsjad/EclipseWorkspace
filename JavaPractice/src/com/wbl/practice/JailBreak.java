/*

Write a program to find out the total number of jumps he has make, to escape from the Bhopal jail.

Input Format
	Your function has to take three arguments where
	
	Argument1 : An integer depicting X   - jump (5)
	Argument2 : An integer depicting X   - slide doen by ( 1 )
	Argument3 : An array of N integers having the height of each wall {10, 12}

*/

package com.wbl.practice;

import java.util.Scanner;

public class JailBreak {

	
	
	
	
	public static void main(String args[] ) {
		
		int jump = 5;
		int slide = 1;
//		int[]wallHeight  = {13,20, 25};
 		int[]wallHeight  = {5,4,14};
		
		
		JailBreak jb = new JailBreak();
		
		Scanner scan = new Scanner(System.in);
		
	//		scan.nextLine();
			
			scan.close();
		
		
		jb.totalJumps(jump,slide,wallHeight);
		
 	}
	
	
	public void totalJumps(int jump, int slide, int[] wallHeight) {
		
		int total = 0;
		
		
		int temp = 0;
		int wall = 0;
 
	for(int i = 0  ; i < wallHeight.length; i++)	{
		
		System.out.println("The wall height is : " + wallHeight[i]);
		

		 wall = wallHeight[i];
		 
	  

		for (total = 0; wall >= 5; total++ ) {
			
			temp = wall - (jump - slide);  // temp = 9-4 : 5
			
 
			wall = temp;
 				
		}	
		
		
	if (wall <= 5 ) {
			
			total++;
			
//			System.out.println("The total number of jumps amde by the activist are  : " + total);

 
		}
		
	System.out.println("The total number of jumps amde by the activist are  : " + total);

		}
		
		
 
 		
		
	}
	
}