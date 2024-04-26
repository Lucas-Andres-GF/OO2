package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class noveltyCriterion implements Criterion {
  @Override
  public List<Movie> suggestMovies(Decoder decoderContext) {
    List<Movie> unplayedMovies = new ArrayList<>(decoderContext.getMovies());
    unplayedMovies.removeAll(decoderContext.getMoviesPleyed());
    unplayedMovies.sort((m1, m2) -> Integer.compare(m2.getYear(), m1.getYear()));
    return unplayedMovies.stream().limit(3).toList();
  }
}
