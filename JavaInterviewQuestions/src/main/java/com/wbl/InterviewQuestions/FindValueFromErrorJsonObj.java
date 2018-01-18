package com.wbl.InterviewQuestions;

import java.io.BufferedReader;
 import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class FindValueFromErrorJsonObj {

	public void readErrorFile() {
		BufferedReader br = null;
		String jsonErrorData = "";

		try {

			String line = "";

			br = new BufferedReader(
					new FileReader("C:\\QA\\EclipseWorkspace\\JavaInterviewQuestions\\errorLogInJson.txt"));


			while((line = br.readLine()) != null) {

				jsonErrorData  += line + "\n";

			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		finally {

			if (br != null) {

				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}


		}



		JSONObject obj = new JSONObject(jsonErrorData);

		System.out.println("error : " + obj.get("error"));
		
  
		obj = obj.getJSONObject("error");
		


		System.out.println("code : " + obj.get("code"));
		System.out.println("message : " + obj.get("message"));
		System.out.println("Status : " + obj.get("status"));
		System.out.println("details : " + obj.get("details"));
		
		JSONArray arr = new JSONArray();
		
		arr = obj.getJSONArray("details");
		

		obj = arr.getJSONObject(0);
		
		System.out.println("details - @type : " +  obj.get("@type"));
		System.out.println("details - fieldViolations : " +  obj.get("fieldViolations"));

       arr = obj.getJSONArray("fieldViolations");
       
       obj = arr.getJSONObject(0);
       
       System.out.println("fieldViolations - field : " + obj.get("field"));
       System.out.println("fieldViolations - description : " + obj.get("description"));

 	}	

	public static void main(String[] args) {


		FindValueFromErrorJsonObj  fv = new FindValueFromErrorJsonObj();

		fv.readErrorFile();


	}
}
