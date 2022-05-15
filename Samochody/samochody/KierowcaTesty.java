package samochody;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class KierowcaTesty {
	
	Kierowca kierowca;
	
	@Before
	public void inicjujTesty()
	{
		kierowca = new Kierowca(3843, "John", "Doe");
	}
	
	@Test
	public void testDaneKierowcy()
	{
		assertEquals(kierowca.getImieINazwisko(),"John Doe");
	}
	
	@Test
	public void testGetPesel() {
		assertEquals(kierowca.getPesel(),3843);
	}
	

}