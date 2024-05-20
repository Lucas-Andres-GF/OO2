package ar.edu.info.unlp.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class similarityCriterion implements Criterion {
  @Override
  public List<Movie> suggestMovies(Decoder decoderContext) {
    List<Movie> similarMovies = new ArrayList<>();
    for (Movie movie : decoderContext.getMoviesPleyed()) {
      if (similarMovies.contains(movie))
        continue;
      similarMovies.addAll(movie.getSimilarMovies());
    }
    similarMovies.removeAll(decoderContext.getMoviesPleyed());
    similarMovies.sort((m1, m2) -> Integer.compare(m2.getYear(), m1.getYear()));
    return similarMovies.stream().limit(3).toList();
  }
}
