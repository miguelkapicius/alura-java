package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.exception.ConversionErrorException;
import com.google.gson.annotations.SerializedName;

// A Interface Comparable faz com que possa ser ordenada pela Collections
public class Title implements Comparable<Title> {
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int releaseYear;
    private boolean includedInPlan;
    private double reviewSum;
    private int totalReviews;
    private int durationInMinutes;

    //CONSTRUCTORS
    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();

        if (myTitleOmdb.year().length() > 4) {
            throw new ConversionErrorException("Não consegui converter o ano porque tem mais de 4 caracteres.");
        }
        this.releaseYear = Integer.valueOf(myTitleOmdb.year());
        this.durationInMinutes = Integer.valueOf(myTitleOmdb.runtime().substring(0,2));
    }

    //GETTERS
    public int getTotalReviews() {
        return totalReviews;
    }

    public double getReviewSum() {
        return reviewSum;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    } 

    public void setReleaseYear(int year) {
        this.releaseYear = year;
    }

    public void setDurationInMinutes(int minutes) {
        this.durationInMinutes = minutes;
    }
    
    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setReviewSum(double reviewSum) {
        this.reviewSum = reviewSum;
    }

    //METHODS
    public void displayTechnicalSheet() {
        System.out.println("Título: " + this.name);
        System.out.println("Ano de Lançamento: " + this.releaseYear);
        System.out.println("Avaliação: " + this.reviewSum);
        System.out.println("Total de Avaliações: " + this.totalReviews);
        System.out.println("Disponível no Plano: " + (this.includedInPlan ? "Sim" : "Não"));
        System.out.println("Duração: " + this.durationInMinutes);
    }

    public void rate(double note) {
        this.reviewSum += note;
        this.totalReviews++;
    }

    public double average() {
        return this.reviewSum / this.totalReviews;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }


    // Metodo do Comparable
    @Override
    public int compareTo(Title title) {
        return this.getName().compareTo(title.getName());
    }

    @Override
    public String toString() {
        return "(Name: " + name + ", releaseYear: " + releaseYear + ", duration: " + durationInMinutes + ")";
    }
}
