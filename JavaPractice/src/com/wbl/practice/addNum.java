package com.wbl.practice;

public class addNum {

	public static void main(String args[]) {



		int add, a ,b, sub,sub1 ;

		a = 4;
		b = 2;


		add= a-~b-1;//2+4-1=5//

		sub=a-(-~b-1); //3 + (-3-1)   .... 3 + -4 3-4 = -1
	
		
//		without using substraction sign 
		
		sub1 = a+(~b+1);

		/*	   
		   -~2 becomes +3
           +~2 becomes -3


		 */
		
 
		System.out.println("-~b : " + -~b);
		System.out.println("~b : " +  ~b);


		System.out.println("add : " + add);
		System.out.println("sub: " + sub);
		System.out.println("sub1: " + sub1);


	}

}



