package com.auto.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.cssSelector("[id*='-location'][placeholder='Where']")).sendKeys("P"); // go to 'where' and send 'P'
																								 

		driver.findElement(By.xpath(".//*[@data-cc='FR']/div[contains(text(),'aris, France')]")).click();

		WebElement element = driver.findElement(By.xpath(".//*[@data-cc='FR']/div[contains(text(),'aris, France')]"));
		action.moveToElement(element).perform();

		driver.findElement(By.cssSelector("[id*='-checkIn-input']")).click();

	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath(".//div[contains(@id,'-next') and contains(@class,'nextMonth')]")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);

	 	wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@data-val='1493708400000']/div[(text()='2')]"))).click(); // for
 																														// month
//		driver.findElement(By.xpath(".//div[@data-val='1493708400000']/div[(text()='2')]")).click();																												// of
																														// may

		driver.findElement(By.cssSelector("[id*='-checkOut-input']")).click();

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath(".//div[@data-val='1495004400000']/div[text()='17']"))).click(); // for
																														// month
																														// of
																														// may

		  driver.findElement(By.xpath(".//a[contains(@id,'-roomsGuestsDropdown')]//following::div[contains(text(),'guests')]")).click();// to
 		
	      driver.findElement(By.cssSelector("button[aria-label='Add a room']")).click();
		
		for(int i = 0; i < 3; i++ ) {
			
			driver.findElement(By.cssSelector("button[aria-label='Add a guest']")).click();

		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.cssSelector("span[class='closeText']")).click();
		
		
		Select sel = new Select(driver.findElement(By.cssSelector("select[id*='-star-select']")));
		
		List<WebElement> stars = sel.getOptions();
		 
		for(WebElement s : stars) {
			
			System.out.println("Stars : " + s.getText());
			
		}
	 
		
//		 sel = new Select(driver.findElement(By.cssSelector("select[id*='-star-select']")));

		  sel.selectByValue("4");
		
		 sel = new Select(driver.findElement(By.cssSelector("select[id*='-price-select']")));
		 sel.selectByVisibleText("$100 to $149");
		 
		 sel = new Select(driver.findElement(By.cssSelector("select[id*='-rating-select']")));
		 sel.selectByIndex(1); 

		 
		 driver.findElement(By.xpath(".//div[contains(@class,'searchBtn')]/button[contains(@id,'submit')]")).click();
		 
		 System.out.println("Page title : " + driver.getTitle());

		 return driver.getTitle();
		 
		 

	}

}
