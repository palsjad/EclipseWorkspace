package com.wbl.assignments.AdditionalPrograms;

import java.util.ArrayList;

public class AccessModTriangle extends AccessModShape implements InterfaceForTriangleRectangle {

	@Override
	public double calculateArea(ArrayList<Double> sideValues) {
		double area = (0.5 * sideValues.get(0) * sideValues.get(1));
		
 		return area;
	}

	@Override
	public double calculatePerimeter(ArrayList<Double> sideValues) {
		double perimeter = (sideValues.get(1) + sideValues.get(2) + sideValues.get(3) );
 		return perimeter;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@Override
	public double calculateArea(double val1, double val2) {
		
		double area = (0.5 * val1 * val2);
 		return area;
	}

	@Override
	public double calculatePerimeter(double a, double b, double c) {
		double perimeter = (a + b + c);
 		return perimeter;
	}
*/
}
