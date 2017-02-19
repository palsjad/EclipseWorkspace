package com.wbl.assignments.AbstractClassShape;

public class Circle extends Shape implements IShapeConstants {

	
	
public Circle(int sd) {
	if(sd != 0) {
 	   System.out.println("The number of sides entered is wrong. A Circle has no sides so it should be  zero \n");
    }
		noOfSides = 0;

 	}

double radius = 0;

	 


	public void setRadius(double i) {
		
//		System.out.println("inside setRadus : " + i);
		
     if (i > 0 && i < 100 ){
		radius = i;
     }
     else {
    	 System.out.println("Enter the radius within the given range : 1 - 100 \n");
     }
	}
	
// overloaded method	
public void setSides() {
    	
    	System.out.println("The Circle has " + noOfSides + " sides \n" );
    }

@Override
public double calculateArea() {
	
//	System.out.println("the value of pi is : " + PI);
	
//	System.out.println("the area of the circle  is : " + (PI * radius * radius));
	
	return  (PI * radius * radius);
	
	 
		
}



@Override
public double calculatePerimeter() {
//	System.out.println("inside perimeter and the radius is : " + (2 * PI * radius));
		return (2 * PI * radius);
}

 



}
