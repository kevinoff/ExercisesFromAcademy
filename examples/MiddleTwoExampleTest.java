package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test cases for middle two characters of an even numbered string
 * @author off12066827
 *
 */
public class MiddleTwoExampleTest {

	MiddleTwoExample m2Ex = new MiddleTwoExample();
	
	@Test
	public void testMiddleTwo1() {
		
		String result = m2Ex.middleTwo("string");
		
		assertEquals("ri", result);
	}

}
