package pl.edu.agh.asd1;

//import java.util.Arrays;

public final class Exercise03GCD {

	public static final int greatestCommonDivisor(int n, int m) {
		// TODO: implement
		if(n<0||m<0) throw new ArithmeticException();
		else if(n == 0) return m;
		else if(m == 0) return n;
		else {
		int granica;
		int grDiv = 0;
		if(n<m) granica = n;
		else granica = m;
		for(int x = 1;x<=granica;x++) {
			if((n % x) == 0 && (m % x) == 0) {
				grDiv = x;
			}
		}
		return grDiv;
		}
	}
}
