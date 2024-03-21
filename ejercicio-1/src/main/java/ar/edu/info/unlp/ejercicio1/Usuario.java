package ar.edu.info.unlp.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private String screenName;
	private List<Publicacion> publicaciones;
	
	
	public Usuario(String screenName){
		this.screenName = screenName;
		this.publicaciones = new ArrayList<Publicacion>();
	}
	
	public Tweet twittear(String texto) {
		if (texto.length() < 1 || texto.length() > 280 )
			return null; 
		Tweet tweet = new Tweet(texto); 
		this.publicaciones.add(tweet); 
		return tweet;
	}
	
	public Retweet reTwittear(Publicacion publicacion) {
		Retweet retweet = new Retweet(publicacion); 
		this.publicaciones.add(retweet); 
		return retweet; 
	}
	
	public String getScreenName() {
		return this.screenName;
	}

	public String verPublicaciones() {
		String result = "Publicaciones: \n"; 
		for (Publicacion publicacion : publicaciones) {
			result += publicacion.getContenido() + "\n-------------------------\n"; 
		}
		return result; 
	}
	
	public void eliminarPublicaciones() {
		publicaciones.forEach(p -> p.eliminarme());
		this.publicaciones.clear();
	}
	
	public int cantidadDePublicaciones() {
		return publicaciones.size(); 
	}
	
}

	
	

