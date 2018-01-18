package com.wbl.page;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONObject;
import org.testng.annotations.Test;

import com.wbl.helper.Constants;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class TwitterRestApi {

	public HttpResponse getData() {

		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();

		HttpGet get = new HttpGet(Constants.GETURL);

		get.addHeader("content-type", "application/json");

		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
		consumer.setTokenWithSecret(Constants.ACCESS_TOKEN, Constants.TOKEN_SECRET);

		try

		{

			consumer.sign(get);

			response = client.execute(get);

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (OAuthMessageSignerException e1) {
			e1.printStackTrace();
		} catch (OAuthExpectationFailedException e1) {
			e1.printStackTrace();
		} catch (OAuthCommunicationException e1) {
			e1.printStackTrace();
		}


		return response;
	}

	// *********************************************************************************************

	public HttpResponse postData() {

		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();

		HttpPost post = new HttpPost(Constants.POSTURL);

		try {
			// creating the request data

			// We can create 			

			JSONObject obj = new JSONObject(); // here to create the request data we create the HJSONObject lcass .

			obj.put("name", "Pankaj");
			obj.put("location", "Dublin");


			StringEntity entity = new StringEntity(obj.toString());


			// setting the request entity payload to post method

			post.setEntity(entity);


			/*

//*********************************************************************************			
// request data can be created with NameValuePair too as following

			List<NameValuePair> pair = new ArrayList<NameValuePair>();
			pair.add( new BasicNameValuePair("name", "Pankaj"));
			pair.add( new BasicNameValuePair("location", "Dublin"));

			post.setEntity(new UrlEncodedFormEntity(pair));
//*********************************************************************************			
			 */


			post.addHeader("content-type", "application/json");


			OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
			consumer.setTokenWithSecret(Constants.ACCESS_TOKEN, Constants.TOKEN_SECRET);

			consumer.sign(post);

			response = client.execute(post);

		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (OAuthMessageSignerException e1) {
			e1.printStackTrace();
		} catch (OAuthExpectationFailedException e1) {
			e1.printStackTrace();
		} catch (OAuthCommunicationException e1) {
			e1.printStackTrace();
		}


		return response;
	}

	// *********************************************************************************************




	public HttpResponse postMessage() throws IOException {




		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();


		HttpPost post1 = new HttpPost(Constants.POSTURL1);

		System.out.println("11111111111");

		try {



 			JSONObject obj1 = new JSONObject();  
 			JSONObject obj2 = new JSONObject();  
			JSONObject obj3 = new JSONObject();  
 
			JSONObject obj = new JSONObject();  
			JSONObject event = new JSONObject();  


			/*	 
				{		 
				  "event": {
				    		"type": "message_create",
			    			"message_create": {      "target": {
				                                                  "recipient_id": "856678409467871232"
				                                           },

				                               "message_data": {
				                                                  "text": "Hello timepassPJ!"
				                                           }
				                              }
			                 }
				}

				JSONOjbect obj = new JSONObject().put("jsonrpc", "2.0") .put("method", "Files.GetSources").put("id", 1) 
				.put("params", new JSONObject().put("media", "music"));

			 */
			obj1.put("text", "i am thrilled");
			obj2.put("recipient_id", "856678409467871232");
			obj3.put("target", obj2).put("message_data", obj1);
			
			obj.put("type", "message_create").put("message_create", obj3);
			
			event.put("event", obj);

			StringEntity entity = new StringEntity(event.toString());

			post1.setEntity(entity);


			/*	
			Event Object
			type (required)	The type of event you are posting. For Direct Messages, use message_create
			message_create.target.recipient_id (required)	The ID of the user who should receive the direct message.
			message_create.message_data (required)	The Message Data Object defining the content to deliver to the reciepient.
			Message Data Object
			text (required)	The text of your Direct Message. URL encode as necessary. Max length of 10,000 characters.
			 Max length of 9,990 characters if used as a Welcome Message.		

			 */


			post1.addHeader("content-type", "application/json");


			post1.addHeader("User-Agent","USER_AGENT");


			System.out.println("444444444444");


			OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
			consumer.setTokenWithSecret(Constants.ACCESS_TOKEN, Constants.TOKEN_SECRET);



			System.out.println("5555555555555");

			consumer.sign(post1);

			System.out.println("666666666666");

			response = client.execute(post1);

			System.out.println("777777777777");


		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (OAuthMessageSignerException e1) {
			e1.printStackTrace();
		} catch (OAuthExpectationFailedException e1) {
			e1.printStackTrace();
		} catch (OAuthCommunicationException e1) {
			e1.printStackTrace();
		}

		System.out.println("response : " + response.toString());
		return response;

	}




	//*********************************************************************************************


	public HttpResponse postMessage2() throws IOException, OAuthMessageSignerException, OAuthExpectationFailedException, OAuthCommunicationException {


		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();


		HttpPost post1 = new HttpPost(Constants.POSTURL2);

		List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

		urlParameters.add(new BasicNameValuePair("user_id", "message_create"));
		urlParameters.add(new BasicNameValuePair("screen_name", "timepassPJ"));
		urlParameters.add(new BasicNameValuePair("text","hello Pallavi from eclipse"));


		System.out.println("2222222222222222");


		//		post1.setEntity(new UrlEncodedFormEntity(urlParameters));

		System.out.println("333333333333333");



		post1.addHeader("content-type", "application/json");


		post1.addHeader("User-Agent","USER_AGENT");



		System.out.println("444444444444");


		OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
		consumer.setTokenWithSecret(Constants.ACCESS_TOKEN, Constants.TOKEN_SECRET);

		post1.setEntity(new UrlEncodedFormEntity(urlParameters));

		// 		OAuth_timestamp = [System.Convert]::ToInt64($ts.TotalSeconds + 305).ToString();

		post1.addHeader("oauth_callback", "http://localhost/sign-in-with-twitter/");

		System.out.println("5555555555555");

		consumer.sign(post1);

		System.out.println("666666666666");

		response = client.execute(post1);

		System.out.println("777777777777");





		return response;


	}


}


//*********************************************************************************************

/*
	@Test
	public void postMessage1() throws IOException {

		HttpResponse response = null;

		HttpClient client = HttpClientBuilder.create().build();


		HttpPost post1 = new HttpPost(Constants.POSTURL1);

		try {

			JSONObject obj = new JSONObject();  

			JSONObject obj1 = new JSONObject();  




				{		 
				  "event": {
				    		"type": "message_create",
			    			"message_create": {      "target": {
				                                                  "recipient_id": "856678409467871232"
				                                           },

				                               "message_data": {
				                                                  "text": "Hello timepassPJ!"
				                                           }
				                              }
			                 }
				}



			obj.put("type", "message_create");
			obj.put("message_create.target.recipient_id", "856678409467871232");
//			obj.put("message_create.message_data", "Hello World!");




 //   URL url = new URL("http://sentiment.vivekn.com/api/batch/");'

		URL url = new URL ("https://api.twitter.com/1.1/direct_messages/events/new.json");

     HttpURLConnection connection = (HttpURLConnection) url.openConnection();


    connection.setConnectTimeout(5000);//5 secs
    connection.setReadTimeout(5000);//5 secs

    connection.setRequestMethod("POST");
    connection.setDoOutput(true);
    connection.setRequestProperty("Content-Type", "application/json");

    OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());  
    out.write(
            "[ " +
            		"\"Hello Pallavi!!!!\"," +
                    "\"another thing here\" " +
                    "]");
            out.flush();
            out.close();

            int res = connection.getResponseCode();

            System.out.println(res);


            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = null;
            while((line = br.readLine() ) != null) {
                System.out.println(line);
            }
            connection.disconnect();


			JSONObject obj2 = new JSONObject();  

 			obj1.put("text", "Hello World!");
 			obj2.put("message_data", obj1);

			JSONObject obj3 = new JSONObject();  
			JSONObject obj4 = new JSONObject();  

			obj3.put("recipient_id", "856678409467871232");
			obj4.put("target", obj3);

			JSONObject obj5 = new JSONObject();  
			obj5.put("message_create", obj2);
			obj5.put("message_create", obj4);


			JSONObject obj6 = new JSONObject();  
			obj6.put("type", "message_create");


			JSONObject obj7 =  new JSONObject();  

			obj7.put("event", obj6);
			obj7.put("event", obj5);



			obj.put("type", "message_create");
			obj.put("message_create.target.recipient_id", "856678409467871232");
//			obj.put("message_create.message_data", "Hello World!");
 			obj.put("message_create.message_data.text", "Hello World!");







  		StringEntity entity = new StringEntity(obj7.toString());

  		System.out.println("entity : " + entity.toString()  );

 	 //		obj1.put("event", new obj.toString());

 	//		obj1.put("event", obj);

 //			StringEntity entity = new StringEntity(obj1.toString());



			post1.setEntity(entity);


	//		post1.addHeader("content-type", "application/json");

			OAuthConsumer consumer = new CommonsHttpOAuthConsumer(Constants.CONSUMER_KEY, Constants.CONSUMER_SECRET);
			consumer.setTokenWithSecret(Constants.ACCESS_TOKEN, Constants.TOKEN_SECRET);


			consumer.sign(post1);

			response = client.execute(post1);

		} catch (ClientProtocolException e) {
 			e.printStackTrace();
		} catch (IOException e) {
 			e.printStackTrace();
		} catch (OAuthMessageSignerException e1) {
 			e1.printStackTrace();
		} catch (OAuthExpectationFailedException e1) {
 			e1.printStackTrace();
		} catch (OAuthCommunicationException e1) {
 			e1.printStackTrace();
		}


	////return res;

	}

}
 */