package ar.edu.info.unlp.ejercicio13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class DecoderTest {
	Decoder decoder;
	Movie thor;
	Movie capitanAmerica;
	Movie iron;
	Movie dunkirk;
	Movie rocky;
	Movie rambo;

	@BeforeEach
	void setUp() throws Exception {
		thor = new Movie("Thor", 2007, 7.9);
		capitanAmerica = new Movie("Capitan America", 2016, 7.8);
		iron = new Movie("Iron man", 2010, 7.9);
		dunkirk = new Movie("Dunkirk", 2017, 7.9);
		rocky = new Movie("Rocky", 1976, 8.1);
		rambo = new Movie("Rambo", 1979, 7.8);
		thor.addSimilarMovie(capitanAmerica);
		thor.addSimilarMovie(iron);
		capitanAmerica.addSimilarMovie(iron);
		rocky.addSimilarMovie(rambo);
		decoder = new Decoder(List.of(thor, capitanAmerica, iron, dunkirk, rocky, rambo), List.of(thor, rocky),
				new noveltyCriterion());
	}

	@Test
	public void suggestMoviesForNoveltyTest() {
		for (Movie movie : decoder.suggestMovies()) {
			System.out.println(movie.getTitle() + " " + movie.getYear());
		}
	}

	@Test
	public void suggestMoviesForSimilarityTest() {
		decoder.setCriterion(new similarityCriterion());
		for (Movie movie : decoder.suggestMovies()) {
			System.out.println(movie.getTitle() + " " + movie.getYear());
		}
	}

	@Test
	public void suggestMoviesForRatingTest() {
		decoder.setCriterion(new ratingCriterion());
		for (Movie movie : decoder.suggestMovies()) {
			System.out.println(movie.getTitle() + " " + movie.getYear() + " " + movie.getRating());
		}
	}
}
