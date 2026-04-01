package ar.edu.unlp.info.oo2;

public class Papel implements Jugada {

  @Override
  public String jugarContra(Jugada otra) {
    return otra.jugarContraPapel(this);
  }

  @Override
  public String jugarContraPiedra(Piedra piedra) {
    return "Gana Papel";
  }

  @Override
  public String jugarContraPapel(Papel papel) {
    return "Hubo Empate";
  }

  @Override
  public String jugarContraTijera(Tijera tijera) {
    return "Gana Tijera";
  }

  @Override
  public String jugarContraSpock(Spock spock) {
    return "Gana Papel";
  }

  @Override
  public String jugarContraLagarto(Lagarto lagarto) {
    return "Gana Lagarto";
  }

}
