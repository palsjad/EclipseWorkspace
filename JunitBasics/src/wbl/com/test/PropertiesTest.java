package wbl.com.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.wbl.main.ReadProperties;

import static org.junit.Assert.*;

public class PropertiesTest {
	
	@Test(expected=IOException.class)
	public void getCityTest() throws IOException, FileNotFoundException {
		
		ReadProperties rp = new ReadProperties();
		rp.propertiesExample("prop1"); //trying herewith wrong filename
		
//		 assertEquals("fremont",rp.propertiesExample("prop1")); // give a wrong file name to throw the ioexception
		
		

}

	
}