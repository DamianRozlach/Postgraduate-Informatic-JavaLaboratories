package pl.edu.agh.asd3.stream;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

    public static void streamExample() {
        // create immutable list
        List<String> list = Arrays.asList("John", "Mary", "Alice", "Bob", "Ben");

        // terminals

        // print all data
        list.stream().forEach(System.out::println); // consumer with side-effect

        // concatenate elements
        Optional<String> res = list.stream().reduce((s1, s2) -> s1.concat(s2));
        System.out.println(res.orElse("empty"));

        // process list's elements
        list.stream().map(el -> el.toUpperCase()).forEach(System.out::println);

        // process some of the elements
        list.stream().filter(el -> el.startsWith("A")).forEach(System.out::println);

        // sort elements
        list.stream().sorted().forEach(System.out::println);

        // combinations of above functions
        list.stream().map(el -> el.substring(0, 1)).sorted().distinct().forEach(System.out::println);
    }

}
