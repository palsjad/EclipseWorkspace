package com.wbl.MultiThreading;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class WalmartExample {



	@Test
	public void firefoxBrowser(){


		System.setProperty("webdriver.gecko.driver", "C:\\QA\\EclipseWorkspace\\MultiThreading\\resources\\newGeckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		
		options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); //This is the location where you have installed Firefox on your machine

		FirefoxDriver driver = new FirefoxDriver(options);



		// open the browser

		driver.get("http://www.walmart.com");

		System.out.println("Thread # : " + Thread.currentThread().getId() +  " --- Title on the firefoxDriver is : " + driver.getTitle());
				


	/*	driver.findElement(By.id("global-search-input")).sendKeys("laptop");




		driver.findElement(By.cssSelector("button[class='header-GlobalSearch-submit btn']")).click();

		System.out.println("the thread is id " + Thread.currentThread().getId() );

		System.out.println("333333333");


		System.out.println("The  page title at the end is : " + driver.getTitle());

*/
		driver.close();


		// perform assertion 




	}


	@Test
	public void chromeBrowser(){



		System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseWorkspace\\MultiThreading\\resources\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		// open the browser

		driver.get("http://www.walmart.com");

		System.out.println("Thread # : " + Thread.currentThread().getId() +  " --- Title on the chromeDriver is : " + driver.getTitle());

/*
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");

 
		driver.findElement(By.cssSelector("button[class*='header-GlobalSearch-submit']")).click();


		System.out.println("the thread is id " + Thread.currentThread().getId() );


		System.out.println("The  page title at the end is : " + driver.getTitle());

*/
		driver.close();


		// perform assertion 




	}


     @Test
	 public void IETest(){


			// set driver path

		System.setProperty("webdriver.ie.driver", "C:\\QA\\EclipseWorkspace\\MultiThreading\\resources\\IEDriverServer.exe");

		 
 		 
		// Initialise browser
		 
		WebDriver driver=new InternetExplorerDriver();
 

		 

		// open the browser

		driver.get("http://www.walmart.com");

		System.out.println("Thread # : " + Thread.currentThread().getId() +  " --- Title on the IEDriver is : " + driver.getTitle());

/*
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");

 
		driver.findElement(By.cssSelector("button[class*='header-GlobalSearch-submit']")).click();


		System.out.println("the thread is id " + Thread.currentThread().getId() );


		System.out.println("The  page title at the end is : " + driver.getTitle());
*/

		driver.quit();


		// perform assertion 




	}

}
