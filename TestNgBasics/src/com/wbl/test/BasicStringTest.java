package com.wbl.test;

 
import static org.testng.Assert.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//import com.wbl.main.BasicString;

public class BasicStringTest {
	
/*	@Test(invocationCount=10, threadPoolSize=5,invocationTimeOut=500)
	public void runBasic() {
		
		System.out.println("hello world \n");
	}
*/
	
/*	@Test(timeOut=200)
	public void test1(){
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
           System.out.println("the test has timed out\n");;
			e.printStackTrace();
		}
		System.out.println("the timeouttest\n");
	}
	
*/
//	@Test(priority=1)
	
/*	@Test(expectedExceptions={NullPointerException.class})
	public void test2(){

	  BasicString bs = new BasicString();
	  bs.stringBasics(null);  // this will pass as it will throw a null pointer exception which is expects
	  
//	  bs.stringBasics("hello"); //  this will not pass as it will throw a null pointer exception whcih it does not expect

	}
*/	
	
	
	@Parameters({"greet"})
	@Test
	public void test3(String greeting){

	 assertEquals(greeting, "Hello Pallavi");
	 
	 SoftAssert sa = new SoftAssert();
	 
	 sa.assertNotNull(null,"The assertion is not valid");
	 
//	  BasicString bs = new BasicString();
     System.out.println("the parameter string is : "+ greeting);
}

}
	
 
