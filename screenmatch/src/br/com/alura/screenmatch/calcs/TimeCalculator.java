package br.com.alura.screenmatch.calcs;

// import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    // public void include(Film film) {
    //     totalTime += film.getDurationInMinutes();
    // }

    public void include(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
