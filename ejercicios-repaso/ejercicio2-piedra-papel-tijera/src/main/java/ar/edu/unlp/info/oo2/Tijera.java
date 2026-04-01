package ar.edu.unlp.info.oo2;

public class Tijera implements Jugada {

  @Override
  public String jugarContra(Jugada otra) {
    return otra.jugarContraTijera(this);
  }

  @Override
  public String jugarContraPiedra(Piedra piedra) {
    return "Gana Piedra";
  }

  @Override
  public String jugarContraPapel(Papel papel) {
    return "Gana Tijera";
  }

  @Override
  public String jugarContraTijera(Tijera tijera) {
    return "Hubo Empate";
  }

  @Override
  public String jugarContraSpock(Spock spock) {
    return "Gana Spock";
  }

  @Override
  public String jugarContraLagarto(Lagarto lagarto) {
    return "Gana Lagarto";
  }

}
