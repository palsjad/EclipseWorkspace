package com.wbl.assignments.AccessModifiers_2;

 import com.wbl.assignments.AccessModifiers_1.Person;

import com.wbl.assignments.AccessModifiers_1.Animal;


public class Dog extends Animal{
	
// public static final String  DTYPE = "Dog";
	
	public String dName = "";
	
	public Dog () {
		
		
	}
	
	public Dog(String nm) {
		
		dName = nm;
	}
	
	
// ***************** Private method *****************************	
	
	private void dogWags() {       // Private method so can be accessed only within the package
		
		System.out.println("The dog wags his tail\n");
		
		System.out.println(DTYPE + super.loveAnimal()); // DYTPE if from the Animal class which is a super class 
	}
	
//*****************************************************************	
	
   public   void dogSays() {  //default 
		
		System.out.println("The dog says woof woof and the dog's name is " + dName + " \n");
	}
	
     

	public static void main(String[] args) {

		Dog dg = new Dog("Beethovan");
		dg.dogWags();   // private method can be accessed only within the class 
		
	    dg.dogSays(); 
		
	    Person p1 = new Person();
	    
	    p1.playsWhat(dg.dName);   // public method from Person which is in another package
	    
	}

}
