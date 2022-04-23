package pl.edu.agh.asd3.set;

import static org.junit.Assert.*;
import static pl.edu.agh.asd3.set.SetExercise02.countNumberOfUniqueWords;
import static pl.edu.agh.asd3.set.SetExercise02.checkIfNameExists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.junit.Test;

public class SetExercise02Test {

	@Test
	public void testPanTadeuszWordsCount() throws IOException {
		URL panTadeuszURL = new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt");
		StringBuffer panTadeuszText = new StringBuffer();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(panTadeuszURL.openStream()))) {
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				panTadeuszText.append(inputLine);
		}
		assertEquals(14867, countNumberOfUniqueWords(panTadeuszText.toString()));
	}
	
	@Test
	public void testPanTadeuszNamesExists() throws IOException {
		URL panTadeuszURL = new URL("https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt");
		StringBuffer panTadeuszText = new StringBuffer();
		try (BufferedReader in = new BufferedReader(new InputStreamReader(panTadeuszURL.openStream()))) {
			String inputLine;
			while ((inputLine = in.readLine()) != null)
				panTadeuszText.append(inputLine);
		}
		assertTrue(checkIfNameExists(panTadeuszText.toString(), "Zosia"));
		assertTrue(checkIfNameExists(panTadeuszText.toString(), "Magdalena")); // ;-)
		assertFalse(checkIfNameExists(panTadeuszText.toString(), "Gabriela")); // ;-)
		
	}
	

}
