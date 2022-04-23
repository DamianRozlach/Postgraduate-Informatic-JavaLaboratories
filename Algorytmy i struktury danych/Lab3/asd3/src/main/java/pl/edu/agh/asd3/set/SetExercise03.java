package pl.edu.agh.asd3.set;

import pl.edu.agh.asd3.utils.TimeMeasure;

import java.util.*;

public class SetExercise03 {

    public static void main(String[] args) {
    	
    	
    	
    	
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        System.out.printf("HashSet:\n\tinsertion: %d\n\tquerying: %d", fillSet(hashSet), querySet(hashSet));
        System.out.printf("TreeSet:\n\tinsertion: %d\n\tquerying: %d", fillSet(treeSet), querySet(treeSet));
        System.out.printf("ArrayList:\n\tinsertion: %d\n\tquerying: %d", fillList(arrayList), queryList(arrayList));
        System.out.printf("LinkedList:\n\tinsertion: %d\n\tquerying: %d", fillList(linkedList), queryList(linkedList));
    }

    private static long fillSet(Set<Integer> set) {
        TimeMeasure measure = new TimeMeasure();
//      TODO
        Random rand = new Random();
        measure.startMeasurement();
        for(int i = 0;i<10000;i++) {
        	set.add(rand.nextInt(10000));
        }
        measure.stopMeasurement();

        return measure.getResult();
    }

    private static long fillList(List<Integer> list) {
        TimeMeasure measure = new TimeMeasure();
//      TODO
        Random rand = new Random();
        measure.startMeasurement();
        for(int i = 0;i<10000;i++) {
        	list.add(rand.nextInt(10000));
        }

        measure.stopMeasurement();

        return measure.getResult();
    }

    private static long querySet(Set<Integer> set) {
        TimeMeasure measure = new TimeMeasure();
//      TODO
        Random rand = new Random();
        measure.startMeasurement();
        
        for(int i = 0;i<10000;i++) {
        	set.contains(rand.nextInt(10000));
        }
        measure.stopMeasurement();

        return measure.getResult();
    }

    private static long queryList(List<Integer> list) {
        TimeMeasure measure = new TimeMeasure();
//      TODO
        Random rand = new Random();
        measure.startMeasurement();
        for(int i = 0;i<10000;i++) {
        	list.contains(rand.nextInt(10000));
        }
        measure.stopMeasurement();

        return measure.getResult();
    }
}
