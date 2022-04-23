package pl.edu.agh.asd1;

import org.junit.Test;

import static org.junit.Assert.*;
import static pl.edu.agh.asd1.Exercise06Pesel.isPesel;

public class Exercise06PeselTest {

	@Test
	public void testPositiveCases() {
		assertTrue(isPesel(85010377816L));
		assertTrue(isPesel(96072276535L));
		assertTrue(isPesel(67012296917L));
		assertTrue(isPesel(90270859479L));
		assertTrue(isPesel(69282992643L));
		assertTrue(isPesel(54321149995L));
	}

	@Test
	public void testNegativeCases() {
		assertFalse(isPesel(55013377816L));
		assertFalse(isPesel(96072276534L));
		assertFalse(isPesel(57012296917L));
		assertFalse(isPesel(90270858479L));
		assertFalse(isPesel(69282993643L));
		assertFalse(isPesel(54332149995L));
	}

}
