package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedBracketsExTest {

	@Test
	public void testString1() {
		
		String result = BalancedBracketsEx.balancedBrackets("[()]");
		
		assertEquals("balanced", result);
	}

	@Test
	public void testString2() {
		
		String result = BalancedBracketsEx.balancedBrackets("{[]}");
		
		assertEquals("balanced", result);
	}
	
	@Test
	public void testString3() {
		
		String result = BalancedBracketsEx.balancedBrackets("[]{}()");
		
		assertEquals("balanced", result);
	}
	
	@Test
	public void testString4() {
		
		String result = BalancedBracketsEx.balancedBrackets("[)[)");
		
		assertEquals("not balanced", result);
	}
	
	@Test
	public void testString5() {
		
		String result = BalancedBracketsEx.balancedBrackets("()]()");
		
		assertEquals("not balanced", result);
	}
}
