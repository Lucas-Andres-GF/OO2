package ar.edu.unlp.info.oo2;

import java.util.List;

public class TweetOriginal implements Tweet {
  private String texto;

  public TweetOriginal(String texto) {
    if (texto.isEmpty() || texto.length() > 280) {
      throw new IllegalArgumentException("El texto del tweet debe tener entre 1 y 280 caracteres.");
    }
    this.texto = texto;
  }

  @Override
  public String getTexto() {
    return texto;
  }

  @Override
  public boolean debeBorrarse(List<Tweet> tweetsAEliminar) {
    return false;
  }
}
