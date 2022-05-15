package samochody;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class ObslugaKierowcow implements Serializable {
	static ObslugaKierowcow instancja=new ObslugaKierowcow();	
	public static ObslugaKierowcow getInstance() {return instancja;}
	
	ArrayList<Kierowca> klienci;
	
	private ObslugaKierowcow()
	{
		klienci=new ArrayList<Kierowca>();
	}
	
	public Kierowca znajdzKierowce(int pesel)
	{
		for (Iterator<Kierowca> it = klienci.iterator(); it.hasNext (); ) {
		Kierowca k = it.next();
		if(k.getPesel()==pesel)
			return k;
		}
		return null;		
	}
	public void dodajKierowce(int pesel, String imie, String nazwisko)
	{
		Kierowca k=new Kierowca(pesel, imie, nazwisko);
		klienci.add(k);
	}
	public void amortyzujSamochodyKlientow()
	{
		for (Iterator<Kierowca> it = klienci.iterator(); it.hasNext (); ) {
			Kierowca k = it.next();
			k.amortyzujSamochody();
		}
	}
	public void wypiszKierowcow()
	{
		for (Iterator<Kierowca> it = klienci.iterator(); it.hasNext (); ) {
			Kierowca k = it.next();
			System.out.println(k.getImieINazwisko());
		}
	}
	
}
