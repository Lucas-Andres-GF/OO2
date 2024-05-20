package ar.edu.info.unlp.ejercicio13;

import java.util.List;

/**
 * Criterion
 */
public interface Criterion {
  public abstract List<Movie> suggestMovies(Decoder decoderContext);
}