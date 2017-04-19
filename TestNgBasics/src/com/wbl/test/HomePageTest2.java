package com.wbl.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class HomePageTest2 {
	
	HomePage hm;
	
	
	@BeforeClass 
	public void beforeClass() {
		hm = new HomePage();
	}

	@Test
	public void loginTest() {
		// herer wewillwrite automationcode using webdriver to enter credentials 
		  assertEquals("success",hm.doLogin());
	}

	@Test(dependsOnMethods={"loginTest"})  
	public void recordingTest() {
		
		  assertEquals("recording playing",hm.doRecording());
	}
	
	@Test(dependsOnMethods={"loginTest","recordingTest"})  
	public void presentationTest() {
		
		  assertEquals(20,hm.doPresentation());
	}
	
	@Test(dependsOnMethods={"presentationTest"},alwaysRun=true)  
	public void logoutTest() {
		// herer wewillwrite automationcode using webdriver to enter credentials 
		  assertEquals("success",hm.doLogout());
	}

	
}
	
