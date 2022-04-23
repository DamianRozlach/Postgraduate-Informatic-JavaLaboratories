package pl.edu.agh.asd1;

import static org.junit.Assert.*;
import static pl.edu.agh.asd1.Exercise02Factorial.factorial;

import org.junit.Test;

public class Exercise02FactorialTest {

	@Test
	public void testZero() {
		assertEquals(1, factorial(0));
	}

	@Test
	public void testCorrectNumbers() {
		assertEquals(1, factorial(1));
		assertEquals(6, factorial(3));
		assertEquals(120, factorial(5));
		assertEquals(362880, factorial(9));
	}

	@Test(expected = Exception.class)
	public void testNegativeNumber() {
		factorial(-1);
	}

}
