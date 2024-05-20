package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class ratingCriterion implements Criterion {
  @Override
  public List<Movie> suggestMovies(Decoder decoderContext) {
    List<Movie> bestRatedMovies = new ArrayList<>(decoderContext.getMovies());
    bestRatedMovies.removeAll(decoderContext.getMoviesPleyed());
    bestRatedMovies.sort((m1, m2) -> Double.compare(m2.getRating(), m1.getRating()));
    return bestRatedMovies.stream().limit(3).toList();
  }
}
