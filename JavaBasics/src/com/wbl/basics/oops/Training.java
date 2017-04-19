package com.wbl.basics.oops;

public class Training {

	public static int memberIdGenerator;

    protected int memberId;
	protected String memberName;
	protected String memberType;
	protected String course;
	
	

	// Constructor - same name as the class but given with (). This creates the memberId
	
	public Training() {
		
		
		memberId = ++memberIdGenerator;
		
		byte b = 00000011;
		System.out.println("byte : " + b);
		
	}
	
	// to create a new loan object
	
	public Training getNewObject() {
		Training t1 = new Training();
		return t1;
	}
	
// To display the recording / presentation according to input type "QA" / "UI" and "Recording" / "Presentation"
	
	public void getLectures(String course, String type) {
		if (type == "Recording") {
			String lecture = Training.displayRecording(this.course);	
            System.out.println(lecture);			
		}
		
		else if (type == "Presentation") {
 			String lecture = Training.displayPresentation(this.course);
             System.out.println(lecture);			
 	}
	
 	
//	public void getLectures(String course, String type) {
//		if (type == "Recording") {
//			String lecture = Training.displayRecording(this.course);	
//            System.out.println(lecture);			
//		}
//		
//		else if (type == "Presentation") {
//			String lecture = Training.displayPresentation(this.course);
//            System.out.println(lecture);			
//		}
	}
	
	
	
 public static String displayRecording(String course) {
	 
	 if  (course == "QA") {
	 
	  System.out.println("Requested for " + course + " Recording  \n");
	  String details = "This is the QA Recording \n";
	  return details;
	 }
	 
	 else if (course == "UI") {
		 
		  System.out.println("Requested for " + course + " Recording  \n") ;
		  String details = "This is the UI Recording \n";
		  return details;
		  
	 }
	 else {
		 String details = " Invalid User   \n";
	     return details;	
	     
	 }
	 
   }  
 
 
 
 public static String displayPresentation(String course) {
	 
	 if (course == "QA") {
		 
		  System.out.println("Requested for " + course + " Presentation  \n") ;
		  String details = "This is the QA presentation   \n";
		  return details;
		  
		 }
		 
	 else if (course == "UI") {
		 
		  System.out.println("Requested for " + course + " Presentation  \n ") ;
		  String details = "This is the UI presentation   \n";
		  return details;
		  
	 }
	 else {
		 String details = " Invalid User   \n";
	     return details;	
	     
	 }
	 
	 
//		 else if (memberType == "Employee") {
//			  System.out.println("The member is a : " + memberType + " and requested for " + course + " recording");
	 
	 

		
	}
	 
	 
 
 
   public static String courseDetails(String course)  {
		   if (course == "QA") {
		     final String details = "Testing Fundamentals, Unix, SQL, Java, SOAP, REST   \n ";
		   return details;		   
	   }
	   else if (course == "UI") {
		   final String details = "HTML, XML, CSS, javascript, jQuery, AngularJS, NodeJS   \n ";
		   return details;
		   
	   }
	   
	  
	   
	   else return (" This is an Employee so no course details \n ");
	   
   }
   
   
   
   protected void studentInfo(String memberType) {
	   if (memberType == "Employee") {
		   System.out.println("Student info is asked for by an Employee  \n ");
		   		 
	   }
	    
	   else System.out.println("Invalid User   \n "); 
	   
}

 
//public void displayDetails(int id, String type) {
   
   public void displayDetails() {
	if (this.memberType =="Student") {
	System.out.println("Student Id : " + memberId + " Student Name : " + memberName + " Course enrolled in : " + course + "\n" );
}
	else System.out.println("The member is an employee   \n");
	
}
 
public int getMemberId() {
	return memberId;
}

public void setMemberId(int memberId) {
	this.memberId = memberId;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}

public String getMemberType() {
	return memberType;
}

public void setMemberType(String memberType) {
	this.memberType = memberType;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}
 
}
