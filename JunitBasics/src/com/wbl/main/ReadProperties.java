package com.wbl.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties  {
	
	public String propertiesExample(String fileName) throws IOException, FileNotFoundException {
		
		 Properties prop = new  Properties();
		 
	
//try {
		
 		FileInputStream fs = new FileInputStream("C:\\Users\\sjjadhav\\Desktop\\" + fileName);

		prop.load(fs);
		
		System.out.println("the city is : " + prop.getProperty("city"));
		System.out.println("the state is : " + prop.getProperty("state"));
		System.out.println("the zip is : " + prop.getProperty("zip"));

//	}
//	catch (IOException e) {
//		e.printStackTrace();
//	}
//	
	 return    prop.getProperty("city");                               
}

	
}
