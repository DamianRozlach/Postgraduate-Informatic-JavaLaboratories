package pl.edu.agh.asd3.stream;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StreamExercise01 {

    public static void main(String[] args) {
        analyzePoem(getPoemRows());
    }


    public static void analyzePoem(List<String> rows) {
        // how many lines
        //TODO
    	System.out.println(rows.stream().count());
        // how many non-empty lines
        //TODO
    	System.out.println(rows.stream().filter(el -> !el.isEmpty()).count());
        // print 5 alphabetically first lines
        //TODO
    	rows.stream().sorted().filter(el -> !el.isEmpty()).limit(5).forEach(System.out::println);
        // print whole rows with lower case
        //TODO
    	rows.stream().filter(el -> !el.isEmpty()).map(el -> el.toLowerCase()).limit(10).forEach(System.out::println);
        // print all rows with Zosia
        //TODO
    	System.out.println();
    	rows.stream().filter(el -> el.contains("Zosia")).forEach(System.out::println);
        // Check how many times exists Litwa and Polska
    	System.out.println(rows.stream().filter(el -> el.contains("Litwa") || el.contains("Polska")).count());
        //TODO
    }

    public static List<String> getPoemRows() {
        String[] rows = new String[]{};
        try (Scanner scanner = new Scanner(
                new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt").openStream(), "UTF-8")
                .useDelimiter("\\A")) {
            String whole = scanner.next();
            rows = whole.split("\\r\\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Arrays.asList(rows);
    }
}
