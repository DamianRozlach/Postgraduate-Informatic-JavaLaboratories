package pl.edu.agh.asd1;

public final class Exercise02Factorial {

	public static final int factorial(int x) {
		// TODO: implement
		int wynik = 1;
		if(x>0) {
			for(int z = 1; z <= x;z++) {
				wynik = wynik* z;
			}
			return wynik;
		} else if(x==0) {
			return wynik;
		} else {
			throw new ArithmeticException();
		}
		
	}
	
}
