package asdTest;

public class MinMaxArray {
	public static void printMinMax(int[] array) {
		int min = array[0];
		int max = array[0];
		for(int x: array) {
			if(x<min)min=x;
			if(x>max)max=x;
		}
		System.out.println("MIN: " + min + " Max: " + max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] example = {1,2,5,13,-4};
		printMinMax(example);

	}

}
