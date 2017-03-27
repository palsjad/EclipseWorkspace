package com.wbl.test;

 import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;
import com.wbl.page.RegisterPage;

public class RegisterPageTest extends BaseTest {
	
 //	WebDriver driver;
	
	RegisterPage rp;
	
	HomePage hm; 
	
	@BeforeClass 
	public void before() {
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		
  //      rp = new RegisterPage(driver);
 	    hm = new HomePage(driver);  

        
//        hm.navigateToHomePage();   // moved to the base class

// 	   Here instead of creating a new rp object above we can return the rp object from the clickCreateAccount method of HomePage 
 	    
        rp = hm.clickCreateAccount();
        
         
	}

	
	@Test
	public void testCreateLogin() {
	
 		
	 	Assert.assertNotNull(rp.createLogin("p","j","deftest123@gmail.com","xyz123"));
		
 	//	Assert.ass;
	}

}
