
/*
Write a program that implements various functions of different type of 
access modifiers(private,protected,default,public) and then access these
methods with in or outside the class based on the identifier scope.
*************************************************************************
*/

package com.wbl.assignments.AccessModifiers_1;

public class Animal {
	
	public static final String  DTYPE = "Dog";
	
//*********************************************************************	
// Protected Method - can be accessed only within the package and in subclasses 
// can be accesses by the Dog class 
//**********************************************************************
	
	
	protected String loveAnimal(){
		
	String fav =  " is my favorite animal \n";
	return fav;
	
	}
	
	protected String loveAnimal(String nm){  // overloaded protected  loveAnimal method 
		
		String fav = nm + " is my favorite animal \n";
		return fav;
		
		}
	
	
	public static void main(String args[]) {
	
		
	 	Animal aml = new Animal();  	
	 	
	 	System.out.println(aml.loveAnimal(DTYPE));
	  	
	  	Person psn = new Person();
	  	
	  	psn.printInfo();     // default method from Person but can be accessed here as its within the same package
	  	
 	  	
	   
	}

}
