
// Write a program print "ping" if a number is divisible by 3,
// "pong" if a number is divisible by 5, 
// "ping pong" if number is divisible by both,
//  else print the number.


package com.wbl.assignments.Loops;

public class PingPongDemo {

	public static void main(String[] args) {

		
		for(int a = 1; a <= 100; a++){
			
		    if ( (a % 3 == 0) && (a % 5 == 0) ){
				System.out.println("\n PING PONG : " + a);
			}
			
		    else if (a % 3 == 0){
			System.out.println("\n PING : " + a);
			}
			else if (a % 5 == 0){
				
				System.out.println("\n PONG : " + a);
	
			}
			
			else
				System.out.println("\n " + a);

		
	}

  }
	
}	
