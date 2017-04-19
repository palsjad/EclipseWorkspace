package com.TestingAutomation;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

 
public class WaitsDemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\WebDriverAutomation\\resources\\chromedriver.exe");
		  driver = new ChromeDriver();
	}

	
	@Test
	public void testWaits() {
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
// try changing thetime here. Make is less than 6 seconds and more than 6 seconds.		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //without the implicit wait the webdriver will 
		                                                               // not be seen as the timer is set for 5 seconds and the 
		                                                             //element is displayed at the 6th second
		
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
 
		
		WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		
		
		
		Boolean status = element.isDisplayed();
		
		if (status) {
			
			System.out.println("the element WebDriver is displayed\n");
			
		}
		else {
			
			System.out.println("the element WebDriver is not displayed\n");
	
		}
		
		
		
 		
	}
	
	
	@Test
	public void explicitWaitTest() {
		
		
		driver.get("https://www.walmart.com");
		
		System.out.println("the page title is : " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys("laptop");
		
	 	WebDriverWait expWait = new WebDriverWait(driver, 20);
	 	
	  	String result = expWait.until(func);
	 	
	  	System.out.println("search page title : " + result);
			 	
	 

	 	
	 	
	//	driver.close();
		
		
	}
	
	
	Function<WebDriver, String> func = new Function<WebDriver, String>() {

		public String apply(WebDriver input) {
			
		 	WebDriverWait expWait = new WebDriverWait(driver, 20);
		 	
       	List<WebElement> element1 = expWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));


	//		List<WebElement> element1 = driver.findElements(By.cssSelector(".header-Typeahead-row"));
	  	 
		 	System.out.println("the elements size : " + element1.size());
		 	
			for(WebElement ele : element1){
				
				System.out.println("elements :  " + ele.getText());
				
		 	if(ele.getText().equalsIgnoreCase("laptops on sale") ) {
		 		
		 		ele.click();
		 		System.out.println("search page title : " +  driver.getTitle());

		 		break;
		 		
		 	}
				
				
		  }	
			return driver.getTitle();
			
		}

 	
		
	};
	
	
	
	public void fluentWaitTest() {
		
	driver.get("https://www.walmart.com");
		
		System.out.println("the page title is : " + driver.getTitle());
		
 		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				                                 .withTimeout(20, TimeUnit.SECONDS)
				                                .pollingEvery(5, TimeUnit.SECONDS)
				                                .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='global-search-input']")));
 
	
		driver.findElement(By.xpath("//*[@id='global-search-input']")).sendKeys("laptop");
		

	}
	
	
	
	
	@AfterTest
	public void after() {
		
		driver.close();
	}
	

}
