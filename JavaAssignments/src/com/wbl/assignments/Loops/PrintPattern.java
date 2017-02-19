
/*  Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******

*/

package com.wbl.assignments.Loops;

public class PrintPattern {

	public static void main(String[] args) {
 
			
			char star = '*';
			int i, j ;
			
			for(i = 1; i <= 10; i++) {
				System.out.println("\n");

				for (j = 0; j < i; j++ ){
					System.out.print(star);
				}
				
		

	}

}
	
}
