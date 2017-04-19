package com.wbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.wbl.main.PrimeNumberExample;
 

public class PrimeNumberTest extends BaseClass {

/*	need these methods only in Junit
 * public void setUp(){
		System.out.println("runs before every method\n");
	}
	
	public void tearDown(){
		System.out.println("runs after every method\n");
	}
	
	*/
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class\n");
		
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
	
	
	
@Test	
public void testIsPrime1() {
	
		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(5);
	    assertTrue(result);
	}

@Test	
public void testIsPrime2() {
		
		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(10);
		
	//	 assertEquals(false,result);
		assertFalse(result);
	}

@Test
public void testIsPrime3() {
	
	PrimeNumberExample pme = new PrimeNumberExample();
	boolean result = pme.isPrime(1);
    assertEquals(false,result,"there is an error");
}

}
