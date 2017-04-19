package com.wbl.main;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.test.BaseClass;

public class CalcCommonMethod extends BaseClass {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class\n");
		
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class\n");
		
	}
	

	
/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method\n");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method\n");
		
	}
	
*/	
	
	@DataProvider(name="TestData")
	public Object[][] getData() {
	 Object[][] data = {{4.2,20.0,'+',24.2},{40.2, 0.0,'*',0.0},{40.0,20.0 , '-',20.0},{0.0, 0.0, '%',0.0},{-40.0, 20.0, '/',-2.0},{40.0,  0.0, '/',0.0}};      
	 return data ;
	}
	
	@Test(dataProvider="TestData")
	public void doCalc(double a,double b, char ch, double expected) {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(a,b,ch);
     	Assert.assertEquals(expected, result);
	}

	
	

}
