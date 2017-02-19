
/*
a. Write a program creating an abstract class Shape with properties (noOfSides,area,perimeter) and 
   methods(calculateArea,calculatePerimeter,setSides.
b. Write a program creating an interface ShapeConstants with variable(pi=3.14).
c. Write a program that creates a class Circle extending Shape abstract class and implementing
   ShapeConstants interface and has following behavior.
	--> Properties: radius.
	--> Constructor: To set number of sides.
	--> Overrides all the methods from parents.
d. Write a program to depict the behavior of method overloading and overriding.


*/

package com.wbl.assignments.AbstractClassShape;
 

public abstract class Shape {
	
  	 public int noOfSides = -1;
	double area = 0.0;
	double perimeter = 0.0;
	
 
 
 
	//overloaded method in the circle class

	public void setSides(String shape, int sd) {
	
	System.out.println("The "+ shape + " has " + sd + " sides \n");
	}
	
	
	public abstract double calculateArea() ;
	
	
	public abstract double calculatePerimeter();
	
    	
    public  void displayDetails(String shape, double area, double perimeter){
 	System.out.println("\n\nThe details for the " + shape + " are : Area - " + area + " and  Perimeter - "+ perimeter);

    } 
	

}
