package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test cases for IsPalindrome
 * @author off12066827
 *
 */
public class IsPalindromeTest {

	IsPalindrome isP = new IsPalindrome();
	
	/**
	 * test true result with even number of characters
	 */
	@Test
	public void testIsPalindrome1() {
		
		boolean result = isP.isPalindrome("hannah");
		
		assertEquals(true, result);
	}
	
	/**
	 * test true result with odd number of characters
	 */
	@Test
	public void testIsPalindrome2() {
		
		boolean result = isP.isPalindrome("hanah");
		
		assertEquals(true, result);
	}
	
	/**
	 * test false result
	 */
		@Test
	public void testIsPalindrome3() {
		
		boolean result = isP.isPalindrome("kevin");
		
		assertEquals(false, result);
	}

}
