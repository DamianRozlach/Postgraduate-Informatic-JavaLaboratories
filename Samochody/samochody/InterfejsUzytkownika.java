package samochody;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class InterfejsUzytkownika {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObslugaKierowcow ok=ObslugaKierowcow.getInstance();
		
		ok.dodajKierowce(1, "Jan", "Kowalski");
		ok.dodajKierowce(2, "Maria", "Nowak");
		Kierowca k1=ok.znajdzKierowce(1);
		Kierowca k2=ok.znajdzKierowce(2);
		Samochod s1=new Samochod("KR1345",20000,10);
		Samochod s2=new Samochod("KCH3343",14000,12);
		Samochod s3=new Samochod("SK8849",30000,7);
		Samochod s4=new Samochod("GD8236",71000,12);
		k1.dodajSamochod(s1);
		k1.dodajSamochod(s2);
		k2.dodajSamochod(s3);
		k2.dodajSamochod(s4);
		Samochod kk1=k1.znajdzSamochod("KR1345");
		Samochod kk2=k2.znajdzSamochod("GD8236");

		ok.amortyzujSamochodyKlientow();
		
		ok.wypiszKierowcow();
		
		try {
			FileOutputStream wyjsciowyStrumienPlikowy= new FileOutputStream("samochody.ser"); 
		    ObjectOutputStream wyjsciowyStrumienObiektowy = new ObjectOutputStream(wyjsciowyStrumienPlikowy);  
			wyjsciowyStrumienObiektowy.writeObject(ok);   
			
			ok=null; k1=null; k2=null; kk1=null; kk2=null;
			
			FileInputStream wejsciowyStrumienPlikowy=new FileInputStream("samochody.ser"); 
			ObjectInputStream wejsciowyStrumienObiektowy=new ObjectInputStream(wejsciowyStrumienPlikowy);
			  
			ok=(ObslugaKierowcow) wejsciowyStrumienObiektowy.readObject();
		}
		catch (Exception e)
		{}
		
		int a=1;

	}

}
