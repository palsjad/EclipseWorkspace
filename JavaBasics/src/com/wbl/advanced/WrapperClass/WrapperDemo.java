package com.wbl.advanced.WrapperClass;

public class WrapperDemo {
	
	 public static void main(String[] args) {

	
	int i= 30;
	Integer i1 =35;
	
//	 String s = i.toString(); // cannot do toString here as its a primitive data type
	String s1 = i1.toString(); // toString works here as i1 is of Integer type which is a wrapper class
	
	String s2 = "30";
	
	int i3 = Integer.parseInt(s2);
	 
	 Float f = new Float(56.5);
	 Float f1 = 56.7f;
	 
	 // the above 2 stmts is an example of Autoboxing. Assigining data within the similar form like int and Integer,
	 // either from primitive to object type or object type to primitive

	int a1 = 40;
	
//  Long l = a1; //gives an error as we cannot typecast ot widen 
	
	long h = 50;
	
	Long L = h; // this is possible.This is autoboxing
	 

	Integer temp = 5;
	
	int temp1 = temp.intValue();  // converting wrapper object to primitive data type

    System.out.println("The rsult after convrting wrapper obj to primitive  is : "  + temp1);

// we can even do the following
    
    Integer.toString(temp);
    
    
	 

	}

}
