package com.TestingAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {

	@Test
	public void testHomePage(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\WebDriverAutomation\\resources\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com");
		
		System.out.println("The current home page before click is " + driver.getCurrentUrl());
		
		// we can use either CSS Selectors or xpath to fine the elements
		
  		WebElement element = driver.findElement(By.cssSelector(".elc-icon.elc-icon-cart"));
 //	WebElement element1 = driver.findElement(By.xpath(".//span[@class='elc-icon elc-icon-cart']"));
   		
 		element.click();
		System.out.println("The current home page afterr click is " + driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("The current home page afterr click is " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The current home page afterr click is " + driver.getTitle());
		driver.navigate().refresh();
		
		driver.navigate().to("https://www.kayak.com");  //this is used to navigatge to anotherr page
		System.out.println("The current home page afterr click is " + driver.getTitle());

		driver.close(); // closes the curent intance of the browser
		 
		
		
 
		
		
	}
	
	
}
