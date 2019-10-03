package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * class testing concatenation of two Strings parameters
 * @author off12066827
 *
 */
public class ConcatenateTest {

	Concatenate con = new Concatenate();
	
	/**
	 * test if two strings concatenate
	 */
	@Test
	public void testConcatString() {
		
		String result = con.concatString("hello", "world");
		
		assertEquals("helloworld", result);
	}
	
	/**
	 * test if two strings concatenate
	 */
	@Test
	public void testConcatString2() {
		
		String result = con.concatString("hey", "ho");
		
		assertEquals("heyho", result);
	}
	
	/**
	 * test if two strings concatenate
	 */
	@Test
	public void testConcatString3() {
		
		String result = con.concatString("1", "2");
		
		assertEquals("12", result);
		
	}

}
