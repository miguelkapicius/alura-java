package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        Film myFilm = new Film("O Poderoso Chefão", 1970);
        myFilm.rate(9);

        Film smurfs = new Film("Smurfs 2", 2018);
        smurfs.rate(8);

        Series lost = new Series("Lost", 2000);
        lost.rate(7);

        List<Title> list = new ArrayList<>();
        list.add(myFilm);
        list.add(smurfs);
        list.add(lost);

        for (Title item: list) {
            System.out.println(item.getName());
            if (item instanceof Film film) {
                System.out.println(film.getClassification());
            }
        }

        List<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Adam Sandler");
        searchByArtist.add("John");
        searchByArtist.add("Tom Cruise");
        searchByArtist.add("Miguel");

        Collections.sort(searchByArtist); // ordena as listas
        System.out.println(searchByArtist);

        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getReleaseYear));
        System.out.println(list);
    }
}
