package com.mobileAuto;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

 
public class App {
	
@Test	
 public void testApp() throws MalformedURLException{
 
   DesiredCapabilities dc = new DesiredCapabilities(); 
   
   String apkFilePath = System.getProperty("user.dir"+"\\resources\\scoop.apk");
   
   dc.setCapability(MobileCapabilityType.VERSION, "5.1.1");
   dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"22"); // not necessary to give if connected to just one device 
   dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
   dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Nexus"); // incase connected to a mobile device get the number from the
   // cmd prompt by doing adb devices at C:\Android\sdk\platform-tools
   
   dc.setCapability(MobileCapabilityType.APP, apkFilePath);

   dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.xoom.android.app"); // we pullthese details from the apk file. Go to the appium 
   // and choose applicationn. In this case zoom.apk and get the package and athe activity details. We can either set these two 
   // here or in the appium tool
   
   dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.xoom.android.app.splash.activity.SplashActivity_");
   
   AppiumDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
   
    
   
		   
// IOSDriver ios = new IOSDriver();		   
   
   
   
 }

 
}