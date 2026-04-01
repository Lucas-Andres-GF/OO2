package ar.edu.unlp.info.oo2;

public interface Jugada {
  String jugarContra(Jugada otra); // Método principal

  String jugarContraPiedra(Piedra piedra);

  String jugarContraPapel(Papel papel);

  String jugarContraTijera(Tijera tijera);

  // AHORA AGREGAMOS LAGARTO y SPOCK

  String jugarContraLagarto(Lagarto lagarto);                   

  String jugarContraSpock(Spock spock);

}
