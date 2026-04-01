package ar.edu.unlp.info.oo2;

public class Lagarto implements Jugada {

  @Override
  public String jugarContra(Jugada otra) {
    return otra.jugarContraLagarto(this);
  }

  @Override
  public String jugarContraPiedra(Piedra piedra) {
    return "Gana Piedra";
  }

  @Override
  public String jugarContraPapel(Papel papel) {
    return "Gana Lagarto";
  }

  @Override
  public String jugarContraTijera(Tijera tijera) {
    return "Gana Lagarto";
  }

  @Override
  public String jugarContraSpock(Spock spock) {
    return "Gana Spock";
  }

  public String jugarContraLagarto(Lagarto lagarto) {
    return "Hubo Empate";
  }

}
