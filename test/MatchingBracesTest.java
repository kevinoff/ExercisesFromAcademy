package uk.ac.belfastmet.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatchingBracesTest {

	@Test
	public void test1() {

		String test1 = MatchingBraces.balancedBrackets("[()]");

		assertEquals("balanced",test1);

	}

	@Test
	public void test2() {

		String test2 = MatchingBraces.balancedBrackets("{[]}");

		assertEquals("balanced",test2);

	}

	@Test
	public void test3() {

		String test3 = MatchingBraces.balancedBrackets("[]{}()");

		assertEquals("balanced",test3);
	}

	@Test
	public void test4() {

		String test4 = MatchingBraces.balancedBrackets("[)[)");

		assertEquals("not balanced",test4);
	}

	@Test
	public void test5() {

		String test5 = MatchingBraces.balancedBrackets("()]()");

		assertEquals("not balanced",test5);
	}

	@Test
	public void test6() {

		String test6 = MatchingBraces.balancedBrackets("{[}]");

		
		assertEquals("not balanced",test6);
	}

	@Test
	public void test7() {

		String test7 = MatchingBraces.balancedBrackets("{({[]}())}");

		assertEquals("balanced",test7);
	}

	@Test
	public void testTooManyParen() {

		String test7 = MatchingBraces.balancedBrackets("((((((((()");

		assertEquals("not balanced",test7);
	}

	@Test
	public void testTooManySquare() {

		String test7 = MatchingBraces.balancedBrackets("[]]]]]]]]");

		assertEquals("not balanced",test7);
	}

	@Test
	public void testTooManyCurly() {

		String test7 =MatchingBraces.balancedBrackets("{{}}}");

		assertEquals("not balanced",test7);
	}
	
	@Test
	public void testSpaces() {

		String test7 = MatchingBraces.balancedBrackets("{ { }}");		

		assertEquals("balanced",test7);
	}

	@Test
	public void testOpposites() {

		String test7 = MatchingBraces.balancedBrackets(")}{(");

		assertEquals("not balanced",test7);
	}
}
