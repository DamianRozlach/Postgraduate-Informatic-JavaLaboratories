package pl.edu.agh.asd2.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise02ArrayAverageTest {

    @Test
    public void avarageNonEmptyArray() {
        // given
        int[] input = new int[] {4, 5, 1, 0};

        // when
        double result = Exercise02ArrayAverage.avarage(input);

        // then
        assertEquals(2.5, result, 0.01);
    }

    @Test
    public void avarageNonEmptyArrayWithNegativeValue() {
        // given
        int[] input = new int[] {4, 5, -1, 0};

        // when
        double result = Exercise02ArrayAverage.avarage(input);

        // then
        assertEquals(2, result, 0.01);
    }


    @Test
    public void avarageEmptyArray() {
        // given
        int[] input = new int[] {};

        // when
        double result = Exercise02ArrayAverage.avarage(input);

        // then
        assertEquals(0.0, result, 0.01);
    }

    @Test
    public void avarageNullArray() {
        // given
        int[] input = null;

        // when
        double result = Exercise02ArrayAverage.avarage(input);

        // then
        assertEquals(0.0, result, 0.01);
    }
}
