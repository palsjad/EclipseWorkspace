package com.wbl.test;


import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.helper.Constants;
import com.wbl.page.ReadSymbol;

public class ReadSymbolTest {

	public WebDriver driver;
	public WebDriverWait wait;
	String appURL = "appURL";

	private String spreadsheetId = "1rCKXCEDH2TF7jmTvisWtK5FjWx8Q2gES54xylFfiXuo0"; 

	private String range = "UserInfo!A3:E";
	String userName = "pals.jadhav@gmail.com";
	String password = "faltu789";

	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\resources\\chromedriver.exe");


		//	  System.setProperty("webdriver.chrome.driver", Constants.PATH + "chromedriver.exe");



		// Create object of HashMap Class
		Map<String, Object> prefs = new HashMap<String, Object>();

		// Set the notification setting it will override the default setting
		prefs.put("profile.default_content_setting_values.notifications", 2);

		// Create object of ChromeOption class
		ChromeOptions options = new ChromeOptions();

		// Set the experimental option
		options.setExperimentalOption("prefs", prefs);

		// pass the options object in Chrome driver

		options.addArguments("--start-maximized");

		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		options.setExperimentalOption("prefs", prefs);

		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);

		driver = new ChromeDriver(options);
		//		driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

		driver.get("http://www.gmail.com");


		//	 	driver.manage().window().maximize();


	}

	//Verify user profile information after login

	@Test
	public void verifyProfileInfo() throws IOException, InterruptedException {


		login(userName,password);
		
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
/*
		  driver.get("https://docs.google.com/spreadsheets/d/1rCKXCEDH2TF7jmTvisWtK5FjWx8Q2gES54x"
		    		+ "ylFfiXuo/edit?usp=drive_web");*/
		
		String[] userProfileInfo = getProfileInfo();
		List<String> userData = Arrays.asList(userProfileInfo);
		//Get data from sheet  and verify first profile info of john
		ReadSymbol sheetAPI = new ReadSymbol();
		List<List<Object>> values = sheetAPI.getSpreadSheetRecords(spreadsheetId, range);
		for (List<Object> row : values) {
			if(row.get(0).equals(userName)) {
				Assert.assertEquals(userData, row);
				break;
			}
		}
	}

	public String[] getProfileInfo() {
		//Navigate to Profile page 
		//driver.findElement(By.id("user-profile")).click();
		
		System.out.println("pallavi");
 
		
		wait = new WebDriverWait(driver, 45);
		
  		
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gb_b.gb_dc"))).click();

 		
		wait = new WebDriverWait(driver, 20);
	 

 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Drive')]"))).click();
  

		wait = new WebDriverWait(driver, 45);
		
  		
 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gb_0e"))).click();
 				
 //				visibilityOfElementLocated(By.cssSelector(".gb_0e"))).click();
 		
 		

		wait = new WebDriverWait(driver, 20);
	 

 		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(),'Google Sheets')]"))).click();
 	 	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector
				("input[placeholder='Search Drive']"))).sendKeys("Stock Tickers - Support and Resistance");
 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath
				(".//span[contains(text(),'Stock Tickers - Support and Resistance')]"))).click();
				
		
		String symbol = driver.findElement(By.id("Symbol")).getText();
		String companyNm = driver.findElement(By.id("Company Name")).getText();

		String[] arrayUserInfo = {symbol,companyNm};
		
		return arrayUserInfo;
	}

	
	
	
	public void login(String userName, String password) throws InterruptedException {

 		WebDriverWait wait = new WebDriverWait(driver, 20);


		driver.findElement(By.id("identifierId")).sendKeys(userName);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Next')]"))).click();

		driver.findElement(By.cssSelector("input[aria-label='Enter your password']")).sendKeys(password);
		
		wait = new WebDriverWait(driver, 25);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Next')]"))).click();
	}

	/*@AfterClass
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	 */

}
