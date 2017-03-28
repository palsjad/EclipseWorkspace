package com.auto.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {

	
	WebDriver driver;

	public FlightsPage(WebDriver driver) {

		this.driver = driver;
	}

	  
	
	public void clickFlights() {
		
	WebDriverWait wait = new WebDriverWait(driver, 45);
	
	driver.findElement(By.xpath(".//a[contains(text(),'Flights')]")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//span[contains(text(),'One-way')]"))).click();
	
	
	driver.findElement(By.id("Adwn-origin")).sendKeys("SFO");
	
	driver.findElement(By.xpath("//li[contains(@id,'SFO')]")).click();
	
	
	
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Adwn-destination"))).sendKeys("Paris");
	
	driver.findElement(By.xpath("//li[contains(@id,'CDG')]")).click();
	
		
		
		
	}	
	
	
	
}
