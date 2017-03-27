package com.wbl.test;

 
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.base.BaseTest;
import com.wbl.helper.ExcelHelper;
import com.wbl.page.HomePage;
import com.wbl.page.LoginPage;

 
public class LoginPageTest extends BaseTest {
	
	
//	WebDriver driver;
	
	LoginPage lp;
	HomePage hm;
	
	@BeforeClass 
	public void before() {
		
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");
//		driver = new ChromeDriver();
		
		
//      lp = new LoginPage();
		
	//    lp = new LoginPage(driver);
	    
	    hm = new HomePage(driver);
	    
//      hm.navigateToHomePage();  // moved to the base class
	    
	    
//   Here instead of creating a new lp object above we can return the lp object from the clickSignIn method of HomePage     
 //	    hm.clickSignIn();			Thread.sleep(2000);

	    
	    lp = hm.clickSignIn();
	    
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	//@DataProvider(name="logindata")
	
	@DataProvider(name="logindata")
	public Object[][] testData(){
		
		Object[][] data = ExcelHelper.getData("test-data\\login-testdata.xlsx");
		
		System.out.println("DataProvider-testData()  (excel reader) loginPageTest " + data[0][0] + "  " + data[1][1]); 

		
		return data;
		
		
	}
	
	
//  public void testLogin(Object[][] loginDetails) {
	
	@Test(dataProvider="logindata")
	public void testLogin(String uName, String pwd, String expected) throws InterruptedException {
		
//		System.out.println("inside test login : " + loginDetails[0][0] + "  " + loginDetails[1][1]);
		
 		System.out.println("testLogin() - LoginPageTest : " + uName + "  " + pwd + "  " + expected);

		
  	Assert.assertNotNull(lp.login(uName,pwd)); // valid input
		
 // 	Assert.
//		Assert.assertNotNull(lp.login(loginDetails)); // valid input

//		Assert.assertNotNull(lp.login("abctest123@gmail.com","xyz123")); // valid input
		
 

	}
}
