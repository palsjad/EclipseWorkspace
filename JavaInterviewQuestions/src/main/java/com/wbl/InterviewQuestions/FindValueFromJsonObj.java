/*

Write a code to get the value from JSON Object?
eg-{
    "status": 200,
    "data": { "uniqueid": "id201" },
    "message": "hello"
}

 */


package com.wbl.InterviewQuestions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;


public class FindValueFromJsonObj {

	

	public void readData() {


		BufferedReader br =  null;
		String jsonString = "";

		try {
			String line = "";

			br  = new BufferedReader(
					new FileReader("C:\\QA\\EclipseWorkspace\\JavaInterviewQuestions\\jsonSample.txt"));

			while((line = br.readLine()) != null) {

				jsonString = jsonString+ line + "\n";

			}

		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		
		 catch (IOException f){
				f.printStackTrace();
			}
		
		
		finally {
			try {

				if(br != null) {
					br.close();
				}

			}
			catch(FileNotFoundException ex ){
				ex.printStackTrace();
			}
			catch (IOException f){
				f.printStackTrace();
			}
		
		
 
		}


		
       JSONObject obj = new JSONObject(jsonString);
       
       System.out.println("Status : " + obj.get("status"));
       System.out.println("data : " + obj.get("data"));
      System.out.println("data : " + obj.getJSONObject("data"));
      
  //    JSONObject obj1 = new JSONObject(obj.get("data"));
      
      JSONObject obj1 = new JSONObject();
       
      obj1 = obj.getJSONObject("data");
      
       
      System.out.println("unique id : " + obj1.get("uniqueid"));
      
      System.out.println("name : " + obj1.get("name"));


       System.out.println("message : " + obj.get("message"));
		
		
		
		

	}

    public static void main(String args[]) {
    	
    	FindValueFromJsonObj fv = new FindValueFromJsonObj();
    	
    	fv.readData();
    	
    	
    }


}



 

