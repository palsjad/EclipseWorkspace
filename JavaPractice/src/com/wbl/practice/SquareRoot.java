package com.wbl.practice;

public class SquareRoot {
	
	
	
	public static void main(String args[] ){
		
		int num = 29;
		
		int val = 0; 
		int temp = 0;
		int i = 0;
		int j = 0;
		String[] root = new String[8];
		
	for ( i = 0; val <= num; val = (i * i) ) {
		temp = val;
		i++;
		
	}
	
	i--;

	 System.out.println("the value is : " + temp + " " +  i);
	 
	 
	 
	 val = (num - temp) * 100;
	 
	 root[j] = Integer.toString(i);
	 
	 i = i + i;
	
	 
	 System.out.println("the new value is : " + val + " value of i is : " + i);
	 
	 int m = 0;
	 int newval = 0;
	 temp = 0;
	 
	 
	 
	 
	 for ( m = 0; temp <= val; m++) {
		  
		    String st = Integer.toString(i);
		    String st1 = Integer.toString(m);
		    
		    newval = temp;
		    temp = Integer.parseInt(st+st1);
		    
		    if (m != 0){   // this is if the number is 100 for which we hae to find the squre root
	   
		    temp = temp * m;
		    }
		     
		    	
		   
		  
		    System.out.println("the valuse of newval is : " + newval + " temp is  " + temp + " m is " +  m ); 
 	    
		 
	 }

	    System.out.println("outside the valuse of new temp is : " + newval + " " + m); 

	 
	 
	 
	 
	 
	 
	 
	 
	 
}}
