
/*
  Write a program to find duplicates in an array using set.
  ********************************************************

*/

package com.wbl.assignments.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindArrayDuplicatesUsingSet {

	public static void main(String[] args) {
		
		
		
		String[] animals = {"cat","dog","horse","cat","bird","tiger","dog","lion"};
		
		System.out.println("The animals in the array are : \n");
		for(String s : animals){
			
		System.out.println(s);
		}
		
		
		Set<String> animalSet = new HashSet<String>();
		
	//	 for(int i = 0; i <= animals.length-1; i++) {
			 
			 for(String s : animals) {
			 if (animalSet.add(s) == false) {
				 System.out.println("There is a duplicate animal name which will not be added to the Set. It is : " + s);
			    }
			 }
			 
			System.out.println("\n\n The animals in the new Set  are : \n");

			Iterator<String> itr = animalSet.iterator();
			
		 
			
			while(itr.hasNext()){
				
				System.out.println(itr.next());
	
			}
	// Another way to print is as below		
			
	//To print the Set without the duplicate animal names 	
			 
				for(String s : animalSet){
					
				System.out.println(s);
				}
 
	}

}
