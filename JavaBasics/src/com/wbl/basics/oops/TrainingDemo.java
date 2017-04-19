package com.wbl.basics.oops;

public class TrainingDemo {

	public static void main(String[] args) {

 	QATraining person1 = new QATraining();	
	 
	
 //   person1.getNewObject();   ?????????????????????  how to use this..
	
	person1.setMemberName("Pallavi");
	person1.setMemberType("Student");
	person1.setCourse("QA");
	
	
	
	// ---------------to display the student details------------------------
		
	 
		String cd = person1.getCourse();
	
		person1.displayDetails();


	
//---------displaying the course the student is enrolled in.------------------ 
	
	
		System.out.println("Course :  " + cd + "   Course Details   :  " + Training.courseDetails(cd));
	
	
//-------------- to get the recording for the student--------------------- 
	
	person1.getLectures(cd, "Recording");
	
//	int id = person1.getMemberId();
//	String type = person1.getMemberType();
	

// **********************************creating 2nd object ***********************************************
	 
	UITraining person2 = new UITraining();	
	 
	person2.setMemberName("Aryan");
	person2.setMemberType("Student");
	person2.setCourse("UI");
 
  
	
// ---------------to display the student details------------------------
		
	  cd = person2.getCourse();

	person2.displayDetails();
			
	
	
//---------displaying the course the student is enrolled in.------------------ 
	
		System.out.println("Course :  " + cd + "   Course Details   :  " + Training.courseDetails(cd));
	
//-------------- to get the recording for the student--------------------- 
	
	person2.getLectures(cd, "Presentation");
	
//	int id = person1.getMemberId();
//	String type = person1.getMemberType();
	
	

	
// **********************************creating 3rd object ***********************************************
	
	
	Training person3 = new Training();	
	
	person3.setMemberName("Riva");
	person3.setMemberType("Member");
	person3.setCourse("NA");
 

// ---------------to display the student details------------------------
	
    cd = person3.getCourse();

	person3.displayDetails();
	 	
	
//---------displaying the course the student is enrolled in.------------------ 
	
	System.out.println("Course :  " + cd + "   Course Details   :  " + Training.courseDetails(cd));
	
	
//-------------- to get the recording for the student--------------------- 
	
	person3.getLectures(cd, "Recording");
	
 

 
	// **********************************creating 4th object ***********************************************
	
	
		UITraining person4 = new UITraining();	
		
		person4.setMemberName("Riya");
		person4.setMemberType("Student");
		person4.setCourse("UI");
	 

// ---------------to display the student details------------------------
		
		
	    cd = person4.getCourse();

		person4.displayDetails();
				 
		
		
		
	//---------displaying the course the student is enrolled in.------------------ 
		
		System.out.println("Course :  " + cd + "   Course Details   :  " + Training.courseDetails(cd));
		
		
	//-------------- to get the recording for the student--------------------- 
		
		person4.getLectures(cd, "Presentation");
		
	 
		
	

}
}