package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
  private List<Usuario> usuarios;

  public Twitter() {
    this.usuarios = new ArrayList<>();
  }

  public Usuario registrarUsuario(String screenName) {
    if (usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName))) {

      return null;
    }
    Usuario usuario = new Usuario(screenName);
    this.usuarios.add(usuario);
    return usuario;
  }

  public void eliminarUsuario(String screenName) {
    Usuario usuarioAEliminar = usuarios.stream()
        .filter(u -> u.getScreenName().equals(screenName))
        .findFirst()
        .orElse(null);

    if (usuarioAEliminar != null) {
      List<Tweet> tweetsAEliminar = new ArrayList<>(usuarioAEliminar.getTweets());
      usuarios.remove(usuarioAEliminar);
      usuarios.forEach(u -> u.limpiarTweets(tweetsAEliminar));
    }
  }

  public List<Usuario> getUsuarios() {
    return usuarios;
  }
}
