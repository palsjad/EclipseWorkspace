package com.TestingAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionsDemo {

	WebDriver driver;
	
	@BeforeTest
	public void before() {
		
	// 	System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\WebDriverAutomation\\resources\\chromedriver.exe");
	 	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
 		  driver = new ChromeDriver(); 
	}
	
	
	
	@Test
	public void actionExample() {
		
		driver.get("https://www.ebay.com");
		
//  this is how a tbale elment looks like	--- table/tbody/tr/td[column number] 
//		driver.findElement(By.xpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[5]/a"));

		System.out.println("The before page title is : " + driver.getCurrentUrl());
	
// the below 2 stmts go together	
		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS );
	//	WebElement element = driver.findElement(By.xpath(".//a[@class='rt'][contains(text(),'Fashion')]"));

		
// the below 2 stmts go together		
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@class='rt'][contains(text(),'Fashion')]")));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
//		element = driver.findElement(By.xpath(".//*[contains(text(),'   Watches')]"));
		
	    element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[contains(text(),'   Watches')]")));

		action.moveToElement(element).click().build().perform();
		
		System.out.println("The after page title is : " + driver.getCurrentUrl());

	//	 driver.close();
		
		
	}
	
	
	@Test  // alet based on the div element in html 
	public void alertPopup(){
		
		driver.get("https://www.seleniumeasy.com");
WebDriverWait wait = new WebDriverWait(driver,15);
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mc-closeModal")));
		
        element.click();
		
		
		
	}
	
	
	@Test   // alerrt based on the browser window alert()  hwere we cannot riht click and inspect the alert box
	public void alertPopup1(){
		
		driver.get("file:///C:/QA/EclipseWorkspace/WebDriver_Alert.html");

 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click Me')]"));
		
		element.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();

		// goes to immediate parent window of the alert
//		driver.switchTo().parentFrame();
		
		//goes to root window		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("txt-id")).sendKeys("hello");
		

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	// 	alert.dismiss();
		
	}
	
 	
	@Test
	public void iframeAlertExample() {
		
	 	driver.close();
		
 //	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\chromedriver.exe");
  System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\WebDriverAutomation\\resources\\chromedriver.exe");
	 
	  	
		ChromeOptions cm = new ChromeOptions(); // specific to chrome brrowser
		cm.addArguments("--disable-notifications");
		
		
		WebDriver driver = new ChromeDriver(cm);  
		
	//	WebDriver driver = new ChromeDriver(); 
		  
		System.out.println("before");

			driver.get("http://www.jabong.com/online-sale/");
			
			System.out.println("after");
	 

		/* WebDriverWait wait = new WebDriverWait(driver,30);
         WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
        		 By.cssSelector("[data-gaq-event='Top_Nav~$~sports']")));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element1).perform();	
		*/
			
    driver.findElement(By.id("search")).sendKeys("watches");			
		
    try {
		Thread.sleep(2000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
    
 	driver.get("file:///C:/QA/EclipseWorkspace/iframeExample.html");
 	
	System.out.println("after");

		
	 	
//		driver.get("file:///C:/QA/EclipseWorkspace/iframeExample.html");
		
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
		
		WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click Me')][1]"));
		
		element.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.dismiss();
		
		System.out.println("riva");

		
		driver.switchTo().frame(driver.findElement(By.id("ifid")));
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;

		driver.findElement(By.linkText("info@whitebox-learning.com")).click();
		
		System.out.println("pallavi");
	 
	/*	driver.switchTo().alert();
		
		alert.dismiss();
		 */
		driver.switchTo().parentFrame();
		
	  driver.findElement(By.xpath("//button[contains(text(),'Click Me')][3]")).click();
	    
	    alert = driver.switchTo().alert();
	    
	    
        alert.sendKeys("the jadhavs") ;
        
	    alert.accept();
	    
		driver.findElement(By.id("txt-id")).sendKeys("success");

	    try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
 @AfterTest
	public void after() {
	
	driver.close();
	} 
	 
}
