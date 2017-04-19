package com.wbl.advanced.collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class PropertiesAndDateExample {
	
	public void propBasics() {
	Properties prop = new Properties();

	try {
		
 		FileInputStream fs = new FileInputStream("C:\\Users\\sjjadhav\\Desktop\\prop");
		  
 		
 		//C:\\Users\\sjjadhav\\Desktop\\prop.properties");
		
		
		System.out.println("fs : " + fs);
		
		prop.load(fs);
		
		System.out.println("the city is : " + prop.getProperty("city"));
		System.out.println("the state is : " + prop.getProperty("state"));
		System.out.println("the zip is : " + prop.getProperty("zip"));

	}
	catch (IOException e) {
		e.printStackTrace();
	}
	
	                                    
}
 

public static void main(String[] args) {
	
	PropertiesAndDateExample  pr = new PropertiesAndDateExample();
	
	pr.propBasics();
	
	Date dt = new Date();
	System.out.println("the date is : " + dt);
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss"); // this format willbe in the format of the dateformat (dt)
	
	System.out.println("the simple date format  is : " + sdf.format(dt));

	
	
}	
}
