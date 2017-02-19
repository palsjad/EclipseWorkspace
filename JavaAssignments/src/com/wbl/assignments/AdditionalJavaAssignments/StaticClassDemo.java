
/*

  Static variable / static method / static block 

Cannot make a static reference to the non-static field COMPANY or details ---- 
so make COMPANY and details static if we want to use them

to use a Constructor we have to create an object of the class StaticClassDemo 

*************************************************************************************
*/



package com.wbl.assignments.AdditionalJavaAssignments;

public class StaticClassDemo {
	
	static String name = "";
	static String name1 = "";

	  String details = "";
	 static String COMPANY = "wbl";
	
	
public StaticClassDemo(String greeting, String greeting1,  String info) {  // constructor
	
	System.out.println("This is the Constructor\n");
	name = greeting;
	name1 = greeting1;
	details = info;
}
	
	

static {
//	StaticClassDemo.helloWorld(); // can write both ways
	helloWorld();
	name = "UI";
	System.out.println("In 1st Static :     Hello " + name+ " \n");
 
	
}


public static void helloWorld() {
	name = "QA";
	System.out.println("In helloWorld() :     Hello " + name+ " \n");
 
}

public static void byeWorld() {
	
	System.out.println("In byeWorld() :     Bye Bye " + name1+ " \n");

}

static  {
	
	System.out.println("In 2nd static :     Hello " + COMPANY+ " \n");

}
         
         
 public static void main(String[] args) {
        	 
        	 
	 StaticClassDemo scd = new  StaticClassDemo("UI", "World", "Today is a good day");
	 
	 
		System.out.println(scd.details + " \n"); // as details is a not static variable can only print it with an class object
		
		byeWorld();

	}

}
