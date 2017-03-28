package com.auto.test;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.auto.page.FlightsPage;
import com.auto.page.KayakHomePage;

public class FlightsPageTest {
	
	
	WebDriver driver; 
	FlightsPage fp;
	KayakHomePage kp;
	
	
	@BeforeClass
	public void before() {
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\resources\\geckodriver.exe");
		driver = new FirefoxDriver();
				
	    fp = new FlightsPage(driver);
		  kp = new KayakHomePage(driver);

		String brow = kp.getKayakHomePage();
	    System.out.println("flights page + " + brow);
	
	}
	
	@Test
	public void clickFlightsTest() {
		
		fp.clickFlights();
		
		
	}
	
	 @AfterClass
	    public void after() {
	    	
	    	driver.close();
	    	
	    	
	    }
	

}
