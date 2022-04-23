package pl.edu.agh.asd1;

public class Exercise05Multiplicity {
    public static final int multiplicity(int n, int m) {
        // TODO: implement
		if(n <= 0)throw new ArithmeticException();
		//else if(m == 0) return n;
		else {
		int lessDiv = 0;
		int x = m;
		while(true) {
			if((x % n) == 0) {
				lessDiv = x;
				break;
			}
			x++;
		}
		return lessDiv;
		}
    }
}
