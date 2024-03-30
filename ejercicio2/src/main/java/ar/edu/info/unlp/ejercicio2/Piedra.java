package ar.edu.info.unlp.ejercicio2;

public class Piedra extends Gesto {

	public Piedra() {
		super("piedra"); 
	}
	
	@Override
	public Gesto juegaContra(Gesto gesto) {
		String gesture = gesto.getName(); 
		switch (gesture) {
			case "tijera":
				return this; 
			case "papel":
				return gesto;
			case "spock": 
				return gesto; 
			case "lagarto": 
				return this; 
			default: 
				return null; 
		}	
	}
	

}
