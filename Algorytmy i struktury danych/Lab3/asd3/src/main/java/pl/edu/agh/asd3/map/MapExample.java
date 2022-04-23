package pl.edu.agh.asd3.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		// new empty map
		Map<String, String> map = new HashMap<>();

		// add key-value pairs
		map.put("John", "600-100-000");
		map.put("Mary", "500-000-123");
		map.put("Alice", "504-323-234");
		map.put("Bob", "789-435-345");

		// print set (take a look at order)
		System.out.println(map);

		// size of a map
		System.out.println(map.size());

		// get value for a given key
		System.out.println(map.get("John"));

		// get all keys as set
		System.out.println(map.keySet());

		// get all values as set
		System.out.println(map.values());

		// check if a key exists
		System.out.println(map.containsKey("Mary"));
		System.out.println(map.containsKey("Ben"));

		// check if a value exists
		System.out.println(map.containsValue("500-000-123"));
		System.out.println(map.containsKey("no number"));

		// update value for existing key
		map.replace("John", "no number");
		System.out.println(map);
		map.replace("Ben", "no number"); // no update
		System.out.println(map);

		// remove elements
		map.remove("Alice");
		System.out.println(map);

		// iterate over keys
		// for each loop
		for (String e : map.keySet()) {
			System.out.println(String.format("Key: %s, value: %s", e, map.get(e)));
		}
	}
}
