
/*
Write a program having below methods.
--> To create a hashmap.
--> To search for a key in the created map and then returns its value
*********************************************************************************
*/


package com.wbl.assignments.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

 
public class HashMapDemo {

	public static void main(String[] args) {
 
		Map<Employee,Integer> mapData = new HashMap<Employee,Integer>();
		
		Employee e1 = new Employee(4,"Pallavi");
		Employee e2 = new Employee(1,"Parth");
		Employee e3 = new Employee(3,"Aryan");
		Employee e4 = new Employee(6,"Riva");
 		Employee e5 = new Employee(4,"Pallavi");
		Employee e6 = new Employee(2,"Yash");
		Employee e7 = new Employee(5,"Adi");
		Employee e8 = new Employee(7,"Esha"); 

		mapData.put(e1,1000);
		mapData.put(e2,2000);
    	mapData.put(e3,3000);
		mapData.put(e4,4000);
  		mapData.put(e5,1000);
		mapData.put(e6,6000);
		mapData.put(e7,7000);
		mapData.put(e8,8000);
	 
		
 //	 Set<Employee> keyData = mapData.keySet();	
		 
 	 
		System.out.println("1. Search by key \n");
		System.out.println("2. Search by value  \n");
		System.out.println("3. Print Details \n");
		
		HashMapDemo hmd = new HashMapDemo();	 
		

	   Scanner scan = new Scanner(System.in);
	   int id = scan.nextInt();
	   if (id == 1){
//		   hmd.searchByKey(scan,keyData);
		   hmd.searchByKey(scan,mapData);
	   }
	    else if (id == 2){
		   hmd.searchByValue(scan, mapData);
	   }
	   else if (id == 3){
		   hmd.printDetails(scan, mapData);
	   }
	  
	   scan.nextLine();
	   scan.close();
	   
   
  
	}  
	
	 
	   public void searchByKey(Scanner scan, Set <Employee> data){
	 // To print the value for the entered key by the user
	  
		   System.out.println("Enter the key in the map to get its value (1,2,3,4,5,6,7) \n");
		   int id = scan.nextInt();  	   
		   
	    for(Employee st : data) {
	    	  if (st.empId == id){
 	    		  
	    		   System.out.println("The value for the entered key "+ id + " is : "+ st.empName);

	    	  }

	    }
	    
	   } 
	    
	 
 
   public void searchByKey(Scanner scan, Map<Employee,Integer> data ){
 // To print the value for the entered key by the user
  
	   System.out.println("Enter the key in the map to get its value (1,2,3,4,5,6,7) \n");
	   int id = scan.nextInt();  
	   scan.nextLine();
	   Set<Employee> keyData = data.keySet();
	 	 
 		for(Employee empRec : keyData) {
 			if(empRec.empId == id){
 	 System.out.println("the key is : "+ empRec.empId + " the name is : " + empRec.empName + " and the value is : " + data.get(empRec));
 		}    
 		}  
	   
   } 
  // *********************** to sort the map by value***************************************  
   
	
   public void searchByValue(Scanner scan, Map<Employee,Integer> data ){


	   System.out.println("Enter the key in the map to get its value (Pallavi, Parth, Aryan, Riva, Yash, Adi, Esha)  \n");
	   String nm = scan.next();  
	    
	   scan.nextLine();
	   
	   Set<Employee> keyData = data.keySet();
	 	
 		for(Employee empRec : keyData) {
 
 			if(nm.equals(empRec.empName) ){
	    		   System.out.println("The key for the entered value "+ nm + " is : "+ empRec.empId);
 		}    
 		}  
    
    
    	
  }   
   
  //***********************To Print all the Data in the map*************************************
   
   public void  printDetails(Scanner scan, Map<Employee,Integer> data) {
 	  
 	  Set<Employee> keyData = data.keySet();
 	     
    for(Employee empRec : keyData) {
       System.out.println("Employee ID  : "+ empRec.empId + "   Employee Name : "+ empRec.empName + "  Salary : " + data.get(empRec));
     
    }
   } 
    
   

}
