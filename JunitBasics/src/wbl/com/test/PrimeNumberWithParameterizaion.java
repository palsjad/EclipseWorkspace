package wbl.com.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wbl.main.PrimeNumberExample;

@RunWith(Parameterized.class)
public class PrimeNumberWithParameterizaion {

	static  PrimeNumberExample pme;    // this is static as its created in the beforeclass ans thatt class is always static...

	int input;
	boolean expectedOutput;


public  PrimeNumberWithParameterizaion(int input, boolean expectedOutput) {
	
	this.input = input;
	this.expectedOutput = expectedOutput;
		
	System.out.println("in constructor\n");	 
	}
	
// step 1 - loads data in moemory
	@Parameters
	public static Collection dataForTest(){
		
		Object[][] testData = {{5,true},{10,false},{1,false},{0,true},{-5,true},{2,true}};
		
		System.out.println(" inside colelctions : \n");
		 return Arrays.asList(testData);
		 
	}
	
	@BeforeClass
	public static void setUpBeforeClass(){
		
		System.out.println("inside before class before new pme\n");
		pme = new PrimeNumberExample();     
		
		System.out.println("inside after class before new pme\n");
	
		
	}
	@Test
	public void isPrime() {
		System.out.println("inside isPrime test \n");

	//  assertEquals(true, pme.isPrime(5));
		  assertEquals(expectedOutput, pme.isPrime(input));
		  
				
	}
	
	
	
	
	
	
	
}
