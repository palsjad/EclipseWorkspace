
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

import java.util.Scanner;
 

public class ShapeDemo {

	public static void main(String[] args) {
 
		ShapeDemo sd = new ShapeDemo();
		
		sd.scanUserInputs(sd);
		
	}
		
	public void scanUserInputs(ShapeDemo sd){
		
 	 	Scanner scan = new Scanner(System.in);
 	 	
 	 	System.out.println("\n\nEnter the number(1-3) for the Shape for which you want to calculate Area and Perimeter\n");	
 	 	System.out.println("1 - Circle \n 2 - Traingle \n 3 - Square / Rectangle \n");
 	    
 	 	int input = Integer.valueOf(scan.nextLine());
 	 	
 	    
	 	String shp = " ";
	 	
	 	
 	 	if (input == 1){
 	 		
 	 		shp = "Circle";
 	 		
 	 		System.out.println("enter the radius for the Circle\n");	 
 	 		String temp = scan.nextLine();
 	 	 	
	 	 	double rad = Integer.valueOf(temp );
	 	 
	 	 	sd.circleCalculations(rad, shp); 	// to calculate the circle area and perimeter 	
 	 	}
 	 	
  	else if (input == 2){
 	 		shp = "Traingle";
 	 		System.out.println("The shape entered is "+ shp  + " for which calculation method is not available\n");
// 	 	 	System.out.println("Enter their values separated by commas \n");
// 	 	 	String temp = scan.nextLine();
 	 	} 
  	else if (input == 3){
 	 		shp = "Square / Rectangle";
 	 		System.out.println("The shape entered is "+ shp  + " for which calculation method is not available\n");
// 	 	 	System.out.println("Enter their values separated by commas \n");
// 	 	 	String temp = scan.nextLine();
 	 		}	
  	else {
	 		System.out.println("Invalid input\n");
  	}
 	 	
 	 	scan.close();
	}
	
	
	// method to calculate area and perimeter for the Circle
	
	public void circleCalculations(double radius, String nm){
		
		double area = 0.0;
 	 	double perimeter = 0.0;
 	 	
		Circle c1 = new Circle(0);
		
 	 	c1.setSides();
 	 		 	
 		c1.setRadius(radius);
		
		area = c1.calculateArea();
		
 		perimeter = c1.calculatePerimeter();
 		
 		System.out.println("area : " + area + "  permeter : " + perimeter);
 		
 		c1.displayDetails(nm, area, perimeter);
 
		
	}

}
