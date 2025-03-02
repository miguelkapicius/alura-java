package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInPlan;
    private double reviewSum;
    private int totalReviews;
    private int durationInMinutes;

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



}
