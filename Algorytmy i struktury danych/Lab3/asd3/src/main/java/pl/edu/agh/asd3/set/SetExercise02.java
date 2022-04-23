package pl.edu.agh.asd3.set;
import java.util.HashSet;
import java.util.Set;


public class SetExercise02 {

    public static int countNumberOfUniqueWords(String text) {
        //TODO
    	String sArray[] =splitTextToWords(text);
    	Set<String> set = new HashSet<>();
    	for(String x : sArray ) {
    		x=x.toLowerCase();
    		set.add(x);
    	}
    	
    	set.remove("");
    	
        return set.size();
    }

    public static boolean checkIfNameExists(String text, String name) {
        //TODO
    	String sArray[] =splitTextToWords(text);
    	Set<String> set = new HashSet<>();
    	for(String x : sArray) {
    		set.add(x);
    	}
    	
        return set.contains(name);
    }

    private static String[] splitTextToWords(String text) {
        return text.split("\\W");
    }

}
