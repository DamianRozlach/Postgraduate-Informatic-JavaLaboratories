package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class ListsAndSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<>();
		String[] names = new String[]{"Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala"};
		for(String name: names) {
			myList.add(name);
		}
		
		System.out.println(myList);
		
		HashSet<String> mySet = new HashSet<>();
		for(int i = 0; i< names.length;i++) {
			mySet.add(names[i]);
		}
		System.out.println(mySet);
		System.out.println(myList.get(2));
		System.out.println(myList.contains("Ola"));
		System.out.println(mySet.contains("Ola"));
		myList.remove("Ela");
		mySet.remove("Ela");
		System.out.println(myList);
		System.out.println(mySet);
	}

}
