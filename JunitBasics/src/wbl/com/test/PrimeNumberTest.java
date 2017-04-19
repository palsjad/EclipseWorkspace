package wbl.com.test;

import com.wbl.main.PrimeNumberExample;

import junit.framework.TestCase;

// this is using junit4

public class PrimeNumberTest extends TestCase {

	public void setUp(){
		System.out.println("runs before every method\n");
	}
	
	public void tearDown(){
		System.out.println("runs after every method\n");
	}
	
	
	public void testIsPrime1() {
		
		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(5);
		
		assertEquals(false,result);
	}
	
public void testIsPrime2() {
		
		PrimeNumberExample pme = new PrimeNumberExample();
		boolean result = pme.isPrime(10);
		
		assertEquals(false,result);
	}
public void testIsPrime3() {
	
	PrimeNumberExample pme = new PrimeNumberExample();
	boolean result = pme.isPrime(1);
	
	assertEquals(false,result);
}

}
