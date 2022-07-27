package agh.ii.jtp.fp;

import agh.ii.jtp.fp.dal.ImdbTop250;
import agh.ii.jtp.fp.model.Movie;
import agh.ii.jtp.fp.utils.Utils;

import java.util.*;
import java.util.stream.Collectors;

interface PlayWithMovies {

    /**
     * Returns the movies (only titles) directed (or co-directed) by a given director
     */
    static Set<String> ex01(String director) {

        //throw new RuntimeException("ex01 is not implemented!");
        return ImdbTop250.movies().get().stream().filter(movies -> movies.directors().contains(director))
                .map(Movie::title ).collect(Collectors.toUnmodifiableSet());
    }

    /**
     * Returns the movies (only titles) in which an actor played
     */
    static Set<String> ex02(String actor) {
        return ImdbTop250.movies().get().stream().filter(x -> x.actors().contains(actor))
                .map(Movie::title ).collect(Collectors.toUnmodifiableSet());
        //throw new RuntimeException("ex02 is not implemented!");
    }

    /**
     * Returns the number of movies per director (as a map)
     */
    static Map<String, Long> ex03() {
        List<String> directors = ImdbTop250.movies().get().stream().map(Movie::directors)
                .flatMap(List::stream).toList();
        return directors.stream().distinct().collect(Collectors.toMap(d -> d,l -> directors.stream()
                .filter(s -> s.equals(l)).count()));

        //throw new RuntimeException("ex03 is not implemented!");
    }

    /**
     * Returns the 10 directors with the most films on the list
     */
    static Map<String, Long> ex04() {
        Map<String,Long> dirMap = ex03();
        return dirMap.entrySet().stream().sorted(Comparator.comparingLong(z -> z.getValue()*-1)).limit(10)
                .collect(Collectors.toMap(i -> i.getKey(),j -> j.getValue()));
        //throw new RuntimeException("ex04 is not implemented!");
    }

    /**
     * Returns the movies (only titles) made by each of the 10 directors found in {@link PlayWithMovies#ex04 ex04}
     */
    static Map<String, Set<String>> ex05() {
        return ex04().keySet().stream().collect(Collectors.toMap(z -> z,i -> ex01(i)));
        //throw new RuntimeException("ex05 is not implemented!");
    }

    /**
     * Returns the number of movies per actor (as a map)
     */
    static Map<String, Long> ex06() {
        List<String> actors = ImdbTop250.movies().get().stream().map(Movie::actors)
                .flatMap(List::stream).toList();
        return actors.stream().distinct().collect(Collectors.toMap(d -> d,l -> actors.stream()
                .filter(s -> s.equals(l)).count()));
        //throw new RuntimeException("ex06 is not implemented!");
    }

    /**
     * Returns the 9 actors with the most films on the list
     */
    static Map<String, Long> ex07() {
        Map<String,Long> actMap = ex06();
        return actMap.entrySet().stream().sorted(Comparator.comparingLong(z -> z.getValue()*-1)).limit(9)
                .collect(Collectors.toMap(i -> i.getKey(),j -> j.getValue()));
        //throw new RuntimeException("ex07 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 9 actors from {@link PlayWithMovies#ex07 ex07}
     */
    static Map<String, Set<String>> ex08() {
        return ex07().keySet().stream().collect(Collectors.toMap(z -> z,i -> ex02(i)));
        //throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the 5 most frequent actor partnerships (i.e., appearing together most often)
     */
    static Map<String, Long> ex09() {
        List<String> listOfActors = Utils.orderedPairsFrom(ImdbTop250.movies().get().stream()
                .map(Movie::actors).flatMap(List::stream).distinct().collect(Collectors.toList()));
        return listOfActors.stream().collect(Collectors.toMap(z -> z, k -> ImdbTop250.movies()
                .get().stream().filter(y -> y.actors().containsAll(Arrays.stream(k.split(", ")).toList())).count()))
                .entrySet().stream().sorted(Comparator.comparingLong(z -> z.getValue()*-1)).limit(5)
                .collect(Collectors.toMap(i -> i.getKey(),f -> f.getValue()));

        //throw new RuntimeException("ex08 is not implemented!");
    }

    /**
     * Returns the movies (only titles) of each of the 5 most frequent actor partnerships
     */
    static Map<String, Set<String>> ex10() {
        return ex09().keySet().stream().collect(Collectors.toMap(z -> z, k -> ImdbTop250.movies()
                .get().stream().filter(y -> y.actors().containsAll(Arrays.stream(k.split(", ")).collect(Collectors.toList())))
                .map(Movie::title).distinct().collect(Collectors.toSet())));
        //throw new RuntimeException("ex10 is not implemented!");
    }
}


