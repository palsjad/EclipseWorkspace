package com.wbl.itunesRest.helper;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class getResponse {
	
	HttpResponse resp;
	public   HttpResponse getURLResponse(String url) throws ClientProtocolException, IOException {
		
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpGet get = new HttpGet(url);
		
		HttpResponse response = client.execute(get);
		
		return response;
	}

}
