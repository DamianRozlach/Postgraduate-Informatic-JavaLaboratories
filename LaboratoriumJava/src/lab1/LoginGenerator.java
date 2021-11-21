package lab1;
//Damian Rozlach lab1 zad 5

public class LoginGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] studentNames = { "Budynek Piotr", 
                 "Chalupa Krystyna", 
                 "Wiezowiec Jan",
                 "Szkieletor Andrzej",
                 "Domek Marianna" };
		 String emailEnd = "@student.agh.edu.pl"; //koncowka emaila
		 String[] studentEmails = new String[studentNames.length]; //tablica do ktorej zostana zapisane wyniki transformacji stringow
		 String[] y;// tablica pomocnicza do przechowania stringow po operacji split
		 for(int i = 0; i< studentNames.length;i++) { //petla wykonujaca sie po wszystkich elementach w tablicy
			 y=studentNames[i].split(" ");//podzielienie Stringa z tablicy na imie i nazwisko i zapisanie w tablicy pomocniczej
			 studentEmails[i] = y[1].substring(0, 3) + y[0].substring(0, 2) + emailEnd; // sklejenie adresu email z pierwszych liter imiona i nazwiska oraz oncowki emaila
			 studentEmails[i]=studentEmails[i].toLowerCase();//zamiana wszystkich liter na male
			 System.out.println(studentEmails[i]);// wypisanie wynikow transformacji
		 }
		 

	}

}
