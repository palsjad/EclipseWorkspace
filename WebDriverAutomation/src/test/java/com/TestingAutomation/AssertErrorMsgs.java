package com.TestingAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssertErrorMsgs {

	WebDriver driver;
	
	@BeforeTest
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\TestingAutomation\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void errorMsg() throws Exception {
		
		
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath("//*[@id='next']")).click();
		
		Thread.sleep(2000);	
		String actual_error = driver.findElement(By.xpath("//*[@id='errormsg_0_Email']")).getText();
		
		System.out.println("getTEext " + actual_error);


		Assert.assertEquals(actual_error, "Please enter your email","The strings match");
		System.out.println("test completed");
		
	
		Assert.assertTrue(actual_error.contains("Please enter your mail"));
	}
	
	@AfterTest
	public void after() {
		
		driver.close();
		
	}
}
