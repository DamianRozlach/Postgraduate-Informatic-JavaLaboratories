package lab1;
// Damian Rozlach lab1 zad 4
import java.util.Scanner;
import java.util.Arrays;

public class Zad4Dividers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zmienna = readNumber(); //wywolanie funkcji ktora zczyta wartosc z konsoli do zmiennej
		printDividers(findDividers(zmienna),zmienna); //wywolanie funkcji do printowania podzielnikow i jako argument funkcji wyznaczajacej podzielniki

	}
	public static int readNumber() {
		Scanner scanner = new Scanner(System.in); //zainicjowanie scannera
		System.out.println("Podaj liczbe ktorej dzielniki ma wypisac program"); //wypisanie komunikatu
		int liczba = scanner.nextInt(); //wczytanie liczby z konsoli
		scanner.close();// zamkniecie scannera
		return liczba; // zwrocenie liczby
	}
	
	public static boolean checkDivider(int dzielna, int dzielnik) {
		int reszta = dzielna % dzielnik; //wyznaczenie reszty z dzielenia
		if(reszta == 0) return true; //jesli reszt rowna zero zwrocenie true
		else return false; //w kazdej innej sytuacji zwrocenie false
	}
	
	public static int[] findDividers(int liczba) {
		int[] dividers = new int[liczba/2 +1]; //zainicjowanie tabeli o maksymalnej mozliwej wielkosci dla liczby
		int counter = 0; // zmienna sluzaca do wpisywania podzielnikow oraz do wyznaczenia ilosci podzielnikow
		int x = 1; // aktualnie sprawdzany podzielnik
		while(x*x<liczba) { //petla sprawdzajaca podzielniki za pomoca wczesciej zdeklarowanej funkcji i wpisujaca je do tabeli
			if(checkDivider(liczba,x)) { //algorytm sprawdzania podzielnikow zaczerpniety z wykladu z Podstaw Informatyki
				dividers[counter]=x;
				counter++;
				dividers[counter]=liczba/x;
				counter++;
			}
			x++;
		}
		if(x*x == liczba) {
			dividers[counter] = x;
			counter++;
		}
		
		return Arrays.copyOf(dividers,counter); //zmniejszenie rozmiaru tabeli by pozbyc sie zbednych zer
		
	}
	
	public static void printDividers(int[] dividers,int liczba) { //funkcja wypisujaca podzielniki
		Arrays.sort(dividers); // posortowania podzielnikow rosnaco
		System.out.printf("Dzielniki liczby %d: \n",liczba); //wypisanie liczby dla kt??rej wypisujemy podzielniki
		for(int i=0;i<dividers.length;i++){ //petla wypisujaca podzielniki
			System.out.printf("%d ", dividers[i]);
		}
	}

}
