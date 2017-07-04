package com.wbl.itunesRest.test;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.itunesRest.helper.Constants;
import com.wbl.itunesRest.page.itunesAPIMethods;

 
public class itunesAPIMethodsTest {
	
	itunesAPIMethods iam;
	
	HttpResponse resp;

	 @BeforeClass
	 public void before() {
		 
		 iam = new itunesAPIMethods();
		 
		 
	 }
	
	 @Test
	 public void getURLResponseTest() {
		 
	try {
		resp = iam.getURLResponse(Constants.URL);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
	 
	 @Test
	public void itunesGetTest() throws ClientProtocolException, IOException {
		
	int result = 	iam.itunesGetStatus();
		Assert.assertEquals(result,200);
		
		
	}
	 
	 @Test
	 public void itunesGetJson() throws JSONException, IllegalStateException, IOException {
		 
		 iam.getJsonObj(resp);
		 
	 }
 }
 
