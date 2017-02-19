package com.wbl.assignments.Strings;
 
 

public class Student {

	int stdId ;
	String stdName;
	
 
 	public Student(int i, String nm){
	
		stdId = i;
		stdName = nm;
		
	 
 	}
// ************************* overriding methods ****************************************** 	
 	
 	
  	@Override
 	public int hashCode() {
 		
 		return stdId * 7;
 		
 	}	
 	

	@Override
 	public boolean equals(Object o1) {
 		boolean isequals = false;
 		
 		if(o1 instanceof Student && ((Student)o1).stdId == this.stdId
 		    && ((Student)o1).stdName == this.stdName){
 			isequals = true;
 		}
 	return	isequals; 
 	 
}	
    
 	
/* 	
 Since java compiler internally calls toString() method, overriding this method will return the specified values
		
 	*/
 	
 	
 	
 	public String toString() {  
 		return "Student : " + stdId + "    Student Name : " + stdName;
 	}
 	
//************************************getter and setter methods ************************************** 	
  	
 	public int getStdId() {
		return stdId;
	}




	public void setStdId(int stdId) {
		this.stdId = stdId;
	}




	public String getStdName() {
		return stdName;
	}




	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	
}
