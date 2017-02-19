package com.wbl.assignments.AdditionalPrograms;

import java.util.ArrayList;

public class AccessModRectangle  extends AccessModShape  implements InterfaceForTriangleRectangle{

	@Override
	public double calculateArea(ArrayList<Double> sideValues) {
    double area = (sideValues.get(0) * sideValues.get(1));
		
 		return area;	 
	}

	@Override
	public double calculatePerimeter(ArrayList<Double> sideValues) {
		double perimeter = 2 * (sideValues.get(0) + sideValues.get(1) );
 		return perimeter;
	}
	
	
	
	
	
	
	
	
	
	
/*
	@Override
	public double calculateArea(double val1, double val2) {
		
		double area = (val1 * val2);
 		return area;
	}

	@Override
	public double calculatePerimeter(double a, double b, double c) {
		// TODO Auto-generated method stub
		return 0;
	}
*/
}
