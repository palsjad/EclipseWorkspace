package com.auto.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.auto.page.KayakHomePage;

public class KayakHomePageTest {

	WebDriver driver; 
	KayakHomePage khp;
	
	@BeforeClass
	public void before() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
				
		  khp = new KayakHomePage(driver);
		khp.getKayakHomePage();
		
	}

 /*   @Test
    public void getKayakHomePageTest(String value) {
    	
    	 assertEquals(value,"Search Flights, Hotels & Rental Cars | KAYAK");
    }
*/

    @Test
	public void clickHotelsTest() {
		
	//	 khp.clickHotels();
 		 assertEquals(khp.clickHotels(),"Search Flights, Hotels & Rental Cars | KAYAK");
		
	}
    
    
    @AfterClass
    public void after() {
    	
    	driver.close();
    	
    	
    }
	
}