package ar.edu.info.unlp.ejercicio1;

public class Tweet implements Publicacion {
	
	private String texto;
	
	public Tweet(String texto) {
		this.texto = texto;
	}	
	
	public String getContenido() {
		if (this.texto == null) 
			return " La publicacion ya no existe"; 
		return "Tweet -> \n " + this.texto;
	}
	
	public void eliminarme() {
		this.texto = null; 
	}
		
}
