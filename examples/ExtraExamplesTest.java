package uk.ac.belfastmet.examples;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * test cases for IcyHot method
 * @author off12066827
 *
 */
public class ExtraExamplesTest {

	ExtraExamples exExamples = new ExtraExamples();
	
	/**
	 * test true result
	 */
	@Test
	public void testIcyHotTest1() {
				
		boolean boolReturn = exExamples.icyHot(-1, 120);
		
		assertEquals(true, boolReturn);		
	}
	
	/***
	 * test true result 
	 */
	@Test
	public void testIcyHotTest2() {

		boolean boolReturn1 = exExamples.icyHot(120, -1);

		assertEquals(true, boolReturn1);		
	}
	
	/**
	 * test false result
	 */
	@Test
	public void testIcyHotTest3() {
		
		boolean boolReturn2 = exExamples.icyHot(2, 120);

		assertEquals(false, boolReturn2);
	}

}
