package com.wbl.assignments.Collections;

public class Employee {
	
	int empId;
	String empName;
	
 	public Employee(int i, String nm){
	
		empId = i;
		empName = nm;
		
	 
 	}
 	
  	@Override
 	public int hashCode() {
 		
 		return empId * 7;
 		
 	}	
 	
 	@Override
 	public boolean equals(Object o1) {
 		boolean isequals = false;
 		
 		if(o1 instanceof Employee && ((Employee)o1).empId == this.empId){
 			isequals = true;
 		}
 	return	isequals;
 	
 	}
 	 
}
