package pl.edu.agh.asd3.set;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static pl.edu.agh.asd3.set.SetExercise01.union;

import org.junit.Test;

public class SetExercise01Test {

	@Test
	public void testSetsUnion() {
		// given
		Set<String> first = new HashSet<>(Arrays.asList("a", "b", "c", "d"));
		Set<String> second = new HashSet<>(Arrays.asList("b", "e", "d", "f"));

		// when
		Set<String> result = union(first, second);

		// then
		assertEquals(2, result.size());
		assertTrue(result.contains("b"));
		assertTrue(result.contains("d"));
	}

	@Test
	public void testEmptySetsUnion() {
		// given
		Set<String> first = new HashSet<>();
		Set<String> second = new HashSet<>(Arrays.asList("b", "e", "d", "f"));

		// when
		Set<String> result = union(first, second);

		// then
		assertTrue(result.isEmpty());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNullSetsUnion() {
		// given
		Set<String> first = new HashSet<>();
		Set<String> second = null;

		// when
		union(first, second);

		// then
		// IllegalArgumentException should be thrown
	}

	

}
