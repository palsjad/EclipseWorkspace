package com.wbl.itunesRest.page;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//import org.testng.Assert;

import com.wbl.itunesRest.helper.getResponse;


public class itunesAPIMethods {

	
	HttpResponse resp ;
	
	
public   HttpResponse getURLResponse(String url) throws ClientProtocolException, IOException {
		
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet get = new HttpGet(url);
		
		HttpResponse response = client.execute(get);
		
		return response;
	}

	
	public int itunesGetStatus() throws ClientProtocolException, IOException {
		
	getResponse gr = new getResponse();
	
//	HttpResponse resp = 	getResponse.getURLResponse("https://itunes.apple.com/lookup?id=909253");
	
	
 	  resp = gr.getURLResponse("https://itunes.apple.com/lookup?id=909253");

	
	System.out.println("the status code is " + resp.getStatusLine().getStatusCode());
	
//	Assert.assertEquals(resp.getStatusLine().getStatusCode(), 200 );
	
	
	return resp.getStatusLine().getStatusCode();
	
	}
	
	public void getJsonObj (HttpResponse resp) throws JSONException, IllegalStateException, IOException {
	
	JSONObject obj = new JSONObject(IOUtils.toString(resp.getEntity().getContent()));
	
	System.out.println("the resopnse is : " + obj);
	
	System.out.println("the whole object : " + obj.getJSONArray("results"));
	
	System.out.println("the whole object : " + obj.get("results"));

	
	JSONArray arr = obj.getJSONArray("results");
	
	
	for(int i = 0; i < arr.length(); i++) {
		
		JSONObject resultObj = arr.getJSONObject(i);
		
		System.out.println(resultObj.get("artistName"));
        System.out.println(resultObj.get("artistId"));

	//	System.out.println(x);
		
		
	}
		
	}
}
