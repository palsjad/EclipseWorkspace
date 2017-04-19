package com.wbl.helper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ByClass {
	static Properties prop;

	public static void loadProperties() {

		try {
			prop = ConfigUtils.loadProperties("locators\\homepage-locators.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("path : " + prop);
	}

	public static By getByObject(String key) { // ceate By object for locator
												// and return the object

		By by = null;

		/*
		 * System.out.println("By Class object key : " + key);
		 * 
		 * boolean f = key.startsWith("css");
		 * 
		 * System.out.println("true or false : " + f);
		 */

		/*
		 * move this to another class of its own
		 * 
		 * try { Properties prop = ConfigUtils.loadProperties(Constants.PATH+
		 * "\\locators\\homepage-locators.properties");
		 * 
		 */

		String value = prop.getProperty(key); // replace prop.getProperty(key)
												// by value below

		if (key.startsWith("css")) {
			return By.cssSelector(value);

		} else if (key.startsWith("xpath")) {
			return By.xpath(value);
		} else if (key.startsWith("link")) {
			return By.linkText(value);
		} else if (key.startsWith("id")) {
			return By.id(value);
		} else if (key.startsWith("partialLink")) {
			return By.partialLinkText(value);
		} else if (key.startsWith("tag")) {
			return By.tagName(value);
		} else if (key.startsWith("class")) {
			return By.className(value);
		} else if (key.startsWith("name")) {
			return By.name(value);
		}

		return by;

	}

}
