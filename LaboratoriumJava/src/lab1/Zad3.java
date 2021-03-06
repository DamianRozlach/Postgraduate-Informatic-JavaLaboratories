package lab1;
// Damian Rozlach lab1 zad 3
import java.util.Scanner;

public class Zad3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);  //stworzenie scannera do wczytywania zmiennych z konsoli
		System.out.println("Ile ocen bedzie wchodziło w skład sredniej");
		int liczbaOcen = scanner.nextInt(); // ustalenie ilosci ocen z ktorej bedzie liczona srednia
		int[] oceny = new int[liczbaOcen]; //deklaracja tablicy odpowiedniej wielkosci
		
		for(int i=0; i < liczbaOcen; i++) { // petla zczytujaca oceny z konsoli
			System.out.printf("Podaj ocene nr %d z %d \n", i+1, liczbaOcen);		
			oceny[i] = scanner.nextInt();
		}
		
		double srednia = average(oceny); //wywolanie metody liczacej srednia i zapisanie jej w zmiennej
		int najwyzsza = najwyzsza(oceny); // wywolanie metody liczacej najwieksza liczbe i zapisanie jej w zmiennej
		System.out.printf("Srednia ocen wynosi %.2f , najwyzsza ocena %d", srednia, najwyzsza); // wypisanie rezultatow w konsoli
		
		
		scanner.close();
	}
	
	public static double average(int[] marks) { //metoda zwracajaca srednia z podanej tablicy
		int sum=0;
		
		for(int i=0; i<marks.length; i++) {
			sum += marks[i];
		}
		return sum/(double)marks.length;
	}
	
	public static int najwyzsza(int[] marks) { //metoda zwracajaca najwyzsza ocene z podanej tablicy
		int najwyzsza = 0;
		for(int i=0; i<marks.length;i++) {
			if (marks[i] > najwyzsza) {
				najwyzsza = marks[i];
				}
			}
		return najwyzsza;
	}
		
	}


