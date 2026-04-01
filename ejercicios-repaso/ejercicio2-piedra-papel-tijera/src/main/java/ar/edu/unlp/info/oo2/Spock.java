package ar.edu.unlp.info.oo2;

public class Spock implements Jugada {

  @Override
  public String jugarContra(Jugada otra) {
    return otra.jugarContraSpock(this);
  }

  @Override
  public String jugarContraPiedra(Piedra piedra) {
    return "Gana Spock";
  }

  @Override
  public String jugarContraPapel(Papel papel) {
    return "Gana Papel";
  }

  @Override
  public String jugarContraTijera(Tijera tijera) {
    return "Gana Spock";
  }

  @Override
  public String jugarContraSpock(Spock spock) {
    return "Hubo Empate";
  }

  @Override
  public String jugarContraLagarto(Lagarto lagarto) {
    return "Gana Lagarto";
  }

}
