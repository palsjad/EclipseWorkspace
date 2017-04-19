package com.wbl.advanced.ObjectRefTypeCasting;
public class MobileDemo {

	public static void main(String[] args) {
 
		
		Mobile m1 = new Mobile() ;
		
		AndroidMobile a1 = new AndroidMobile();
		
		m1 = a1; //this is upcasting or implicit casting as we a1 is  a child obj andcan be assigned to m1
		// as it can fit intoa parent obj 
		
		
		
		// this is imlpicit typecasting ...as  android isa child class so it can have parent reference
		Mobile m2 = new AndroidMobile(); 
		
		
	//	a1 = m2; // this gives an type mismatch error as m2 which is a child obj with parent reference 
		// so cannot be assigned to a1 which is a child obj 
		// toover come this problem we do down casting or explicit casting
		
		a1= (AndroidMobile)m2; // this is downcasting or explicit casting
		
		
		//downcasting is doneonly if obj satisfies is-a relationship. in theabove example we can do
		// (AndroidMobile)m2 as m2 is a child obj with parent reference.
		
		
		
	}

}
