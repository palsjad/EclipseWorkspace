package com.wbl.test;

 import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
  import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite\n");
		
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite \n");
		
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test\n");
		
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test\n");
		
	}
	
	

	
	
	

}
