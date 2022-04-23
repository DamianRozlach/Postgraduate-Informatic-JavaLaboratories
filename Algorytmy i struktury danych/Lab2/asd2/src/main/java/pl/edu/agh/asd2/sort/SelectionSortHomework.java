package pl.edu.agh.asd2.sort;

public class SelectionSortHomework {

    public static int[] selectionSort(int[] array) {
        // TODO: implement
        if(array == null)return new int[] {};
        else {
        	int min =0;
        	int val =0;
        	for(int i = 0;i < array.length;i++) {
        		min = i;
        		for(int j = i +1;j < array.length;j++) {
        			if(array[j] < array[min]) {
        				min = j;
        			}
        		}
        		val = array[min];
        		array[min]=array[i];
        		array[i]=val;
        	}
        	return array;
        }
    }
}
