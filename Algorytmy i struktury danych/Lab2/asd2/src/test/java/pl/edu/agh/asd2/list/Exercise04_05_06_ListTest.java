package pl.edu.agh.asd2.list;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Exercise04_05_06_ListTest {

    private static final String dataFileName = "src/main/resources/pl/edu/agh/asd2/list/warszawa-ludnosc.csv";
    List<PopulationStat> stats = new LinkedList<>();

    private static List<PopulationStat> readDataFromFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner input = new Scanner(file);

        List<PopulationStat> stats = new LinkedList<>();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] row = splitCsvLine(line);
            // type here what to do with each line of text
            // create list of population stats objects
            stats.add(new PopulationStat(row[0], row[1], row[3] == "kobiety" ? Sex.FEMALE : Sex.MALE, Integer.parseInt(row[4]), Integer.parseInt(row[6])));

        }

        return stats;
    }

    private static String[] splitCsvLine(String line) {
        return line.replace("\"", "").split(";");
    }

    @Before
    public void setUp() throws IOException {
        stats = readDataFromFile(dataFileName);
    }

    @Test
    public void testSummaryNumberOfPeoplePerYear() {
        // given
        int year = 2014;

        // when
        int result = Exercise04_05_06_List.summaryNumberOfPeopleByYear(stats, year);

        // then
        assertEquals(3470884, result);
    }

    @Test
    public void testareaWithBiggestNumberOfPeople() {
        // given
        int year = 2006;

        // when
        String result = Exercise04_05_06_List.areaWithBiggestNumberOfPeople(stats, year);

        // then
        assertEquals("M.st.Warszawa (1)", result);
    }

    @Test
    public void testDiffrenceBetweenYears() {
        // given
        int startYear = 2010;
        int endYear = 2014;
        String unit = "M.st.Warszawa (1)";

        // when
        int result = Exercise04_05_06_List.differenceBetweenYears(stats, unit, startYear, endYear);

        // then
        assertEquals(35330, result);
    }

}
