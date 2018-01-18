package com.wbl.helper;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUIDriver {
	
	
	public static String browser;
	
	public static String url ;
	
	
	public static void loadProperties(String file) {
		
	//	Properties prop = new Properties();
		 
		Properties prop =  ConfigUtils.loadProperties(file);
		
		browser = prop.getProperty("browserNm");
		
		url = prop.getProperty("Url");
		
	}
		
		public static WebDriver getDriver() {
			
			WebDriver driver = null;
			
			switch(browser) {
			
			case "chrome" : 
				
				  System.setProperty("webdriver.chrome.driver", "Constants.PATH + Url ");
			
			      driver = new ChromeDriver();
			      break;
			      
			case "firefox" :
				
				System.setProperty("webdriver.chrome.driver", "Constants.PATH + chromedriver.exe ");
				
			      driver = new ChromeDriver();
			      break;
			      
			
			
		}
		
		return driver;
		
	}
	
	

}
