package samochody;

import junit.framework.TestCase;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import static org.easymock.classextension.EasyMock.*;

public class KierowcaSamochodTesty {

	Kierowca kierowca;
	Samochod mockSamochod;
	Samochod mockSamochod2;
	Samochod mockSamochod3;
	
	@Before
	public void zainicjujTesty() throws Exception {
		kierowca = new Kierowca(8374,"Ania", "Nowak");
		mockSamochod = createMock(Samochod.class);
		mockSamochod2 = createMock(Samochod.class);
		mockSamochod3 = createMock(Samochod.class);
	}
	
	@Test
	public void testAmortyzacjaSamochodu()
	{
		//zakladamy, ze dodawany samochod ma wartosc 10000 i amortyzacje 10 %
		
		mockSamochod.amortyzuj();
		expect(mockSamochod.getWartosc()).andReturn(9000.0f);
		replay(mockSamochod);
				
		kierowca.dodajSamochod(mockSamochod);
		kierowca.amortyzujSamochody();
		
		assertEquals(mockSamochod.getWartosc(),9000.0f,1);
		verify(mockSamochod);
	}
	
	@Test
	public void testAmortyzacjaSamochodu1()
	{
		//zakladamy, ze dodawany samochod ma wartosc 10000 i amortyzacje 10 %
		
		mockSamochod.amortyzuj();
		//expect(mockSamochod.getWartosc()).andReturn(9000.0f);
		replay(mockSamochod);
				
		kierowca.dodajSamochod(mockSamochod);
		kierowca.amortyzujSamochody();
		
		//assertEquals(mockSamochod.getWartosc(),9000.0f,0.001);
		verify(mockSamochod);
	}
	
	@Test
	public void testAmortyzacjaSamochodow()
	{
		//zakladamy, ze dodawany samochod ma wartosc 10000 i amortyzacje 10 %
		
		mockSamochod.amortyzuj();
		replay(mockSamochod);
		
		mockSamochod2.amortyzuj();
		replay(mockSamochod2);
				
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod2);
		kierowca.amortyzujSamochody();
		
		verify(mockSamochod);
		verify(mockSamochod2);
	}
	@Test
	public void testWyszukajSamochodPierwszy() {
		//mockSamochod.getRejestracja();
		expect(mockSamochod.getRejestracja()).andReturn("TK 56789");
		replay(mockSamochod);
		//expect(mockSamochod2.getRejestracja()).andReturn("TK 67890");
		replay(mockSamochod2);
		replay(mockSamochod3);
		
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod2);
		kierowca.dodajSamochod(mockSamochod3);
		Samochod z =kierowca.znajdzSamochod("TK 56789");
		assertSame(z, mockSamochod);
		
		verify(mockSamochod);
		verify(mockSamochod2);
		verify(mockSamochod3);
	}
	
	@Test
	public void testWyszukajSamochodDrugi() {
		expect(mockSamochod.getRejestracja()).andReturn("TK 56789");
		replay(mockSamochod);
		expect(mockSamochod2.getRejestracja()).andReturn("TK 67890");
		replay(mockSamochod2);
		replay(mockSamochod3);
		
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod2);
		kierowca.dodajSamochod(mockSamochod3);
		Samochod z =kierowca.znajdzSamochod("TK 67890");
		assertSame(z, mockSamochod2);
		
		verify(mockSamochod);
		verify(mockSamochod2);
		verify(mockSamochod3);
	}
	
	@Test
	public void testWyszukajSamochodTrzeci() {
		expect(mockSamochod.getRejestracja()).andReturn("TK 56789");
		replay(mockSamochod);
		expect(mockSamochod2.getRejestracja()).andReturn("TK 67890");
		replay(mockSamochod2);
		expect(mockSamochod3.getRejestracja()).andReturn("TK 67891");
		replay(mockSamochod3);
		
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod2);
		kierowca.dodajSamochod(mockSamochod3);
		Samochod z =kierowca.znajdzSamochod("TK 67891");
		assertSame(z, mockSamochod3);
		
		verify(mockSamochod);
		verify(mockSamochod2);
		verify(mockSamochod3);
	}
	
	@Test
	public void testWyszukajSamochodZaden() {
		expect(mockSamochod.getRejestracja()).andReturn("TK 56789");
		replay(mockSamochod);
		expect(mockSamochod2.getRejestracja()).andReturn("TK 67890");
		replay(mockSamochod2);
		expect(mockSamochod3.getRejestracja()).andReturn("TK 67891");
		replay(mockSamochod3);
		
		kierowca.dodajSamochod(mockSamochod);
		kierowca.dodajSamochod(mockSamochod2);
		kierowca.dodajSamochod(mockSamochod3);
		Samochod z =kierowca.znajdzSamochod("TK 67892");
		assertNull(z);
		
		verify(mockSamochod);
		verify(mockSamochod2);
		verify(mockSamochod3);
	}
	

}
	