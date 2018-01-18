package com.wbl.RestAssured_WalmartSearchApi;

import static io.restassured.RestAssured.*;
 import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*; 

import org.testng.annotations.BeforeClass;


public class WalmartRestAssuredTest  {
	
	@BeforeClass
	public void before() {
	// this single line below we give the consumer key and access tokens 
		
 	given().auth().oauth("", "", "", "").when().get("").then().statusCode(200);
	}
	
	
	
	
	
	
	
	
	
}