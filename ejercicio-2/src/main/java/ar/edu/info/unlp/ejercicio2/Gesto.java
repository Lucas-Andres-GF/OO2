package ar.edu.info.unlp.ejercicio2;

public abstract class Gesto {
	
	private String name; 
	
	public Gesto(String name) {
		this.name = name; 
	}
	
	public abstract Gesto juegaContra(Gesto gesto); 
	
	public String getName() {
		return this.name; 		
	}	
	
	@Override
	public String toString() {
		return "Gano " + getName(); 
	}

}
