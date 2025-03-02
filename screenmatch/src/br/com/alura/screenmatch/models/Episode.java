package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calcs.Classifiable;

public class Episode implements Classifiable {
    private int number;
    private String name;
    private Series series;
    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if(totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }

    

}
