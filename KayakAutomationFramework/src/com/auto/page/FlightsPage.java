package com.auto.page;

import java.util.List;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightsPage {

	
	WebDriver driver;

	public FlightsPage(WebDriver driver) {

		this.driver = driver;
	}

	  
	
	public void clickFlights() throws InterruptedException {
		
	WebDriverWait wait = new WebDriverWait(driver, 40);
	
/*Alert alert = driver.switchTo().alert();
	
	alert.dismiss();*/
	
//	driver.findElement(By.xpath(".//a[contains(text(),'Flights')]")).click();
	
	
// **********************************  choose one way travel  *******************************************	
	
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'One-way')]"))).click();
	
//	driver.findElement(By.xpath(".//span[contains(text(),'One-way')]")).click();
	
	
	
/*Alert alert = driver.switchTo().alert();
	
	alert.dismiss();*/
	
	
	
	driver.findElement(By.xpath(".//label[contains(@id,'-oneway-label')]/span")).click();
	
	
//	driver.findElement(By.cssSelector("[id='Adwn-origin']")).sendKeys("CDG");
	

// **********************************  travell origin ***************************************************
	
	
	WebElement element = driver.findElement(By.xpath(".//input[contains(@id,'-origin')]"));
	element.clear();
	element.sendKeys("CDG");
	
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@id,'CDG')]")));
	element.click();
	
// **********************************  destination ***************************************************
	
	element = driver.findElement(By.xpath(".//input[contains(@id,'-destination')][@placeholder='To']"));
	
	
	/*element = driver.findElement(By.xpath(".//input[contains(@id,'-destination')]"));
 	element.click();
 	element.clear();  */
	
	
	//element.click();
	element.clear();
 //	element.sendKeys("S");
 	element.sendKeys("SFO");

 //	element.sendKeys("S");
 	//element.sendKeys("F");
 	//element.sendKeys("O");
	
	
//	Actions action = new Actions(driver);
 	
	element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//li[contains(@id,'SFO')]")));
    element.click();
	
	//San Francisco (SFO)
	
//	action.moveToElement(element).perform();
    
//	driver.findElement(By.xpath(".//li[contains(@id,'SFO')]")).click();

	
 /*   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Adwn-destination"))).sendKeys("Paris");
	
	driver.findElement(By.xpath("//li[contains(@id,'CDG')]")).click();
	*/
    
//    driver.findElement(By.cssSelector("span[id*='travelDates-start']")).click();
//    driver.findElement(By.xpath(".//span[contains(@id,'travelDates-start')][contains(text(),'Depart')]")).click();
    
   /*  wait.until(ExpectedConditions
    		 .visibilityOfElementLocated(By.xpath(".//span[contains(@id,'travelDates-start')][contains(text(),'Depart')]"))).click();*/

 /*   wait.until(ExpectedConditions
   		 .visibilityOfElementLocated(By.xpath(".//span[contains(@id,'travelDates-start')]"))).click();
 */
   // wait = new WebDriverWait(driver, 30);
    
//    Actions action = new Actions(driver);
    driver.findElement(By.xpath(".//*[@id='g0tf-travelDates-start']")).click();
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@title='Next']")));

/* for(int i = 0; i < 2 ; i++ ) {
	 
	 System.out.println("entered for loop : " + i);
	 
	element =  wait.until(ExpectedConditions
			 .visibilityOfElementLocated(By.xpath(".//span[text()='Next']")));
	 
//	 element = driver.findElement(By.xpath(".//span[contains(text(),'Next')]"));
	 
	 driver.findElement(By.xpath(".//a[@class='r9-datepicker-switch-month r9-datepicker-enabled'][@title='Next'][@data-val='1493449200000']")).click();
	
 //	element.click();
	
 //	action.moveToElement(element).build().perform();
	 
	 
//				.visibilityOfElementLocated(By.xpath(".//span[contains(text(),'Next')]"))).click();
 } */
	 
	 wait.until(ExpectedConditions
 				.visibilityOfElementLocated(By.xpath(".//span[@data-val='1495004400000']/span"))).click();
 
//				.visibilityOfElementLocated(By.xpath(".//span[@data-val='1495004400000']/span[text(),'17']"))).click();
 
	 wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector("span[id*='-noneLink']"))).click();

 
//************************************ cabin selection ************************************************
	
 	driver.findElement(By.xpath(".//div[contains(text(),'1 adult, Economy')]"));
 	
 	
 	
	
	Select sel = new Select(driver.findElement(By.xpath(".//select[contains(@id,'-cabinType-select')]")));
 		
	List<WebElement> cabin = sel.getOptions();
	
 
	System.out.println("list size : " + cabin.size() +"   cabin first index : " + cabin.get(0).getText());
	
  	
	for(WebElement c : cabin) {
		 
		System.out.println("Cabin Selection Options : " + c.getText());
	}
	
//	sel.selectByValue("b");  // choose 'Business class'
	
	sel.selectByVisibleText("Business");
//************************************* Number of passengers ********************************************	
	
	
	
	}	
	
	
	
}
