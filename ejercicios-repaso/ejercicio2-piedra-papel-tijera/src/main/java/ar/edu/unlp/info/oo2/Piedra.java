package ar.edu.unlp.info.oo2;

public class Piedra implements Jugada {

  @Override
  public String jugarContra(Jugada otra) {
    return otra.jugarContraPiedra(this);
  }

  @Override
  public String jugarContraPiedra(Piedra piedra) {
    return "Hubo Empate";
  }

  @Override
  public String jugarContraPapel(Papel papel) {
    return "Gana Papel";
  }

  @Override
  public String jugarContraTijera(Tijera tijera) {
    return "Gana Piedra";
  }

  @Override
  public String jugarContraSpock(Spock spock) {
    return "Gana Spock";
  }

  @Override
  public String jugarContraLagarto(Lagarto lagarto) {
    return "Gana Piedra";
  }

}
