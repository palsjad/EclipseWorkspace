package com.wbl.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	
	public static Properties loadProperties(String fileName) throws FileNotFoundException, IOException {
		
		Properties prop = new Properties();
		
//		prop.load(new FileInputStream(System.getProperty("user.dir")+"\\resources\\" + fileName));

//      moved to Constants interface in helper package. So now instead we can write like this
		
		System.out.println("filename : " + fileName);
		
  		prop.load(new FileInputStream(Constants.PATH + fileName));

 		 
        return prop;		
	}

}
