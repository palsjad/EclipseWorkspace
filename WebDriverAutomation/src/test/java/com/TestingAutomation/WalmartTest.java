package com.TestingAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WalmartTest {
	
	WebDriver driver;

	@BeforeTest
	public void before() {
      System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\TestingAutomation\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	} 
	
	@Test
	public void  waitsTest() throws InterruptedException {
		
     driver.get("https://www.walmart.com");	
     
     
//     WebElement element = driver.findElement(By.xpath("//button[.='All Departments'][@data-uid='LHN']"));
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  
     WebElement element = driver.findElement(By.xpath("//button[.='All Departments'][@data-uid='LHN']"));
     
     Actions action = new Actions(driver);
     
 
 //   action.moveToElement(element).build().perform();
     
     action.moveToElement(element).perform();


     element = driver.findElement(By.cssSelector("[id='superDeptId-3']"));
     
    action = new Actions(driver);

     action.moveToElement(element).build().perform();
     
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.findElement(By.linkText("Shop All Clothing")).click();
    
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
   driver.findElement(By.xpath("//a[@title='See more categories']")).click();
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     
/*     
   driver.findElement(By.xpath("//div//a[@href='https://www.walmart.com/cp/Watches/3906?povid=5438+%7C+contentZone1+%7C+2017-01-13+%7C+1+%7C+all+watches?facet=style%3ASport ']")).click();
   element =  driver.findElement(By.cssSelector("[href='https://www.walmart.com/cp/Watches/3906?povid=5438+%7C+contentZone1+%7C+2017-01-13+%7C+1+%7C+all+watches?facet=style%3ASport ']"));        driver.findElement(By.cssSelector("[class='ModuleDrawerTile-link']")).click();  
     
     WebElement element1 = driver.findElement(By.xpath("//div/a/img[@alt='Women']"));  
     action.moveToElement(element1).perform();

       
    List <WebElement> element1 = driver.findElements(By.className("title"));
    
    System.out.println("the list size is : " + element1.size());
    Assert.assertEquals(element1.size(), 16);
     
     action.moveToElement(element).perform();

     action.click();
 */
     
	}
	
	
	
	
	@AfterTest
	public void closeDriver(){
		
 		driver.close();
	}

}