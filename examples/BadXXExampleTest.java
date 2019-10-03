package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * testing return value of BadXXExample.java
 * @author off12066827
 *
 */
public class BadXXExampleTest {

	/**
	 * bad is index 0, should return true
	 */
	@Test
	public void testHasBad1() {
		BadXXExample badXX = new BadXXExample();
		
		Boolean result = badXX.hasBad("badxx");
		
		assertEquals(true, result);
	}
	
	/**
	 * bad is index 1, should return true
	 */
	@Test
	public void testHasBad2() {
		BadXXExample badXX = new BadXXExample();
		
		Boolean result = badXX.hasBad("xbadxx");
		
		assertEquals(true, result);
	}
	
	/**
	 * bad is index 2, should return false
	 */
	@Test
	public void testHasBad3() {
		BadXXExample badXX = new BadXXExample();
		
		Boolean result = badXX.hasBad("xxbadxx");
		
		assertEquals(false, result);
	}

}
