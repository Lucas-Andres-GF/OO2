package ar.edu.info.unlp.ejercicio2;

public class Papel extends Gesto {

	public Papel() {
		super("papel"); 
	}
	@Override
	public Gesto juegaContra(Gesto gesto) {
		String gesture = gesto.getName(); 
		switch (gesture) {
			case "piedra":
				return this; 
			case "tijera":
				return gesto; 
			case "spock": 
				return this; 
			case "lagarto": 
				return gesto; 
			default: 
				return null; 
		}	
	}

}
