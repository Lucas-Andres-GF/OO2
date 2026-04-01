package ar.edu.unlp.info.oo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MasLagartoYSpockTest {
  Jugada piedra;
  Jugada papel;
  Jugada tijera;
  Jugada lagarto;
  Jugada spock;

  @Before
  public void setUp() {
    piedra = new Piedra();
    papel = new Papel();
    tijera = new Tijera();
    lagarto = new Lagarto();
    spock = new Spock();
  }

  @Test
  public void testLagartoContraPiedra() {
    assertEquals("Gana Piedra", lagarto.jugarContra(piedra));
  }

  @Test
  public void testLagartoContraPapel() {
    assertEquals("Gana Lagarto", lagarto.jugarContra(papel));
  }

  @Test
  public void testLagartoContraTijera() {
    assertEquals("Gana Lagarto", lagarto.jugarContra(tijera));
  }

  @Test
  public void testLagartoContraSpock() {
    assertEquals("Gana Lagarto", lagarto.jugarContra(spock));
  }

  @Test
  public void testSpockContraPiedra() {
    assertEquals("Gana Spock", spock.jugarContra(piedra));
  }

  @Test
  public void testSpockContraPapel() {
    assertEquals("Gana Papel", spock.jugarContra(papel));
  }

  @Test
  public void testSpockContraTijera() {
    assertEquals("Gana Spock", spock.jugarContra(tijera));
  }

  @Test
  public void testSpockContraLagarto() {
    assertEquals("Gana Spock", spock.jugarContra(lagarto));
  }

  @Test
  public void testLagartoContraLagarto() {
    assertEquals("Hubo Empate", lagarto.jugarContra(lagarto));
  }

  @Test
  public void testSpockContraSpock() {
    assertEquals("Hubo Empate", spock.jugarContra(spock));
  }

}
