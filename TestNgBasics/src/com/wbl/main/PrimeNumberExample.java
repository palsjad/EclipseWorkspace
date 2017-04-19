package com.wbl.main;

// this is using junit3
public class PrimeNumberExample {
	
	public boolean isPrime(int input) {
		
 		if (input == 1){
			return false;
		}
		
 		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			System.out.println("interrupted Exception");;
			e.printStackTrace();
		}
 		
 		for(int i = 2; i<input; i++) {
			if (input % 2 ==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		
		
	}

}
