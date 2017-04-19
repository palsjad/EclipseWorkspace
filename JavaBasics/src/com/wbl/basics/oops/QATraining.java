package com.wbl.basics.oops;

public class QATraining extends Training {
	
	private String course = "QA";
	 
	@Override
	public void getLectures(String course, String type) {
		if ( type == "Recording") {
			String lecture = Training.displayRecording(this.course);	
            System.out.println("Inside the QATraining child class (Overriding) to get the recording : \n\n " + lecture);		
		}
		
		else if (type == "Presentation") {
 			String lecture = Training.displayPresentation(this.course);
            System.out.println("Inside the QATraining child class (Overriding)  to get the presentation: \n " + lecture);			
 		}
		
 	}
	

}
