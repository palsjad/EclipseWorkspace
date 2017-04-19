package com.TestingAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverAutomationTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void before() {
      System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\TestingAutomation\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
	
	@Test
	public void homePageTest() {
		
	//	System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\TestingAutomation\\resources\\chromedriver.exe");		 
	//	WebDriver driver = new ChromeDriver();		WebDriver driver = new ChromeDriver();
		
	// open the browser
		
		driver.get("http://www.walmart.com");
		
		System.out.println("Current URL before : " + driver.getCurrentUrl());
		WebElement element = driver.findElement(By.cssSelector(".elc-icon.elc-icon-cart"));
		element.click();
		
     // the above 2 statements can be combined like this		
	//	driver.findElement(By.cssSelector("elc-icon elc-icon-cart")).click();
		
        System.out.println("Current URL after : " + driver.getCurrentUrl());
        System.out.println("HTML code of application : : " + driver.getPageSource());
        driver.navigate().back();
        System.out.println("Page Title after backward navigation : : " + driver.getTitle());
        driver.navigate().forward();
        System.out.println("Page Title after forward navigation : : " + driver.getTitle());
        driver.navigate().refresh();
     //   driver.navigate().to("http://www.gmail.com");   //it loads given url 
        
        driver.navigate().to("http://www.walmart.com/account/signup");
      
        WebElement element1 = driver.findElement(By.name("firstName"));
     	element1.sendKeys("Pallavi");
       
        // to fine all the elements in create an account on wlamart.com
       List<WebElement> elements = driver.findElements(By.className(".validation-group"));
  //     element = elements.get(1); // here we are trying to get the element with 'lastName' 
       
     

    	   	   
      
       
     
	}
	
	
	//***************************************
	// window handles and quit example
	//***************************************

	@Test
	public void testWblHomePage () {
		
		driver.get("http://whiteboxqa.com");
		driver.findElement(By.id("headerfblogin")).click() ;
		
		String currWindowName = driver.getWindowHandle(); //gives current window name
		
			Set<String> windows = driver.getWindowHandles(); // gives all currrent open  windows 
		
		for(String win : windows){
			System.out.println("the current window is :: " + win);
			if (win != currWindowName){
				//trying to switch control to child window
				driver.switchTo().window(win);
			}
			
			currWindowName = win;
		}
		
		
		driver.findElement(By.id("email")).sendKeys("a@a.com");
		driver.findElement(By.id("pass")).sendKeys("pass");
		driver.findElement(By.name("login")).click();
	
		
	}
	
	 
	
	// this will be executed after every test 
	@AfterTest
	public void after() {
		driver.close();
		
	}

}
