package ar.edu.info.unlp.ejercicio2;

public class Tijera extends Gesto {
	
	public Tijera() {
		super("tijera"); 
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
				return gesto; 
			case "lagarto": 
				return this; 
			default: 
				return null; 
		}	
	}

}
