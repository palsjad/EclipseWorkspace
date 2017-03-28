package com.auto.page;

import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class KayakHomePage {

	WebDriver driver;

	public KayakHomePage(WebDriver driver) {

		this.driver = driver;
	}

	public String getKayakHomePage() {
		driver.get("https://www.kayak.com");
		

		return driver.getTitle();
	}

	public String clickHotels() {

		Actions action = new Actions(driver);

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//*********************************** enter the place  ************************************************
		WebDriverWait wait = new WebDriverWait(driver, 40);
	

 		driver.findElement(By.cssSelector("[id*='-location'][placeholder='Where']")).sendKeys("P"); // go to 'where' and send 'P'
	
	 
		
	/*	wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("[id*='-location'][placeholder='Where']"))).sendKeys("P"); // go to 'where' and send 'P'
*/
	//	element.sendKeys("P");
		
 		//	WebElement element = driver.findElement(By.xpath(".//*[@data-cc='FR']/div[contains(text(),'aris, France')]"));
		
  
		  wait.until(ExpectedConditions
				  .elementToBeClickable(By.xpath(".//*[@data-cc='FR']/div[contains(text(),'aris, France')]"))).click();

				  
//				  .visibilityOfElementLocated(By.xpath(".//*[@data-cc='FR']/div[contains(text(),'aris, France')]"))).click();
		
	//	action.moveToElement(element).perform();
		
		

//***********************************  Check in date ************************************************
		
		driver.findElement(By.cssSelector("[id*='-checkIn-input']")).click();
 
		driver.findElement(By.xpath(".//div[contains(@id,'-next') and contains(@class,'nextMonth')]")).click();

	     wait = new WebDriverWait(driver, 40);

	 	WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@data-val='1493708400000']/div[(text()='2')]")));// for
		action.moveToElement(element).perform();
																												 
//		driver.findElement(By.xpath(".//div[@data-val='1493708400000']/div[(text()='2')]")).click();	
		
	 
																														 
//***********************************  Check out date ************************************************
		
		
		driver.findElement(By.cssSelector("[id*='-checkOut-input']")).click();
		
	    wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@data-val='1495004400000']/div[text()='17']"))).click(); // for
																														// month
																														// of
		 																											// may
		
//***********************************  Add rooms and guests  ************************************************
		

		  driver.findElement(By.xpath(".//a[contains(@id,'-roomsGuestsDropdown')]//following::div[contains(text(),'guests')]")).click();// to
 		
	      driver.findElement(By.cssSelector("button[aria-label='Add a room']")).click();
		
		for(int i = 0; i < 3; i++ ) {
			
			driver.findElement(By.cssSelector("button[aria-label='Add a guest']")).click();

		}
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
//*********************************** click on more options  ************************************************
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='closeText']"))).click();
		
		
//***********************************  getting the inner text for stars ************************************** 
		
		
		Select sel = new Select(driver.findElement(By.cssSelector("select[id*='-star-select']")));
		
		List<WebElement> stars = sel.getOptions();
		 
		for(WebElement s : stars) {
			
			System.out.println("Stars : " + s.getText());
			
		}
	 
		
//		 sel = new Select(driver.findElement(By.cssSelector("select[id*='-star-select']")));

		  sel.selectByValue("4");
		  
		 		  
//***********************************  select price  ************************************************
 		
 	 	 Select sel1 = new Select(driver.findElement(By.cssSelector("select[id*='-price-select']")));
 	  
	/*	    wait = new WebDriverWait(driver, 40);
				
 		element =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[id*='-price-select']")));
 		
 
 		System.out.println("element : " + element);
        Select sel1 = new Select(element); */
 	 	 
 // 		element =  wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[id*='-price-select']")));
	 List<WebElement> price = sel1.getAllSelectedOptions();
 		
 	//	List<WebElement> price = sel1.getOptions();
		 
		for(WebElement p : price) {
			
			System.out.println("price : " + p.getText());
			
		}
	 
				
	// 	 sel1.selectByVisibleText("$100 to $149");
	//	 sel1.selectByValue("100.0,149.0");
		 
//*********************************** select rating  *************************************************
		 
		 
		 sel = new Select(driver.findElement(By.cssSelector("select[id*='-rating-select']")));
		 sel.selectByIndex(1); 

 		 driver.findElement(By.xpath(".//div[contains(@class,'searchBtn')]/button[contains(@id,'submit')]")).click();
 		 
		 
		 System.out.println("Page title : " + driver.getTitle());

		 return driver.getTitle();
		 
		 

	}

}
