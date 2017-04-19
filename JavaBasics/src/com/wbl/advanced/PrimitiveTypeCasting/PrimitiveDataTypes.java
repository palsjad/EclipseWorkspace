package com.wbl.advanced.PrimitiveTypeCasting;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		byte a = 4;
		int b = 0;
		short c = 120;
		long d =1234567l;
		float e = 2345.35f;
		double f = 234567.35;
		char g = 'c';
		boolean boo ;
		
		boo = true;
		
	//	a = (byte)c; // explicit casting or downcasting
		
		b = a; // implicit casting or upcasting
		
		 System.out.println(" the  value for b is : " + b);

		
		// c = d; // cannot do this as its type mismatch.
		
		c = (short)d;
		
		d = c;
		
		 System.out.println(" the  value for e is : " + e);
		 System.out.println(" the  value for f  is : " + f);
		 System.out.println(" the  value for g  is : " + g);

		
     //  int temp;
		 
		 
		 System.out.println(" the default value for int is : " + !boo);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
