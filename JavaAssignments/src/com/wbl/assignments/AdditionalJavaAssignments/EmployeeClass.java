package com.wbl.assignments.AdditionalJavaAssignments;

public class EmployeeClass {
	int empId;
	String empName;

	 
	
	/*
	public void displayDetails(Integer id, String name, Double salary ){
		
		System.out.println("employee id : " + id + "employee name : " + name + "employee salary : " +  salary + "\n");
		
		
	}*/

	public void displayDetails(Integer empId, String empName, Double salary) {
		System.out.println("employee id : " + empId + "  employee name : " + empName + "  employee salary : " +  salary + "\n");
		empId = 124;
		empName = "Riva";
		salary = 4000.00;
		System.out.println("employee id : " + empId + "  employee name : " + empName + "  employee salary : " +  salary + "\n");
	
		
	}
	
	
	

}
