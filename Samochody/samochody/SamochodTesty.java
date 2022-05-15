package samochody;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SamochodTesty {
	Samochod testCar1;

	@Before
	public void setUp() throws Exception {
		testCar1 = new Samochod("TK 56370", 20000, 10);
	}


	@Test
	public void testGetRejestracja() {
		assertEquals(testCar1.getRejestracja(), "TK 56370");
	}

	@Test
	public void testAmortyzuj() {
		testCar1.amortyzuj();
		assertEquals(testCar1.getWartosc(), 18000,0.1);
	}

	@Test
	public void testGetWartosc() {
		assertEquals(testCar1.getWartosc(), 20000,0.1);
	}

}
