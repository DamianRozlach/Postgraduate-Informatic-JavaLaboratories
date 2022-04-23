package pl.edu.agh.asd1;

public final class Exercise09LCM {

	public static final int leastCommonMultiple(int n, int m) {
		// TODO: implement
		if(n<0 || m<0) {
			throw new ArithmeticException();
		}
		int NWW = n*m;
		for(int i = 1; i<=n*m;i++) {
			
			if(n % i == 0 && m % i ==0)
				NWW = n*m/i;
		}
		return NWW;
	}
}
