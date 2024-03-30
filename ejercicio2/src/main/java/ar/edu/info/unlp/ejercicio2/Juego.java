package ar.edu.info.unlp.ejercicio2;

public class Juego {

	public String jugar(Gesto piedra, Gesto papel) {
		Gesto ganador = piedra.juegaContra(papel);
		String resultado = (ganador == null)? "Fue un empate" : ganador.toString();
		return "Resultado: " + resultado; 
	}
	
}
