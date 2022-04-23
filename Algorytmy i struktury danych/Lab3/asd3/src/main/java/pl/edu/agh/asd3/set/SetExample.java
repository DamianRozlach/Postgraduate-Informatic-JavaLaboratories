package pl.edu.agh.asd3.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// new empty set
		Set<String> set = new HashSet<>();

		// add elements to set
		set.add("John");
		set.add("Mary");
		set.add("Alice");
		set.add("Bob");

		// print set
		System.out.println(set);

		// size of a set (take a look at order)
		System.out.println(set.size());
		
		// add existing element
		set.add("John");
		System.out.println(set);
		
		// cannot get i-th element...
		
		// check if an element exists
		System.out.println(set.contains("Mary"));
		System.out.println(set.contains("Ben"));

		// remove elements
		set.remove("Alice");
		System.out.println(set);
		// remove all elements that contain 'o'
		set.removeIf(el -> el.contains("o")); 
		System.out.println(set);

		// iterate over values
		// but add some elements before
		set.add("John");
		set.add("Mary");
		set.add("Alice");
		set.add("Bob");
		
		// while loop	
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		// for each loop
		for (String e : set) {
			System.out.println(e);
		}
	}
}
