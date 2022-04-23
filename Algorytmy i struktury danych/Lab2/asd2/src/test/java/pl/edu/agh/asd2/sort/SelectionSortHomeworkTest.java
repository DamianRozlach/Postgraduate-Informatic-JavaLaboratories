package pl.edu.agh.asd2.sort;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortHomeworkTest {

    @Test
    public void testDifferentNumbers() {
        // given
        int[] input = new int[] {6,2,9,1,5};

        // when
        int[] result = SelectionSortHomework.selectionSort(input);

        // then
        assertArrayEquals(new int[] {1,2,5,6,9}, result);

    }

    @Test
    public void testRepeatingNumbers() {
        // given
        int[] input = new int[] {5,2,9,1,5};

        // when
        int[] result = SelectionSortHomework.selectionSort(input);

        // then
        assertArrayEquals(new int[] {1,2,5,5,9}, result);

    }

    @Test
    public void testWorstNumbers() {
        // given
        int[] input = new int[] {9,5,5,2,1};

        // when
        int[] result = SelectionSortHomework.selectionSort(input);

        // then
        assertArrayEquals(new int[] {1,2,5,5,9}, result);

    }

    @Test
    public void testEmpty() {
        // given
        int[] input = new int[] {};

        // when
        int[] result = SelectionSortHomework.selectionSort(input);

        // then
        assertArrayEquals(new int[] {}, result);

    }

}
