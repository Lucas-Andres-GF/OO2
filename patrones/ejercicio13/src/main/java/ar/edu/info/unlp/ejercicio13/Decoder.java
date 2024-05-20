package ar.edu.info.unlp.ejercicio13;

import java.util.List;

public class Decoder {
  private List<Movie> movies;
  private List<Movie> moviesPleyed;
  private Criterion criterion;

  public Decoder(List<Movie> movies, List<Movie> moviesPleyed, Criterion criterion) {
    this.movies = movies;
    this.moviesPleyed = moviesPleyed;
    this.setCriterion(criterion);
  }

  public List<Movie> suggestMovies() {
    return this.criterion.suggestMovies(this);
  }

  public void setCriterion(Criterion criterion) {
    this.criterion = criterion;
  }

  public List<Movie> getMoviesPleyed() {
    return moviesPleyed;
  }

  public List<Movie> getMovies() {
    return movies;
  }

}
