package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calcs.RecomendationFilter;
import br.com.alura.screenmatch.calcs.TimeCalculator;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Filme 1
        Film myFilm = new Film("O Poderoso Chefão", 1970);
        myFilm.setDurationInMinutes(180);
        myFilm.rate(9);
        myFilm.rate(4);
        myFilm.rate(10);
        myFilm.displayTechnicalSheet();
        System.out.println(myFilm.average());

        // Filme 2
        Film smurfs = new Film("Smurfs 2", 2018);
        smurfs.setDurationInMinutes(120);

        // Serie
        Series lost = new Series("Lost", 2000);
        lost.setReleaseYear(2000);
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(40);
        lost.displayTechnicalSheet();

        // Calcula Tempo
        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        System.out.println(calculator.getTotalTime());

        // Fitro
        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myFilm);

        // Array
        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(myFilm);
        filmList.add(smurfs);

        System.out.println("Tamanho da lista: " + filmList.size());
        System.out.println("Primeiro filme: " + filmList.getFirst().getName());
        System.out.println("Primeiro filme: " + filmList.getFirst().toString());
        System.out.println(filmList);


    }
}
 