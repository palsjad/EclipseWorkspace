package com.wbl.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class RegisterPage {
	
	WebDriver driver;
	
	
	public RegisterPage(WebDriver driver) {
		
		
		this.driver = driver;
	}
	
	
public String createLogin(String nm, String lastnm, String email, String pwd) {

 
	
		List<WebElement> elements = driver.findElements(By.cssSelector(".form-control"));
		
//taking nm, last name, email and pwd as parameters and send it as an input
		
		elements.get(0).sendKeys(nm);  
		 elements.get(1).sendKeys(lastnm);
		 elements.get(2).sendKeys(email);	 
		 elements.get(3).sendKeys(pwd);	
	//	 elements.get(4).sendKeys(pwd);	// we need to confirm the password, hence twice 
		
			System.out.println("in register page - create login method");

		 
		 driver.findElement(By.xpath(".//button[text()='Create Account']")).click();
	/*	 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
 		String error =  driver.findElement(By.cssSelector(".ada-error-text")).getText();
		
		System.out.println("error : " + error);*/
	 
		 return driver.getTitle();
		 
		 
		 
	}

}
