package com.TestingAutomation;

 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SelectAndRadio {
	
	
WebDriver driver;
	
	@BeforeTest
	public void before() {
      System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\TestingAutomation\\resources\\chromedriver.exe");
	  driver = new ChromeDriver();
	}
	
	@Test
	public void faceBookPageTest() throws InterruptedException{	
		driver.get("https://www.facebook.com");
		
		System.out.println("The current home page before click is " + driver.getCurrentUrl());
		
		driver.findElement(By.id("u_0_1")).sendKeys("innovapath");	
		driver.findElement(By.id("u_0_3")).sendKeys("company");	
	 
			Thread.sleep(500);
		 
		
//***********************  SINGLE SELECT OPTION ******************************************
		
		WebElement element = driver.findElement(By.id("month"));
		Select sel = new Select(element);		
		sel.selectByIndex(5);

// ***************** the following 4 methods return true or false *************************************
		
		System.out.println("testing isSelected method of the WebElement :" + element.isSelected());	
		System.out.println("testing isDisplayed method of the WebElement :" + element.isDisplayed());	
		System.out.println("testing isEnabled  method of the WebElement :" + element.isEnabled());	
		
		System.out.println("select is multi select or single select " + sel.isMultiple());	

// ****************************************************************************************************		
		
/*	    combine the first 2 stmts in one		
		element = driver.findElement(By.id("day"));
		Select sel = new Select(element);
		
*/
		
		
	    sel = new Select(driver.findElement(By.id("day"))); 	
		sel.selectByValue("10");
		
 
	    sel = new Select(driver.findElement(By.id("year"))); 	
 	    sel.selectByVisibleText("1980");
 	    
 	    
//************** TO LIST ALL THE INNER TEXT UNDER SELECT ***********************
 	    
 	    
		Select sel1 = new Select(driver.findElement(By.id("month"))); 
		
		
 
		List<WebElement> optionsList = sel1.getOptions();
        
        for(WebElement el : optionsList) {
        	
        	System.out.println("the list is : " + el.getText());    	
        	
        }
        
        
 // ********************* RADIO BUTTONS *****************************       
        
	driver.findElement(By.xpath("//*[@id='u_0_k']")).click();  // to select radio buttons
	
//************************************************************** ****
	
	
// ******************** MULTIPLE SELECT OPTIONS ***************************
	
	
        
        driver.navigate().to("http://wenzhixin.net.cn/p/multiple-select/docs/");
        
     
 //       Select sel2 = new Select(driver.findElement(By.xpath("//*[@id='e1_f']/select")));
        
        Select sel2 = new Select(driver.findElement(By.className("w300")));   
        
    	System.out.println("select is multi select or single select " + sel2.isMultiple());	
        
        sel2.selectByVisibleText("October");
        sel2.selectByVisibleText("November");
        sel2.selectByVisibleText("January");
        sel2.selectByVisibleText("May");

        Thread.sleep(500);
        sel2.deselectByVisibleText("October");
     //   sel2.deselectAll();

        List<WebElement> multiSelectOpts = sel2.getAllSelectedOptions();
        
        for(WebElement mso : multiSelectOpts) {
        	
        	System.out.println("the selected options are : " + mso.getText());
        	
        }
 //*********************************************************************************       
 	  
       driver.close(); 
        
	}
}
