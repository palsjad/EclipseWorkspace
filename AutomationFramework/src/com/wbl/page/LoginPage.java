package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver; 
	
	
// create a constructor to 	pass the value of the driver which it derives from the base class when extending it in the LoginPageTest

	public LoginPage(WebDriver driver)  {
	
	this.driver = driver;
	
	System.out.println("in login page - constructor");

	
}
	
	
	 public String login(String nm, String pwd) throws InterruptedException {
	
//	public String login(Object[][] loginDetails) {
		
		System.out.println("in login page - login method");
/*		
		String nm;
		String pwd;
		
		nm =  loginDetails[0][0].toString();
		pwd = loginDetails[0][1].toString();
*/
		System.out.println("in login page - username and passwrod  " + nm + "  " + pwd);
	
		
//		input[title='Email address']
		List<WebElement> elements = driver.findElements(By.cssSelector(".form-control"));
		
	/*	 for(int i = 0; i < loginDetails.length-1; i++) {
	 		
			nm = loginDetails[i][1];
				*/
		   
			elements.get(0).sendKeys(nm);  //taking nm and pwd as parameterrs and send it as an input
			elements.get(0).clear();
			Thread.sleep(2000);
			elements.get(1).sendKeys(pwd); 
			elements.get(1).clear();	
			Thread.sleep(2000);

		driver.findElement(By.xpath(".//button[text()='Sign In']")).click();
//		} 
		
		return driver.getTitle();

	}
	
	
	
}
