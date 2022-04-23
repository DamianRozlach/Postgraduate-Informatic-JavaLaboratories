package pl.edu.agh.asd2.array;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;

public class Exercise03ArrayReverseTest {

    @Test
    public void testReverseNonEmptyArray() {
        // given
        String[] input = new String[] {"Litwo", "ojczyzno", "moja", "ty", "jesteś", "jak", "zdrowie"};

        // when
        String[] result = Exercise03ArrayReverse.reverse(input);

        // then
        assertArrayEquals(new String[] {"zdrowie", "jak", "jesteś", "ty", "moja", "ojczyzno", "Litwo"}, result);
    }

    @Test
    public void testReverseEmptyArray() {
        // given
        String[] input = new String[] {};

        // when
        String[] result = Exercise03ArrayReverse.reverse(input);

        // then
        assertArrayEquals(new String[] {}, result);
    }


    @Test
    public void testReverseNullArray() {
        // given
        String[] input = null;

        // when
        String[] result = Exercise03ArrayReverse.reverse(input);

        // then
        assertNull(result);
    }
}
