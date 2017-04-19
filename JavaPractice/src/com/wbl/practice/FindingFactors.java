
//   3) Find the factors for given number n excluding that number

package com.wbl.practice;

public class FindingFactors {
	
	
	public void findFactors(int num) {
		
		for(int i = 1; i < num; i++) {
			
			if (num % i == 0) {
				
				System.out.println(i);
			}
		}
		
		
	}

	public static void main(String[] args) {
 
		int val = 10;
		
		int res = 35; 
		
		Integer.reverse(res);
		
		 
		System.out.println(res);
		
		FindingFactors ff = new  FindingFactors();
		
		ff.findFactors(val);
		
	}

}
