package pl.edu.agh.asd1;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.edu.agh.asd1.Exercise07Palindrome.isPalindrome;

public class Exercise07PalindromeTest {

	@Test
	public void testPositiveCases() {
		assertTrue(isPalindrome("kayak"));
		assertTrue(isPalindrome(""));
		assertTrue(isPalindrome("a"));
		assertTrue(isPalindrome("Anna"));
		assertTrue(isPalindrome("noon"));
		assertTrue(isPalindrome("rotator"));
	}

	@Test
	public void testNegativeCases() {
		assertFalse(isPalindrome("tree"));
		assertFalse(isPalindrome("small"));
		assertFalse(isPalindrome("ah"));
		assertFalse(isPalindrome("Tom"));
		assertFalse(isPalindrome("indeed"));
	}

}
