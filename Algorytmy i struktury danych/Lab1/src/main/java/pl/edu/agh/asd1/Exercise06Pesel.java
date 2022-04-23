package pl.edu.agh.asd1;

public class Exercise06Pesel {
    public static final boolean isPesel(long n) {
        // TODO: implement
    	String pesel =String.valueOf(n);
    	int[] wspol = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
    	
    	if (Integer.valueOf(pesel.substring(2,4)) % 20 <= 12 && Integer.valueOf(pesel.substring(4,6))<= 31) {
    		int wynik = 0;
    		for(int x = 0; x <= 10; x++) {
    			wynik += wspol[x]*Character.getNumericValue(pesel.charAt(x));
    		}
    		return wynik % 10 == 0;
    	}
    	else return false;
    }
}
