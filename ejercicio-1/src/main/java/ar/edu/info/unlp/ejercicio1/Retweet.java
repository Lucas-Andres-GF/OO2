package ar.edu.info.unlp.ejercicio1;

public class Retweet implements Publicacion{
	
	private Publicacion origen;
	
	public Retweet(Publicacion origen) {
		this.origen = origen;
	}
	
	public String getContenido() {
		if (this.origen == null){
			return " La publicacion ya no existe"; 
		}
		return "Retweet -> \n" + this.origen.getContenido() + " " ;
	}
	
	public void eliminarme() {
		this.origen = null; 
	}
	
}
