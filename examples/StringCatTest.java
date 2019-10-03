package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void testConcatenate() {
		
		String result = StringCat.concatenated("hello", "world");
	
		assertEquals("helloworld", result);
	}

}
