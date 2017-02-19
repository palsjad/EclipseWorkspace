package com.wbl.assignments.AdditionalPrograms;

// public class AccessModCircle extends AccessModShape implements IAccessModShapeConstants {

 public class AccessModCircle  extends AccessModShape implements InterfaceForCircleSquare {
	
	
public AccessModCircle(int sd) {
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
public double calculateArea(double r) {
	
//	System.out.println("the value of pi is : " + PI);
	
//	System.out.println("the area of the circle  is : " + (PI * radius * radius));
	
	r =  (PI * r  * r );
	
	return r; 
		
}



@Override
public double calculatePerimeter(double r) {
//	System.out.println("inside perimeter and the radius is : " + (2 * PI * radius));
		r = (2 * PI * r);
		return r;
		
}

 
 



}
