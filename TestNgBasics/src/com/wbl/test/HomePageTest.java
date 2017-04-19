package com.wbl.test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class HomePageTest {
	
	HomePage hm;
	
	
	@BeforeClass(groups={"smoketest","functionalitytest"}) // either include the groups here or do alwaysRun=true to endure this classruns everytime
	public void beforeClass() {
		hm = new HomePage();
	}

	@Test(groups={"smoketest"})
	public void loginTest() {
		// herer wewillwrite automationcode using webdriver to enter credentials 
		  assertEquals("success",hm.doLogin());
	}

	@Test(groups={"smoketest"})
	public void recordingTest() {
		
		  assertEquals("recording playing",hm.doRecording());
	}
	
	@Test(groups={"functionalitytest"}, dependsOnGroups="smoketest")
	public void presentationTest() {
		
		  assertEquals(20,hm.doPresentation());
	}
	
}
	
