package pl.edu.agh.asd2.array;

import java.util.Arrays;

public class Array2DExample {

    public static void main(String[] args) {

        // 2D arrays
        // declare new array
        String[][] array2d = new String[3][4];
        System.out.println(String.format("array2d.length: %d", array2d.length));

        array2d = new String[][]{{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(String.format("array2d.length: %d", array2d.length));

        // print
        System.out.println("array2d.toString(): " + array2d.toString());
        System.out.println("Arrays.toString(array2d): " + Arrays.toString(array2d));
        System.out.println("Arrays.deepToString(array2d): " + Arrays.deepToString(array2d));

        // get values
        System.out.println(String.format("array2d[1][1] = %s", array2d[1][1]));

        // iterate over values
        // for each
        for (String[] row : array2d) {
            for (String cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }
}
