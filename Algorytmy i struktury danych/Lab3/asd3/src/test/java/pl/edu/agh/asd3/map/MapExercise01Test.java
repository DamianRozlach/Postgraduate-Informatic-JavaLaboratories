package pl.edu.agh.asd3.map;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.junit.Test;

public class MapExercise01Test {

	@Test
	public void testCountWords() {
		// given
		List<String> words = getWords(getPoemRows());

		// when
		Map<String, Integer> result = MapExercise01.countWords(words);

		// then
		assertEquals(34, (int)result.get("Zosia"));
		assertEquals(56, (int)result.get("Telimena"));
		assertEquals(60, (int)result.get("Gerwazy"));
	}

	public static List<String> getPoemRows() {
		String[] rows = new String[] {};
		try (Scanner scanner = new Scanner(
				new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt").openStream(), "UTF-8")
						.useDelimiter("\\A")) {
			String whole = scanner.next();
			rows = whole.split("\\r\\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Arrays.asList(rows);
	}
	
	public static List<String> getWords(List<String> rows) {
		return rows.stream().flatMap(s -> Arrays.stream(s.split("[^\\p{L}0-9]+"))).collect(Collectors.toList());   
	}

	

}
