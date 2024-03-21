package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;

	public Twitter() {
		usuarios = new ArrayList<Usuario>(); 
	}
	
	
	public boolean existeUsuario(String screenName){
		return usuarios.stream().anyMatch(usuario ->usuario.getScreenName().equals(screenName));
	}
	
	public Usuario agregarUsuario(String screenName) {
		if (existeUsuario(screenName.toLowerCase())) {
			return null; 
		}
		Usuario usuario = new Usuario(screenName.toLowerCase()); 
		usuarios.add(usuario); 
		return usuario; 
	}
	
	public boolean eliminarUsuario(Usuario usuario) {
		if (!existeUsuario(usuario.getScreenName()))
			return false; 
		usuario.eliminarPublicaciones();
		return true; 
	}
	
	public String verPublicaciones(Usuario usuario) {
		return usuario.verPublicaciones(); 
	}
	
	public List<Usuario> getUsuarios(){
		return usuarios; 
	}
}
