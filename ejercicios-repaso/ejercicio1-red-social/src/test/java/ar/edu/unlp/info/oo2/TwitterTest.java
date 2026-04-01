package ar.edu.unlp.info.oo2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class TwitterTest {

  Twitter twitter;
  Usuario juan;
  Usuario lucas;

  @Before
  public void setUp() {
    twitter = new Twitter();
    juan = twitter.registrarUsuario("juan");
    lucas = twitter.registrarUsuario("lucas");
  }

  @Test
  public void registrarUsuarioYaEnElSistemaTest() {
    assertNull(twitter.registrarUsuario("juan"));
  }

  @Test
  public void eliminarUsuarioTest() {
    twitter.eliminarUsuario("juan");
    assertEquals(1, twitter.getUsuarios().size());
  }

  @Test
  public void twittearTest() {
    Tweet tweet1 = juan.postearTweet("Hola, soy Juan!");
    Tweet tweet2 = lucas.retweetear(tweet1);

    assertEquals("Hola, soy Juan!", tweet1.getTexto());
    assertEquals("Hola, soy Juan!", tweet2.getTexto());

    assertEquals(1, lucas.getTweets().size());

    twitter.eliminarUsuario("juan");

    assertEquals(0, lucas.getTweets().size());
  }

  @Test
  public void reTweetearReTweetTest() {
    Tweet tweet1 = juan.postearTweet("Hola, soy Juan!");
    Tweet reTweet1 = lucas.retweetear(tweet1);
    Tweet reTweet2 = juan.retweetear(reTweet1);

    assertEquals("Hola, soy Juan!", tweet1.getTexto());
    assertEquals("Hola, soy Juan!", reTweet1.getTexto());
    assertEquals("Hola, soy Juan!", reTweet2.getTexto());

    assertEquals(2, juan.getTweets().size());

    twitter.eliminarUsuario("juan");

    assertEquals(0, lucas.getTweets().size());
  }

  @Test
  public void testCrearTweetValido() {
    // Límite inferior (1 caracter)
    TweetOriginal t1 = new TweetOriginal("A");
    assertEquals("A", t1.getTexto());

    // Límite superior (280 caracteres)
    String textoLargo = "a".repeat(280);
    TweetOriginal t2 = new TweetOriginal(textoLargo);
    assertEquals(textoLargo, t2.getTexto());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testCrearTweetVacio() {
    new TweetOriginal("");
  }

  // Prueba que arroje error al exceder el límite
  @Test(expected = IllegalArgumentException.class)
  public void testCrearTweetExcedidoLanzaExcepcion() {
    new TweetOriginal("a".repeat(281));
  }

}
