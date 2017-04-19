
/*Given a set of coins and amount, Write an algorithm to find out how many ways we can make the change of the amount using the coins given.   

i/p:
Amount = 5

coins [] = {1,2,3}

Ways to make change = 5

o/p:
{1,1,1,1,1} {1,1,1,2}, {1,2,2}, {1,1,3} {2,3}

*/


package com.wbl.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CoinsAndAmount {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the denominations of the coins with space in between \n : ");
		
		String num = scan.nextLine();
		
System.out.println("Please enter the Amount you want to make with the coins \n : ");
		
		String temp = scan.nextLine();
		
		scan.close();
		
		int amt = 0; 
		 
		String[] coinString = num.split(" ");

		amt = coinString.length;
    	System.out.println("string length : " + amt );

		 int[] coin = new int[amt]; // decalring an array 
		 
		 List<Integer> coinList= new ArrayList<Integer>();
		 
	    amt =  Integer.parseInt(temp);

		
    /*    for(int i = 0; i < coinString.length; i++ ) {
        	coin[i]= Integer.parseInt(coinString[i]);
        	System.out.println("coin array : " + coin[i]);
        	
        }
		*/
		 
			
			
    for(int i = 0; i <= coinString.length-1; i++ ) {
        	coinList.add(Integer.parseInt(coinString[i]));
        	System.out.println("coin array : " + coinList.get(i));
        	
        } 
     
	   Collections.sort(coinList);
	   
	   int total = 0;
//	   int val = 0;
	   
 
	    
	 for (int i = 0; i <= coinList.size()-1;  i++){
		 
		       total = total + coinList.get(i).intValue();
		       System.out.println(coinList.get(i).intValue());		
			
		 
				
				
				
			}
			
		}
		 
		
		
	}
 