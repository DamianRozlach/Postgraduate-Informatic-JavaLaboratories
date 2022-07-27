package agh.ii.jtp.fp;

import agh.ii.jtp.fp.dal.ImdbTop250;
import agh.ii.jtp.fp.model.Movie;

import java.util.stream.Collectors;

public class Helper {
    public static void main(String[] args) {
        System.out.println("Investigating imdb");
        //System.out.println(ImdbTop250.movies().get().stream().filter(movies -> movies.directors().contains("Quentin Tarantino")).map(Movie::title ).collect(Collectors.toSet()));
    }
}
