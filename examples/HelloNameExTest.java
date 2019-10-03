package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloNameExTest {

	@Test
	public void testHelloName1() {
		
		String result = HelloNameEx.helloName("Bob");
		
		assertEquals("Hello Bob!", result);
	}
	
	@Test
	public void testHelloName2() {
		
		String result = HelloNameEx.helloName("Kevin");
		
		assertEquals("Hello Kevin!", result);
	}

}
