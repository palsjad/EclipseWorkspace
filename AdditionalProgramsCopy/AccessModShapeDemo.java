
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



package com.wbl.assignments.AdditionalPrograms;

import java.util.ArrayList;
// import java.util.InputMismatchException;
import java.util.Scanner;
 

public class AccessModShapeDemo {

	public static void main(String[] args) {
 
		AccessModShapeDemo sd = new AccessModShapeDemo();
		
		sd.scanUserInputs(sd);
		
	}
		
	public void scanUserInputs(AccessModShapeDemo sd){
		
 	 	Scanner scan = new Scanner(System.in);
 	 	
 	 	System.out.println("\n\nEnter the number(1-4) for the Shape for which you want to calculate Area and Perimeter\n");	
 	 	System.out.println("\n 1 - Circle \n 2 - Traingle \n 3 - Square \n 4 - Rectangle \n");
 	    
 	 	int input = Integer.valueOf(scan.nextLine());
 	 	String shp = "";
  	 	
 	 	if (input == 1){
 	 		
 	 	    shp = "Circle";
 	 		System.out.println("enter the radius for the Circle\n");	 
 	 		String temp = scan.nextLine();
 	 	 	
	 	 	double rad = Double.valueOf(temp);
	 	 	
  	 	    AccessModShape ams = new AccessModCircle(0); // giving no of sides as parameters for the constructor
	 	 	sd.Calculations(ams, rad, shp); 	// to calculate the circle area and perimeter 	
 	 	}
 	 	
  	else if (input == 2){
 	 	 	shp = "Triangle";
			System.out.println("Enter the values in the following order : base, height, side 1 and side 2 \n");
 	 	 	String temp = scan.nextLine();
 	// 	 	ArrayList<Double> values = checkNumbers(shp,temp);   // static method
 	 	 	ArrayList<Double> values = getValues(shp,temp);   // static method
 	 	 /*	if(checkNumbers(shp,temp) == true){
 	 	 		break;
 	 	 	}*/
 	    	AccessModShape ams = new AccessModTriangle();
	 	 	sd.Calculations(ams, values, shp); 	// to calculate the circle area and perimeter 	
 
 	 	} 
 	 	
  	else if (input == 3){
 	 		shp = "Square";
	 	 	System.out.println("Enter the Sqaure's length \n");
  	 	 	String temp  = scan.nextLine();
//  	 	 	ArrayList<Double> values = checkNumbers(shp,temp);   // static method
//  	 	 	 	ArrayList<Double> values = getValues(shp,temp);   // static method
  	 	 	
  	 	 	 double values = Double.parseDouble(temp);
  	 	 	 
  	 	 	 /*	if(checkNumbers(shp,temp) == true){
  	 	 	 		break;
  	 	 	 	}
  	 	    */
  	 	    AccessModShape ams = new AccessModSquare();
	 	 	sd.Calculations(ams, values, shp); 	// to calculate the square area and perimeter 	

 	 		}	
	else if (input == 4){
	 		shp = "Rectangle";
	 	 	System.out.println("Enter the Rectangle's length and width \n");
	 	 	String temp  = scan.nextLine();
	 	 	
//	 	 	ArrayList<Double> values = checkNumbers(shp,temp);   // static method
	 	 	 	ArrayList<Double> values = getValues(shp,temp);   // static method
	 	 /*	 	if(checkNumbers(shp,temp) == true){
	 	 	 		break;
	 	 	 	}*/
	 	 	
  	 	    AccessModShape ams = new AccessModRectangle();

	 	 	sd.Calculations(ams, values, shp); 	// to calculate the circle area and perimeter 	

	 	 	
	}
 	 	
  	else {
	 		System.out.println("Invalid input\n");
  	}
 	 	
 	 	scan.close();
	}
	
	
	// method to calculate area and perimeter for the Circle  and for Square
	
	public void Calculations(AccessModShape obj, double radius, String nm){
		
		double area = 0.0;
 	 	double perimeter = 0.0;
 	 	
 		
 //	 	obj.setSides();
 	 		 	
 //		obj.setRadius(radius);
		
		area = obj.calculateArea(radius);
		
 		perimeter = obj.calculatePerimeter(radius);
 		
 		System.out.println("The calculations for " + nm + " are : Area : " + area + "  Perimeter : " + perimeter);
 		
 		obj.displayDetails(nm, area, perimeter);
 
		
	}
	
	// method to calculate area and perimeter for the Triangle and Rectangle
	
public void Calculations(AccessModShape obj, ArrayList<Double> nums, String nm){
		
		double area = 0.0;
 	 	double perimeter = 0.0;
 	 	
	
 	// 	obj.setSides();
 	 		 	
 	 	System.out.println("entered 2nd calculations \n");
	 
		
		area = obj.calculateArea(nums);
		
 		perimeter = obj.calculatePerimeter(nums);
 		
 		System.out.println("The calculations for " + nm + " are : Area : " + area + "  Perimeter : " + perimeter);
 		
 		obj.displayDetails(nm, area, perimeter);
 
		
	}
	
	
//	public static ArrayList<Double> checkNumbers(String shp, String str){

/*public static boolean checkNumbers(String shp, String str){

	String[] valuesList = str.split(" ");

		
		double[] num ;
		
		if(shp =="Triangle"){
			if(valuesList.length != 4){
				System.out.println("You have entered incorrect amount of numbers. Please enter only 4 numbers for a Triangle\n");
				return true;
			}
		}
			
		if(shp == "Square"){
			if(valuesList.length != 1){
				System.out.println("You have entered incorrect amount of numbers. Please enter only 3 numbers for a Square-Rectangle \n");
				return  true;
			}
			
		}
							
		if(shp == "Rectangle"){
			if(valuesList.length != 2){
				System.out.println("You have entered incorrect amount of numbers. Please enter only 3 numbers for a Square-Rectangle \n");
				return  true;
			}
				
		}	
}	
*/
public static ArrayList<Double> getValues (String shp, String str){	
	
	String[] valuesList = str.split(" ");

	
		ArrayList<Double> num1 = new ArrayList<Double>();
		for(String s : valuesList) {
		num1.add(Double.valueOf(s));
		    System.out.println("You entered " + s);

		}
		
/*		
	try {	
		for(int i = 0; i < (list.length - 1); i++){
			num[i] = Integer.parseInt(list[i] );
 		    System.out.println("You entered " + num);
 		    
		        } 
	    }
		catch (InputMismatchException e) {
		            System.out.println("You have entered invalid data");
				
			}
	*/
	   return num1;
		}
		
	 
	
	
	
	}

 
