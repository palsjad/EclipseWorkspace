package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.wbl.helper.WebUIDriver;
 

public class BaseTest {
	
	protected WebDriver driver;
	
	
	
	@BeforeSuite
	public void before() {
		
		
		WebUIDriver.loadProperties("config.properties");
		
		
		
		driver = WebUIDriver.getDriver();
		
		driver.get(WebUIDriver.url);
		
	}

}
