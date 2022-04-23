package pl.edu.agh.asd2.array;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// 1D arrays
		// declare new array
		int[] array = new int[10];
		System.out.println(String.format("array.length: %d", array.length));

		array = new int[] { 1993, 2, 23 };
		System.out.println(String.format("array.length: %d", array.length));

		Arrays.fill(array, 5);

		// print array
		System.out.println("array.toString(): " + array.toString());
		System.out.println("Arrays.toString(array): " + Arrays.toString(array));

		// set values
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		// array[3] = 4; // error

		// get values
		System.out.println(String.format("array[1] = %d", array[1]));
		// int a = array[3]; // error

		// iterate over values
		// while loop
		int i = 0;
		while (i < array.length) {
			System.out.println(array[i]);
			i++;
		}

		// for loop
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

		// for each loop
		for (int e : array) {
			System.out.println(e);
		}
	}

}
