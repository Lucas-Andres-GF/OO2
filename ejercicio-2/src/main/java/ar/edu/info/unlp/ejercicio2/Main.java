package ar.edu.info.unlp.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Juego juego = new Juego(); 
		
		Piedra piedra = new Piedra(); 
		Papel papel = new Papel(); 
		Tijera tijera = new Tijera(); 
		Spock spock = new Spock(); 
		Lagarto lagarto = new Lagarto(); 
		
		System.out.println(juego.jugar(spock, lagarto) );

	}

}
