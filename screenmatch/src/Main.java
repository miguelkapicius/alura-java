import br.com.alura.screenmatch.calcs.RecomendationFilter;
import br.com.alura.screenmatch.calcs.TimeCalculator;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("O Poderoso Chefão"); 
        myFilm.setReleaseYear(1970);
        myFilm.setDurationInMinutes(180);

        myFilm.rate(9);
        myFilm.rate(4);
        myFilm.rate(10);
        myFilm.displayTechnicalSheet();
        System.out.println(myFilm.average());



        Series lost = new Series();

        lost.setName("Lost");
        lost.setReleaseYear(2000);
        lost.setSeasons(10);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(40);
        lost.displayTechnicalSheet();


        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        System.out.println(calculator.getTotalTime());

        RecomendationFilter filter = new RecomendationFilter();
        filter.filter(myFilm);
    }
}
 