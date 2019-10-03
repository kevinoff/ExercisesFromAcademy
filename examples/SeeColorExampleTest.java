package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class SeeColorExampleTest {

	SeeColorExample colorEx = new SeeColorExample();
	
	/**
	 * test true at index 0
	 */
	@Test
	public void testSeeColor1() {
		
		String result =  colorEx.seeColor("redxxx");
		
		assertEquals("red", result);
	}
	
	/**
	 * test false, not at index 0 or 1
	 */
	@Test
	public void testSeeColor2() {
		
		String result =  colorEx.seeColor("xxred");
		
		assertEquals("", result);
	}
	
	/**
	 * test true at index 0
	 */
	@Test
	public void testSeeColor3() {
		
		String result =  colorEx.seeColor("blueTimes");
		
		assertEquals("blue", result);
	}
	
}
