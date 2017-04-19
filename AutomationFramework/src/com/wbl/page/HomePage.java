package com.wbl.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import com.google.common.base.Function;
import com.wbl.helper.ByClass;

public class HomePage {
	
	
WebDriver driver;






/*  this driver is not created yet . so we can create a constructor here

and pass the value for the driver from the HomePageTest when we create the the HomePage object.

this is one way of creating a driver. The best way howeverr is to create a base class and remove the redundancy

*/ 	

public HomePage(WebDriver driver) {
	
	this.driver = driver;
	
	System.out.println("in home page - constructor");

}

 



	public void navigateToHomePage() {
		
/*		driver.get("http://www.walmart.com");
		System.out.println("in home page - navigate to home page");
*/
	}	
	
    public int headerNavLinks(){
		 System.out.println("hp nav links");

			By byLocator = ByClass.getByObject("css-navLocator");
			
			System.out.println("the by locator is :" + byLocator);
			
			System.out.println("the driver is :" + driver);
			
			
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	
//		List<WebElement> elements = driver.findElements(By.cssSelector(navLocator)) ;
    	
 		List<WebElement> elements = driver.findElements(ByClass.getByObject("css-navLocator")) ;

		System.out.println("element size : " + elements.size());
 		return elements.size();
		
	}
	
     public String searchBox() {
    	 
		 System.out.println("hp search box");

    		driver.findElement(ByClass.getByObject("xpath-searchBoxLocator")).sendKeys("hp laptop");
    		
    	 	WebDriverWait expWait = new WebDriverWait(driver, 20);
    	 	
    	  	String result = expWait.until(func);
    	 	
    	  	System.out.println("search page title : " + result);
    			 	
    	 
            return result;
    		
    	}
    	
    	
    	Function<WebDriver, String> func = new Function<WebDriver, String>() {

    		public String apply(WebDriver input) {
    			
    		 	WebDriverWait expWait = new WebDriverWait(driver, 20);
    		 	
           	List<WebElement> element1 = expWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ByClass.getByObject("css-autoSearch")));


    	//		List<WebElement> element1 = driver.findElements(By.cssSelector(".header-Typeahead-row"));
    	  	 
    		 	System.out.println("the elements size : " + element1.size());
    		 	
    			for(WebElement ele : element1){
    				
    				System.out.println("elements :  " + ele.getText());
    				
    		 	if(ele.getText().equalsIgnoreCase("laptops on sale") ) {
    		 		
    		 		ele.click();
    		 		System.out.println("search page title : " +  driver.getTitle());

    		 		break;
    		 		
    		 	}
    				
    				
    		  }	
    			return driver.getTitle();
    			
    		}

     	
    		
    	};
    	
    	
//    	public String clickSignIn() {
    	
    	public LoginPage clickSignIn() {
    		
   		 System.out.println("hp click sign in");
   		 System.out.println("web page in click sign" + driver.getTitle());

   		 
    		WebElement ele = driver.findElement(ByClass.getByObject("xpath-signInAndCreateAccountLocator"));
    		Actions action = new Actions(driver);
    		
    		System.out.println("element in click sign in : " + ele);
    		action.moveToElement(ele).perform();
    		WebDriverWait wait = new WebDriverWait(driver,20);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("link-signInLocator"))).click();
    		
   // 		return driver.getTitle();
    		
    		return new LoginPage(driver);
    		
    		/* 
    		 *  aaa
    		 *  bbb
    		 *  abctest123@gmail.com
    		 *  xyz123
    		 * 
    		 * */
    		
    	}
    	
    	
 //   	public String clickCreateAccount() {
    	
    	public RegisterPage clickCreateAccount() {	
    		
   		 System.out.println("hp create account");

    		WebElement ele = driver.findElement(ByClass.getByObject("xpath-createAccountLocator"));
    		Actions action = new Actions(driver);
    		
    		action.moveToElement(ele).perform();
    		
    		WebDriverWait wait = new WebDriverWait(driver,20);
    		wait.until(ExpectedConditions.visibilityOfElementLocated(ByClass.getByObject("xpath-createAccountLocator"))).click();
 //   		return driver.getTitle();
    		
    		return new RegisterPage(driver);
	 
    		
    	}
    	
    	
}
