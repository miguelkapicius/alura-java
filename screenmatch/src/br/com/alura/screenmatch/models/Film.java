package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calcs.Classifiable;

public class Film extends Title implements Classifiable {
   String director;

   // CONSTRUCTOR
   public Film(String name, int releaseYear) {
      super(name, releaseYear);
   }


   public String getDirector() {
    return this.director;
   }

   public void setDirector(String director){
    this.director = director;
   }

   @Override
   public int getClassification() {
      return (int) average() / 2;
   }

   @Override
   public String toString() {
      return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
   }
}
