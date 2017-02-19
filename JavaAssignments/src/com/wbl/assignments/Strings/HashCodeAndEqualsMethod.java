
// Write a program to implement hashCode() and equals() methods


package com.wbl.assignments.Strings;

import java.util.HashMap;
import java.util.Map;

 
public class HashCodeAndEqualsMethod {
	
	int stdId ;
	String stdName;
	
	
	
	public void hashMapObject() {	
	// Hash map with object data type
		
 		Map<Student, Integer> mapObj = new HashMap<Student, Integer>();
 		Student  st1 = new Student(1,"pallavi");
 		Student  st2 = new Student(2, "sachin");
 		
 		mapObj.put(st1, 600);
 		mapObj.put(st2, 500);
 		
 	 Student newStd = new Student(1,"pallavi");  // we are trying to create a new student object here with the same data
												 // as one of the records in the set assuming that the equals
												 //and hashCode method is not overwritten. Comment both the methods
 	 
 	 System.out.println(" The hashcode of the new student  is : "+ newStd.hashCode()); 	
 	 System.out.println(" The entered value for the new student is : "+ mapObj.get(newStd)); 	
 	 System.out.println(" The new student added is : "+ newStd); 	
	 
 	 System.out.println("\n The hashcode of the existing student  is : "+ st1.hashCode()); 
 	 System.out.println(" The existing value for the old student is : "+ mapObj.get(st1)); 	
 	 System.out.println(" The existing student is : " + st1); // the overridden toString method prints the values of the object st1 
 	                                                        // and not the hashcode value of st1 .  

	}	
	
	

	public static void main(String[] args) {
		
		
		HashCodeAndEqualsMethod hem = new HashCodeAndEqualsMethod();
		
		 hem.hashMapObject();
		
		
	}

}
