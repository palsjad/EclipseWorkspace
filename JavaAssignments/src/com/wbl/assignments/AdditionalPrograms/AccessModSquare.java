package com.wbl.assignments.AdditionalPrograms;

public class AccessModSquare extends AccessModShape implements InterfaceForCircleSquare {

	@Override
	public double calculateArea(double r) {
		
 		return (r * r);
	}

	@Override
	public double calculatePerimeter(double r) {
 
		return (4 * r);
	}
	
	
	

}
