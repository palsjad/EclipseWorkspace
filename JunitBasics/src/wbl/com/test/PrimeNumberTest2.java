package wbl.com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.wbl.main.PrimeNumberExample;



public class PrimeNumberTest2  {
	
	static PrimeNumberExample pme;
	
	@BeforeClass 
	public static void setUpBeforeClass(){
		
		 pme = new PrimeNumberExample(); // previously we had thsi stmt in each method. Now we use thebeforeclass toinitialiseit
		System.out.println("runs once before class \n");
	}
	
//	@ignore
	
	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("runs once after class \n");
	}

	@Before 
	public void setUpMethod(){
		System.out.println("runs before every method\n");
	}
	
	@After
	public void tearDown(){
		System.out.println("runs after every method\n");
	}
	
	@Test
	public void isPrime1Test() {
		
//		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(5);
		
		assertEquals(true,result);
	}
	
	@Test(timeout=200)	//timeout is an attribute for test annotations.soonpurpose we will give threadsleep inthe primenumberexample code	
   public void testIsPrime2() {
		
//		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(10);
		
		assertEquals(false,result);
	}
	
   @Test 
   public void isPrime3Test() {
	
//	PrimeNumberExample pme = new PrimeNumberExample();
	boolean result = pme.isPrime(1);
	
	assertEquals(false,result);
}

}
