package pl.edu.agh.asd1;

public final class Exercise04Fibonacci {
	
	public static final int fibonacci(int n) {
		// TODO: implement
		if (n<0) throw new ArithmeticException();
		else if(n == 0) return 0;
		else if (n == 1 || n == 2) return 1;
		else return (fibonacci(n-1) + fibonacci(n-2));
	}
}
