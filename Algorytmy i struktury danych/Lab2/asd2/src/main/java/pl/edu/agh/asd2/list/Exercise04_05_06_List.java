package pl.edu.agh.asd2.list;

import java.util.List;

enum Sex {
    MALE, FEMALE
}

/**
 * Napisz metody, ktore zwróci: 1. Sumaryczna liczba mieszkancow w
 * wybranym roku 2. Najliczniejsza jednostka w roku  3. Roznice w populacji (ile
 * przybylo lub ubylo mieszkancow) pomiedzy określonymi latami
 */
public class Exercise04_05_06_List {


    public static int summaryNumberOfPeopleByYear(List<PopulationStat> stats, int year) {
        // TODO
    	int summNumm = 0;
    	for(PopulationStat p : stats) {
    		if(p.year == year) summNumm += p.populationSize;
    	}
        return summNumm;

    }

    public static String areaWithBiggestNumberOfPeople(List<PopulationStat> stats, int year) {
        // TODO
    	int max = 0;
    	String area = new String();
    	for(PopulationStat p : stats) {
    		if(p.year == year) {
    			if(p.populationSize > max) {
    				max = p.populationSize;
    				area = p.unit;
    			}
    		}
    	}
        return area;

    }


    public static int differenceBetweenYears(List<PopulationStat> stats, String unit, int startYear, int endYear) {
        // TODO
    	int sumY1 = 0;
    	int sumY2 = 0;
    	for(PopulationStat p : stats) {
    		if(p.year == startYear && p.unit.equals(unit)) {
    			sumY1 += p.populationSize;
    		}
    		if(p.year == endYear && p.unit.equals(unit)) {
    			sumY2 += p.populationSize;
    		}
    	}
    	
        return sumY2 - sumY1;
    }


}

class PopulationStat {

    String code;
    String unit;
    Sex sex;
    int year;
    int populationSize;

    PopulationStat(String code, String unit, Sex sex, int year, int populationSize) {
        this.code = code;
        this.unit = unit;
        this.sex = sex;
        this.year = year;
        this.populationSize = populationSize;
    }

}