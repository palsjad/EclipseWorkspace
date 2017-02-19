

/*
a. Write a program having different methods to perform below operations.
  			--> To create an arraylist and add elements to it.
  			--> To search for an element in the list.
  			--> To print the elements of the list using iterator.
  			--> To print the elements in the reverse order using ListIterator.
*************************************************************************************************
*/


package com.wbl.assignments.Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;

public class CreateSearchPrintList {

	public static void main(String[] args) {
		
//		ArrayList<String> animals = new ArrayList<String>();
 		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		CreateSearchPrintList csp = new CreateSearchPrintList() ;
		
		
		ArrayList<String> animalsList = csp.createList(br);
	//	csp.searchList(br, animalsList);
		
//		csp.printList(animalsList);
		
		csp.printReverseList(animalsList);

		
	}	
		public ArrayList<String> createList(BufferedReader br) {
			
			ArrayList<String> animals = new ArrayList<String>();	
		 
		System.out.println("Enter 5 animal names each on new line: \n" );
		
		for(int i = 0; i < 5 ; i ++) {
		try {
			animals.add(br.readLine());
		} 
		
		catch (IOException e) {
 			e.printStackTrace();
		}
		
		
		}
		System.out.println("The  first animal in the animal list is : " + animals.get(0));
        return(animals);
		}

		
// to search a given animal in th Array list
		
		
	public void searchList(BufferedReader br, ArrayList<String> list)	{
		String animalSearch = "";
		System.out.println("Enter the animal name you want to search : \n" );
        try {
			animalSearch = br.readLine();
 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n the animal to search is :  " + animalSearch + " and the size of the Array List is : " + list.size() + " \n");

        for(int i = 0 ; i <=  list.size()-1; i++) {
 //   		System.out.println("\n inside for loop "  + list.get(i));
 

                if (list.get(i).matches(animalSearch)){
                	
        		  System.out.println(list.get(i) + " is found in the list. The element number is : " + i + " \n");
        		  
        	  }
        	  
        	
        	
        }
        
	}
	
	
        
 // To print the created Array List
        
        public void printList(ArrayList<String> list) {
        	
        	
        	System.out.println("The created Array list is as follows \n");
        	for(int i = 0; i < 5 ; i ++) {
        		
        		
        		System.out.println(list.get(i) + " \n");
        	}
        	
        }   	
        	
 // To print the created Array List  in the reverse order using ListIterator
	
	  public void printReverseList(ArrayList<String> list) {
	
	System.out.println("The created Array list in the Reverse Order is as follows ");

		 ListIterator<String> itr =  list.listIterator(5);
		while(itr.hasPrevious()) {
			System.out.println(itr.previous() + "\n");
		}
	/*	
		for(int i = 4; i >= 0 ; i --) {
		System.out.println(list.get(i) + " \n");
		}
            	   	
       */ 	
    
	  }		

 
	}

 
