package com.wbl.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.main.Calculator;

public class CalculatorTest extends BaseClass{
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class\n");
		
	}
	
	@DataProvider(name="testData")
	public Object[][] getData() {
		Object[][] data = {{2.0,3.0, '+',5.0}, {3.0,0.,'*',0.0},{5.0,2.0,'-',3.0}};
		return data;
		
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class\n");
		
	}
	

	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method\n");
		
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method\n");
		
	}
	
	@Test(dataProvider="testData")
	public void testDoCalc(double a, double b, char c, double expected) {
		Calculator calc = new Calculator();
		double result = calc.doCalc(a, b, c);
	//    assertEquals(expected, result);
		Assert.assertEquals(result, expected);
		
	}

// instead of all the belos individual tests we can have the one parameterized test above which gets its
//	input from the DataProvider getData()	
	
/*
	@Test
	public void doCalc1() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(4.2, 20.0, '+');
     	Assert.assertEquals(24.2, result);
	}

	@Test
	public void doCalc2() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(40.2, 0.0, '*');
     	Assert.assertEquals(0.0, result);
	}
	@Test
	public void doCalc3() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(40.0, 20.0 , '-');
     	Assert.assertEquals(20.0, result);
	}
	
	@Test
	public void doCalc4() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(0.0,  0.0, '%');
     	Assert.assertEquals(0.0, result);
	}

	@Test
	public void doCalc5() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(-40.0, 20.0, '/');
		System.out.println("result : " +result);
     	Assert.assertEquals(-2.0, result);
	}
	

	@Test
	public void doCalc6() {
	   Calculator cal = new Calculator();
		double result = cal.doCalc(40.0,  0.0, '/');
     	Assert.assertEquals(0.0, result);
	}
	
	
*/
	
}


