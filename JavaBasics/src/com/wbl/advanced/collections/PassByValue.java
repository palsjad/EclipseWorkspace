package com.wbl.advanced.collections;

public class PassByValue {
	
	String greet;
	
	
	
	public void increment(int input){
		
		System.out.println("The input before increment is : " + input);
		
		input++;
		
		input =input +5;
		System.out.println("The input after increment is : " + input);
	
	}

	
	public void greeting(PassByValue obj) {
		
		System.out.println("before modification of string : " +  obj.greet);
		
		obj.greet = "hello greeting";
		
		System.out.println("after modification of string : " + obj.greet);

	}
	

	
	
	public static void main(String[] args) {
		
		
	PassByValue pbv = new PassByValue();
	
	pbv.greet = "hello";
	
	int value = 2;
		
		System.out.println("The value before is : " + value);

		pbv.increment(value);
		
		System.out.println("The valueafter is : " + value);
		
		pbv.greeting(pbv);
		System.out.println("after modification of string andreturn : " + pbv.greet);

		
		
	}

}
