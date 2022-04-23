package pl.edu.agh.asd3.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MapExercise01 {

    public static Map<String, Integer> countWords(List<String> words) {
        //TODO
    	Map<String, Integer> map = new HashMap<>();
    	for(String s: words) {
    		//s=s.toLowerCase();
    		if(map.containsKey(s)) {
    			map.replace(s, map.get(s)+1);
    		}
    		else {
    			map.put(s, 1);
    		}
    	}
        return map;
    }
}