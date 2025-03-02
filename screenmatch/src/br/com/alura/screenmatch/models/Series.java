package br.com.alura.screenmatch.models;
public class Series extends Title {
    int seasons;
    int episodesPerSeason;
    boolean isActive;
    int minutesPerEpisode;

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


    

}