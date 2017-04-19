package com.wbl.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeWebDriver {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\EclipseJavaProgs\\WebDriverBasics\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.kayak.com");
		
		System.out.println("Themain page title is : " + driver.getTitle());

		
		
	}

}
