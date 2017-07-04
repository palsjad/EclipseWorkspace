package com.amazonaws.samples;




import java.io.File;
import java.io.IOException;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
//import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
//import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;


public class AWS_UploadFile {
	
 		private static String bucketName     = "pals-awstesting";
		private static String keyName        = "AmazonTestData";
		private static String uploadFileName = "C:\\QA\\EclipseWorkspace\\TestAWS\\src\\main\\resources\\AmazonAddToCartData.xlsx";
		
		public static void main(String[] args) throws IOException {
 			
	//		BasicAWSCredentials creds = new BasicAWSCredentials("access_key", "secret_key"); 
			
			
			BasicAWSCredentials creds = new BasicAWSCredentials("AKIAITLPSDOSPUBBQZPA", "BFDR/9avpgl1+7/ze4XUukHpw9sMKM3oOeOZ/Nc6"); 

			AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withRegion(Regions.US_WEST_2).withCredentials(new AWSStaticCredentialsProvider(creds)).build();

	//		AmazonS3 s3Client = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(creds)).build();
			
	 	
	   //     AmazonS3 s3client = new AmazonS3Client(new ProfileCredentialsProvider());
	        try {
	            System.out.println("Uploading a new object to S3 from a file\n");
	            File file = new File(uploadFileName);
	            s3Client.putObject(new PutObjectRequest(
	            		                 bucketName, keyName, file));
	          
	         } catch (AmazonServiceException ase) {
	            System.out.println("Caught an AmazonServiceException, which " +
	            		"means your request made it " +
	                    "to Amazon S3, but was rejected with an error response" +
	                    " for some reason.");
	            System.out.println("Error Message:    " + ase.getMessage());
	            System.out.println("HTTP Status Code: " + ase.getStatusCode());
	            System.out.println("AWS Error Code:   " + ase.getErrorCode());
	            System.out.println("Error Type:       " + ase.getErrorType());
	            System.out.println("Request ID:       " + ase.getRequestId());
	        } catch (AmazonClientException ace) {
	            System.out.println("Caught an AmazonClientException, which " +
	            		"means the client encountered " +
	                    "an internal error while trying to " +
	                    "communicate with S3, " +
	                    "such as not being able to access the network.");
	            System.out.println("Error Message: " + ace.getMessage());
	        }
	    }
	}
 
