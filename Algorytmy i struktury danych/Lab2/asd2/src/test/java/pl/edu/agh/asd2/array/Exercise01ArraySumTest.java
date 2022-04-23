package pl.edu.agh.asd2.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise01ArraySumTest {

    @Test
    public void sumNonEmptyArray() {
        // given
        int[] input = new int[] {4, 5, 1, 0};

        // when
        int result = Exercise01ArraySum.sum(input);

        // then
        assertEquals(10, result);
    }

    @Test
    public void sumNonEmptyArrayWithNegativeValue() {
        // given
        int[] input = new int[] {4, 5, -1, 0};

        // when
        int result = Exercise01ArraySum.sum(input);

        // then
        assertEquals(8, result);
    }


    @Test
    public void sumEmptyArray() {
        // given
        int[] input = new int[] {};

        // when
        int result = Exercise01ArraySum.sum(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void sumNullArray() {
        // given
        int[] input = null;

        // when
        int result = Exercise01ArraySum.sum(input);

        // then
        assertEquals(0, result);
    }
}
