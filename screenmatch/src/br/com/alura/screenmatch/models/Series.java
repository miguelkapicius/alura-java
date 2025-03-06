package br.com.alura.screenmatch.models;
public class Series extends Title {
    int seasons;
    int episodesPerSeason;
    boolean isActive;
    int minutesPerEpisode;


    //CONSTRUCTOR
    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    // GETTERS
    public int getSeasons() {
        return this.seasons;
    }

    public int getEpisodesPerSeason() {
        return this.episodesPerSeason;
    }

    public boolean getIsActive() {
        return this.isActive;
    }

    public int getMinutesPerEpisode() {
        return this.minutesPerEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return this.seasons * this.episodesPerSeason * this.minutesPerEpisode;
    }

    //SETTERS
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    //METHODS


    @Override
    public String toString() {
        return "Série: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}