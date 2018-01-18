package com.wbl.helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {
	
	
	
	public static Properties loadProperties(String filename) {
		
		
		Properties prop = new Properties();
	
        try {
			prop.load(new FileInputStream(Constants.PATH+filename));
		} catch (IOException e) {
 			e.printStackTrace();
		} 
	
	    return prop;
	
	
	}

}
