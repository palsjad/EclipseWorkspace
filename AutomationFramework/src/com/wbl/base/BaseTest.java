package com.wbl.base;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
 import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.wbl.helper.ByClass;
import com.wbl.helper.WebUIDriver;

public class BaseTest {
	
	protected WebDriver driver;
	
	
	@BeforeSuite
	public void beforeSuite(){
	/*	As we have created the config.properties and WebUIDriver.java in build folder we do not need thebelow 2 stmts
	 * 
 	      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		  driver = new ChromeDriver();
*/
		
		
	try {
 	WebUIDriver.loadProperties("config.properties");  		
  	} catch (FileNotFoundException e) {
 		e.printStackTrace();
	} catch (IOException e) {
 		e.printStackTrace();
	}
	
	driver = WebUIDriver.getDriver();
	driver.get(WebUIDriver.appUrl);
	ByClass.loadProperties();
	
	
//	driver.get("http://www.walmart.com"); // moved it here from the HomePage navigateToHomePage() method as it is redundant
// remove all the calls to the method from other test classes
	
	
	
	}
	
	
	@AfterSuite
	public void afterSuite() {
		
		driver.close();
	}

}
