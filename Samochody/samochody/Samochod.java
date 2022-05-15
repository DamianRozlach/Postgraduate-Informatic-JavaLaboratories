package samochody;

import java.io.Serializable;

public class Samochod implements Serializable{
	private String rejestracja;
	private float wartosc;
	private float amortyzacja;
	
	public Samochod(String rejestracja, float wartosc, float amortyzacja)
	{
		this.rejestracja=rejestracja;
		this.wartosc=wartosc;
		this.amortyzacja=amortyzacja;
	}
	
	public String getRejestracja()
	{
		return rejestracja;
	}
	public void amortyzuj()
	{
		this.wartosc-=this.wartosc*this.amortyzacja/100.0;
	}
	public float getWartosc()
	{
		return this.wartosc;
	}
	
}
