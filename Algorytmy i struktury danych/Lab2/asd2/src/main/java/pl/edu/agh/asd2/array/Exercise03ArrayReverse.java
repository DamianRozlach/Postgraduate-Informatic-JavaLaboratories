package pl.edu.agh.asd2.array;

public class Exercise03ArrayReverse {

    public static String[] reverse(String[] array) {
        // TODO: implement
    	if(array == null) return null;
    	else {
    		for(int i=0;i<array.length/2;i++) {
    			String str = array[i];
    			array[i]=array[array.length-i-1];
    			array[array.length-i-1]=str;
    			
    		}
    		return array;
    	}
    }
}
