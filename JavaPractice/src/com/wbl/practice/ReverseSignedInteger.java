package com.wbl.practice;

public class ReverseSignedInteger {

	public int reverse(int val) {
		
		long result = 0;    // use long to monitor Stack Overflow
		
		while (val != 0) {
			
			result = result * 10 + (val % 10);
			
			System.out.println("result = result * 10 + (val % 10) : " + result);
			
			val = val / 10;
			
			System.out.println("val = val / 10 : " + val);

		}
		
		System.out.println("Integer.MAX_VALUE : " + Integer.MAX_VALUE );
		
		System.out.println("Integer.MIN_VALUE : " + Integer.MIN_VALUE );

		
		if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			
			return 0;
			
		}
		
		else {
			
			return (int) result;
		}

	}

	public static void main(String args[]) {

		ReverseSignedInteger rev = new ReverseSignedInteger();

		// max possible number in an signed integer is 2,147,483,647

	//	int num = -1147483647;
		
	//  int num = 137;
		
		int num = 2147483647;

		int result = rev.reverse(num);

		System.out.println("The result is : " + result);
	}
}
