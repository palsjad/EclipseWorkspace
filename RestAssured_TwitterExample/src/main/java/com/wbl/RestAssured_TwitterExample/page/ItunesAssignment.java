package com.wbl.RestAssured_TwitterExample.page ;

import java.io.IOException;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*; 

 
 
public class ItunesAssignment {

	public static final String KEY = "PALSJADHAV";
	
	public void getMethod() {
		
 		given().get("https://itunes.apple.com/lookup?id=909253").headers();
		
		get.addHeader("content-type", "application/json");
		get.addHeader("token", "pals");
		
		given().
	//	OAuthConsumer consumer = new CommonsHttpOAuthConsumer(KEY,null);
		
	//	OAuthConsumer consumer = new 
//		consumer.s
		
	 
	// 		consumer.sign(get);
			
			try {
				
				response = client.execute(get);
				
				
			} catch (ClientProtocolException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
		
		
			return response;

		
	}
}
