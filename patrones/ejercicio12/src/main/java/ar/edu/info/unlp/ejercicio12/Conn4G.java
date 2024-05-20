package ar.edu.info.unlp.ejercicio12;

/**
 * Conn4G
 */
public class Conn4G implements Connection {
  private Connection4G connection4G;

  public Conn4G() {
    this.connection4G = new Connection4G();
  }

  @Override
  public String sendData(String data, long crc) {
    return this.connection4G.transmit(data, crc);
  }

  @Override
  public String pict() {
    return this.connection4G.getSymb();
  }
}