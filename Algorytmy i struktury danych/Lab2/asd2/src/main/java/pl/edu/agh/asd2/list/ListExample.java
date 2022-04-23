package pl.edu.agh.asd2.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
	public static void main(String[] args) {

		// new empty list
		List<String> list = new LinkedList<>();

		// returns unmodifiable list
		list = Arrays.asList(new String[] { "John", "Mary", "Alice", "Bob" });
		list = Arrays.asList("John", "Mary", "Alice", "Bob");

		// print list
		System.out.println(list);

		// size of a list
		System.out.println(list.size());

		// get values
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// System.out.println(list.get(4)); // error

		// check if object exists
		System.out.println(list.indexOf("Alice"));
		System.out.println(list.indexOf("Alison"));

		// add values
		list = new LinkedList<>();
		list.add("John");
		list.add("Mary");
		list.add(0, "Alice");
		list.add(0, "Bob");
		System.out.println(list);

		// add multiple elements
		list.addAll(Arrays.asList("Ben", "Jimmy"));
		System.out.println(list);

		// remove elements
		list.remove("Jimmy");
		System.out.println(list);
		// remove all elements that start with B
		list.removeIf(el -> el.startsWith("B")); // removes Ben & Bob
		System.out.println(list);

		list.remove(0);
		System.out.println(list);

		// iterate over values
		// while loop
		int i = 0;
		while (i < list.size()) {
			System.out.println(list.get(i));
			i++;
		}

		// for loop
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
		}

		// for each loop
		for (String e : list) {
			System.out.println(e);
		}

	}
}
