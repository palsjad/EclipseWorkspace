package com.wbl.mvn.MavenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTesting {
	
//	public static void main(String[] args) {

	
	@Test
	public void webTest() {
	
	System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\MavenTesting\\resources\\chromedriver.exe");
	
	 
	WebDriver driver = new ChromeDriver();
	
	// open the browser
	
	driver.get("http://www.walmart.com");
 
	System.out.println("Themain page title is : " + driver.getTitle());
	
	// find element
	
	By by = By.id("global-search-input");
	WebElement ele = driver.findElement(by);
	
	
	// take action
	
	ele.sendKeys("laptop");
	
	// By by1 = By.className(".header-GlobalSearch-submit btn");    if there is a space in the atrribute sometimes 
	//                                                             it cannot befound so instead usss CSS Selector
	
	 
//	  By by1 = By.cssSelector(".header-GlobalSearch-submit.btn");  // we can use either css or xpath to select the same attribute..in
	                                                               //this example thesubmit buttonforthe search of laptop
	
	By by1 = By.xpath(".//button[contains(@class,'header-GlobalSearch-submit btn')]");
	
		
   ele = driver.findElement(by1); // reusing thealready declared variable ele here
    
    ele.click();
	
	System.out.println("The  page title at the end is : " + driver.getTitle());

	
	driver.close();
	
		
	// perform assertion 
	
	
	
	
}
	
}