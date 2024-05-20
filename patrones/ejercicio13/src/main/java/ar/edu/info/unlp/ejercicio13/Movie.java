package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Movie {
  private String title;
  private int year;
  private double rating;
  private List<Movie> similarMovies;

  public Movie(String title, int year, double rating) {
    this.title = title;
    this.year = year;
    this.rating = rating;
    this.similarMovies = new ArrayList<Movie>();
  }

  public void addSimilarMovie(Movie movie) {
    if (this.similarMovies.contains(movie)) {
      return;
    }
    System.out.println("Adding similar movie");
    this.similarMovies.add(movie);
    movie.addSimilarMovie(this);
  }

  public List<Movie> getSimilarMovies() {
    return similarMovies;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  public double getRating() {
    return rating;
  }

}
