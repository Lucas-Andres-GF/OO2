package ar.edu.unlp.info.oo2;

import java.util.List;

public interface Tweet {
  String getTexto();

  boolean debeBorrarse(List<Tweet> tweetsAEliminar);
}