
//***********************************************************************************************************
// this program runs on the appium. So start the appium servver and start the AVD manager from C:/Android/sdk
//***********************************************************************************************************


package com.mobileAuto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class YelpApp {

//	AndroidDriver<WebElement> driver; 
	
//	AppiumDriver<WebElement> driver;
	
		@Test	
		 public void before() throws MalformedURLException,InterruptedException {
		 
	//	   DesiredCapabilities dc = new DesiredCapabilities(); 
		   
		   String apkFilePath = System.getProperty("user.dir")+"\\resources\\yelp.apk";
		   
		 /*  dc.setCapability(MobileCapabilityType.VERSION, "5.1.1");
		   dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"22"); // not necessary to give if connected to just one device 
		   dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		   dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus");  
*/
// incase connected to a mobile device get the number from the cmd prompt by doing adb devices at C:\Android\sdk\platform-tool
		/*
		 * the above can also be written like this 
	    
		   dc.setCapability("deviceName","Nexus");  
		   dc.setCapability("platformVersion","22"); // not necessary to give if connected to just one device 
		   dc.setCapability("platformName","Android");
		   
 		   */
		   
		   
		   DesiredCapabilities dc = DesiredCapabilities.android();
		   
		 /*  dc.setCapability("appiumVersion", "1.6.4");
		   dc.setCapability("deviceName","Google Nexus 7C Emulator");
		   dc.setCapability("deviceOrientation", "portrait");
		   dc.setCapability("browserName", "");
		   dc.setCapability("platformVersion","4.4");
		   dc.setCapability("platformName","Android");
		   */
		   
		   
		   dc.setCapability(MobileCapabilityType.VERSION, "23");
		   dc.setCapability(MobileCapabilityType.DEVICE_NAME,"nexus6");
		   dc.setCapability(MobileCapabilityType.ORIENTATION, "portrait");
		   dc.setCapability(MobileCapabilityType.BROWSER_NAME, "");
		   dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"6.0");
		   dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		   dc.setCapability(MobileCapabilityType.APP, apkFilePath);

		   dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.yelp.android"); // we pullthese details from the apk file. Go to the appium 
		   // and choose applicationn. In this case zoom.apk and get the package and athe activity details. We can either set these two 
		   // here or in the appium tool
		   
		   dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.yelp.android.ui.activities.RootActivity_");
		   
		   System.out.println("before");
		   
		   AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc); 
		   //you get the above URL from appium. Go to settings in appium on local and get the server address and the port number
		   
		   System.out.println("after");

		   
				   
		// IOSDriver ios = new IOSDriver();		   
/*		   
	 	   
		 }

		
		@Test
		public void testYelpApp() throws InterruptedException {*/

//			driver.unlockDevice();
			
			driver.findElementByXPath("//android.widget.Button[@text='Get Started!']").click();
	        Thread.sleep(3000);
	        driver.findElementByName("First Name").sendKeys("Pallavi");
	        
	        driver.findElementById("com.yelp.android:id/last_name").sendKeys("Jadhav");
	        Thread.sleep(3000);

	        driver.hideKeyboard();
	        Thread.sleep(3000);

	//        driver.lockDevice();
	        driver.removeApp("yelp.apk");
	        driver.closeApp();
	        
		}
	/*	
		
		public void testTouchAction() {
			
			TouchAction action = new TouchAction(driver);
			WebElement ele = driver.findElementByName("First Name");
			action.longPress(driver.findElementByName("First Name"));
			action.tap(ele);
		 	
		}
		 */
		}