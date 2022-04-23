package pl.edu.agh.asd3.set;

import java.util.Set;
import java.util.HashSet;

public class SetExercise01 {

	public static Set<String> union(Set<String> first, Set<String> second) {
		//TODO
		if(first == null || second == null) {
			throw new IllegalArgumentException();
		}
		Set<String> set = new HashSet<>();
		
		for(String s: first) {
			if(second.contains(s)) {
				set.add(s);
			}
		}
		
		
        return set;
	}
	

}