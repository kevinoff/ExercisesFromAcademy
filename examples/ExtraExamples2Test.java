package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test ExtraExamples2, every nth character
 * @author off12066827
 *
 */
public class ExtraExamples2Test {

	ExtraExamples2 exExamples2 = new ExtraExamples2();
	
	/**
	 * test result for every 2nd character in a range
	 */
	@Test
	public void testEveryNthTest1() {
		
		String result = exExamples2.everyNth("Hello", 2);
		
		assertEquals("Hlo", result);
	}
	
	/**
	 * test result for every 2nd character in a longer range
	 */
	@Test
	public void testEveryNthTest2() {
		
		String result = exExamples2.everyNth("abcdefg", 2);
		
		assertEquals("aceg", result);
	}
	
	/**
	 * test result for every 3rd character in a range
	 */
	@Test
	public void testEveryNthTest3() {
		
		String result = exExamples2.everyNth("abcdefgh", 3);
		
		assertEquals("adg", result);
	}
	
	/**
	 * test with space
	 */
	@Test
	public void testEveryNthTest4() {
		
		String result = exExamples2.everyNth("abc defgh", 3);
		
		assertEquals("a f", result);
	}
	
	/**
	 * test with integers
	 */
	@Test
	public void testEveryNthTest5() {
		
		String result = exExamples2.everyNth("1234", 2);
		
		assertEquals("13", result);
	}
	
	/**
	 * test result for every nth character outside of the range
	 */
	@Test
	public void testEveryNthTest6() {
		
		String result = exExamples2.everyNth("1234", 10);
		
		assertEquals("1", result);
	}

}
