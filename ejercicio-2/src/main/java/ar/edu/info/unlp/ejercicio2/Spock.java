package ar.edu.info.unlp.ejercicio2;

public class Spock extends Gesto {

	public Spock() {
		super("spock"); 
	}
	@Override
	public Gesto juegaContra(Gesto gesto) {
		String gesture = gesto.getName(); 
		switch (gesture) {
			case "papel":
				return gesto; 
			case "piedra":
				return this; 
			case "lagarto": 
				return gesto; 
			case "tijera": 
				return this; 
			default: 
				return null; 
		}	
	}

}
