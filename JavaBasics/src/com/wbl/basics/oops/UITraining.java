package com.wbl.basics.oops;

public class UITraining extends Training {

	private String course = "UI";

	@Override
	public void getLectures(String course, String type) {
		if ( type == "Recording") {
			String lecture = Training.displayRecording(this.course);	
            System.out.println("Inside the UITraining child class (Overriding) to get the recording : \n\n " + lecture);			
		}
		else if (type == "Presentation") {
 			String lecture = Training.displayPresentation(this.course);
            System.out.println("Inside the UITraining child class (Overriding) to get the presentation : \n\n " + lecture);			
 		}
		
 	}
	

	
	
	
}
