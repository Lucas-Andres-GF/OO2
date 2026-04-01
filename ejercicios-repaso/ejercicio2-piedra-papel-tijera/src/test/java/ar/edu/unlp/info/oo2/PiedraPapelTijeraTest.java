package ar.edu.unlp.info.oo2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PiedraPapelTijeraTest {
  Jugada piedra;
  Jugada papel;
  Jugada tijera;

  @Before
  public void setUp() {
    piedra = new Piedra();
    papel = new Papel();
    tijera = new Tijera();
  }

  @Test
  public void testPiedraContraPapel() {
    assertEquals("Gana Papel", piedra.jugarContra(papel));
  }

  @Test
  public void testPiedraContraTijera() {
    assertEquals("Gana Piedra", piedra.jugarContra(tijera));
  }

  @Test
  public void testPapelContraPiedra() {
    assertEquals("Gana Papel", papel.jugarContra(piedra));
  }

  @Test
  public void testPapelContraTijera() {
    assertEquals("Gana Tijera", papel.jugarContra(tijera));
  }

  @Test
  public void testTijeraContraPiedra() {
    assertEquals("Gana Piedra", tijera.jugarContra(piedra));
  }

  @Test
  public void testTijeraContraPapel() {
    assertEquals("Gana Tijera", tijera.jugarContra(papel));
  }

  @Test
  public void testPiedraContraPiedra() {
    assertEquals("Hubo Empate", piedra.jugarContra(piedra));
  }

}
