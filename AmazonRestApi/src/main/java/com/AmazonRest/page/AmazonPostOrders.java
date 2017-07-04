package com.AmazonRest.page;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.json.JSONObject;

public class AmazonPostOrders {
	
	
	public void postOrders() {
		HttpResponse response = null;
		
		HttpClient client = HttpClientBuilder.create().build();
		
		HttpPost post = new HttpPost("http://api.amazon.com/orders");
		
		
		JSONObject obj = new JSONObject();
		
		obj.put("order_date", "05/02/2017");
		obj.put("description", "buddha statue");
		obj.put("products", "volcanic ash buddha");
		obj.put("customer_id", "101");
		
		
	 try {
		StringEntity entity = new StringEntity(obj.toString());
		
		post.setEntity(entity);
		
		post.addHeader("content-type", "application/json");
 
			response = client.execute(post);
		} catch (ClientProtocolException e) {
 			e.printStackTrace();
		} catch (IOException e) {
 			e.printStackTrace();
		}  
		
		
		
	}

}
