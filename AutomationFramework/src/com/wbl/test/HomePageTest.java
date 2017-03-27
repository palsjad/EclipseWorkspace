package com.wbl.test;

 
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.page.HomePage;

public class HomePageTest extends BaseTest {
	
	
//	WebDriver driver;   we dont need to do this here now as it is declared and initialized in the base class 
	
	HomePage hm;
	
	@BeforeClass
	public void before() {
	
// the below 2 stmts are moved to BaseClass to remove redundancy and we just extend the base class here
		
//	 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//	 driver = new ChromeDriver();
		
		
//	 hm = new HomePage();
	 
	 
 		hm = new HomePage(driver);   //when we try and pass the driver to the constructor in the  main page
      
 	//	hm.navigateToHomePage();   // moved to the base class
	}
	 
	 @Test
     public void  testNavigationLinks() {
    	 
		 System.out.println("test nav links");
    	 Assert.assertEquals(hm.headerNavLinks(), 5);
     }
	 
	 @Test
	 public void testSearchBox() {
		 System.out.println("test searchbox");

		 Assert.assertEquals(hm.searchBox(), "Walmart.com: Free 2-Day Shipping on Millions of Items");
	 } 
   
	/* @Test
	 public void testClickSignIn() {
		 System.out.println("test sign in");

		 Assert.assertEquals(hm.clickSignIn(), "Login");
		 
	 }
	
	 
	 @Test
	 public void testcreateAccount() {
		 System.out.println("test createaccnt");

		 Assert.assertEquals(hm.clickCreateAccount(), "Login");
		 
	 }
	 
	  */
}
