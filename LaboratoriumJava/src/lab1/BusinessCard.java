package lab1;
//Damian Rozlach lab 1 zad1 BusinessCard

import java.util.Scanner;

public class BusinessCard {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in); //stworzenie scannera
		
		System.out.println("Podaj Imie"); //wczytanie danych z konsol
		String name = scanner.nextLine();
		
		System.out.println("Podaj Nazwisko");
		String surname = scanner.nextLine();
		
		System.out.println("Podaj nr tel");
		String phone = scanner.nextLine();
		
		System.out.println("Podaj adres");
		String adress = scanner.nextLine();
		
		String first_line = "* " + name + " " + surname;     // sklejenie danych w Stringi do pierwszej i drugiej lini
		String second_line = "* " + "tel. " + phone + " adres: " + adress;
		int rozmiar2 = second_line.length(); // pomiar rozmiaru Stringow
		int rozmiar1 = first_line.length();
		String gwiazdka = "*" ;
		int dlugosc = 0;
		boolean dluzsze2 = false;  //flaga określająca czy Linia 2 jest dłuższa
		int diff = 0;
		
		if ( rozmiar2 >= rozmiar1){  // instrukcja warunkowa ustalajaca ktora linia jest dluzsza, ustalajaca roznice miedzy liniami
			dlugosc = rozmiar2;      // ustsawiajaca flage oraz doklejajaca gwiazdke na koniec dluzszej lini
			dluzsze2 = true;
			diff = rozmiar2 - rozmiar1;
			second_line = second_line + " *";
		} else {
			dlugosc = rozmiar1;
			diff = rozmiar1 - rozmiar2;
			first_line = first_line + " *";
		}
		
		//System.out.println(gwiazdka.repeat(rozmiar2));
		
		String dod = "";  // inicjalizacja pustego stringa
		
		for(int x=0; x < diff ; x++){ // petla dodajaca znak spacji do stringa dod tyle razy ile wynosi roznica miedzy napisami
			dod = dod + " ";
		}
		
		String gwiazdki = ""; // inicjalizacja pustego stringa
		for(int x=0; x < dlugosc + 2; x++){ //petla tworzaca ciag gwiazdek o odpowiedniej dlugosci
			gwiazdki = gwiazdki + gwiazdka;
		}
		
		if (dluzsze2){ // instrukcja warunkowa przedluzajaca krotszy string w celu zrowniania go z dluzszym
			first_line = first_line + dod + " *";
		} else {
			second_line = second_line + dod + " *";
		}


		
		System.out.println(gwiazdki + '\n' + first_line + '\n' + second_line + '\n' + gwiazdki); // wyprintowanie wizytowki w wierszu poleceń
		scanner.close();
	}
	
}