package pl.edu.agh.asd2.array;

public class Exercise01ArraySum{

    public static int sum(int[] array) {
        // TODO: implement
    	int sum =0;
    	if(array == null) return 0;
    	for(int e : array) {
    		sum += e;
    	}
        return sum;
    }



}
