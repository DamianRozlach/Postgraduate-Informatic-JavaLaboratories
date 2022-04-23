package pl.edu.agh.asd1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static pl.edu.agh.asd1.Exercise09LCM.leastCommonMultiple;

public class Exercise09LCMTest {

	@Test
	public void testCommonNumbers() {
		assertEquals(24, leastCommonMultiple(8, 12));
		assertEquals(6, leastCommonMultiple(2, 6));
	}
	
	@Test
	public void testCoprimeNumbers() {
		assertEquals(156, leastCommonMultiple(12, 13));
		assertEquals(34, leastCommonMultiple(2, 17));
	}

	@Test
	public void testEqualNumbers() {
		assertEquals(1, leastCommonMultiple(1, 1));
		assertEquals(8, leastCommonMultiple(8, 8));
	}
	
	@Test(expected=Exception.class)
	public void testFirstNegativeNumber() {
		leastCommonMultiple(-1, 5);
	}
	
	@Test(expected=Exception.class)
	public void testSecondNegativeNumber() {
		leastCommonMultiple(4, -3);
	}
	
//	@Test(expected=Exception.class)
//	public void testFirstNumberZero() {
//		leastCommonMultiple(0, 4);
//	}
//
//	@Test(expected=Exception.class)
//	public void testSecondNumberZero() {
//		leastCommonMultiple(3, 0);
//	}

}
