package pl.edu.agh.asd1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pl.edu.agh.asd1.Exercise05Multiplicity.multiplicity;

public class Exercise05MultiplicityTest {

	@Test
	public void testPositiveCases() {
		assertEquals(3, multiplicity(1, 3));
		assertEquals(124, multiplicity(2, 123));
		assertEquals(0, multiplicity(3, -2));
		assertEquals(15, multiplicity(5, 14));
		assertEquals(10, multiplicity(10, 2));
	}
	
	@Test(expected=Exception.class)
	public void testZero() {
		multiplicity(0, 3);
	}
	
}
