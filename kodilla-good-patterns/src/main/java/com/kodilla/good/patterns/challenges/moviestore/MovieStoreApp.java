package com.kodilla.good.patterns.challenges.moviestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreApp {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        movieMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue().stream().collect(Collectors.joining("!"))));

        final String moviesTitles = movieMap.entrySet()
                .stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining("!"));
        System.out.println(moviesTitles);

        final String moviesTitlesPlus = movieMap.entrySet()
                .stream()
                .flatMap(n -> {
                    List<String> movieList = new ArrayList<>();
                    movieList.add(n.getKey());
                    movieList.addAll(n.getValue());
                    return movieList.stream();
                })
                .collect((Collectors.joining("!")));
        System.out.println(moviesTitlesPlus);
    }
}