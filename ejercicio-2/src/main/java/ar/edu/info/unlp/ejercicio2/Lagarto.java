package ar.edu.info.unlp.ejercicio2;

public class Lagarto extends Gesto {

	public Lagarto() {
		super("lagarto"); 
	}
	
	@Override
	public Gesto juegaContra(Gesto gesto) {
		String gesture = gesto.getName(); 
		switch (gesture) {
			case "papel":
				return this; 
			case "piedra":
				return gesto; 
			case "spock": 
				return this; 
			case "tijera": 
				return gesto; 
			default: 
				return null; 
		}	
	}

}
