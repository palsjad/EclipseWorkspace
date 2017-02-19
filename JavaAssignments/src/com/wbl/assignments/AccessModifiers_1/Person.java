package com.wbl.assignments.AccessModifiers_1;

import com.wbl.assignments.AccessModifiers_2.Dog;
	 
public class Person {
 
	public String pName = "Pallavi";
	
	
	
	public void playsWhat(String animalName){         // passing the object Dog which is in another package ..
	
		String play = "plays tag with";
	
		System.out.println(pName + " " + play + "  " + animalName  ); // passing the value of String type which  is public in Dog
 	}
	
	
	void printInfo() {              // default method 
	
		System.out.println(pName + " loves animals \n");
		
	}
	
	public static void main(String[] args) {

//	Cat c = new Cat();
	     
	Dog d = new Dog("Rover");
	  d.dogSays(); 	
//		d.dogWags();   //       cannot access this method from Dog class as its private 
     Person p = new Person();
     p.playsWhat(d.dName);
     
		
	}

}
