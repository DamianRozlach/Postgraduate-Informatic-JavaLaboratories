package pl.edu.agh.asd2.array;

public class Exercise02ArrayAverage {

    public static double avarage(int[] array) {
        // TODO: implement
    	int sum =0;
    	if(array == null || array.length == 0) return 0;
    	for(int e : array) {
    		sum += e;
    	}
    	float avg = (float)sum/(float)array.length;
        return avg;
    }
}
