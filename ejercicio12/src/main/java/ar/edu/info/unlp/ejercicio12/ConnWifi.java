package ar.edu.info.unlp.ejercicio12;

/**
 * ConnWifi
 */
public class ConnWifi implements Connection {
  private String pict;

  public ConnWifi() {
    this.pict = "Wifi";
  }

  @Override
  public String sendData(String data, long crc) {
    return "Data sent: " + data + " with crc: " + crc + " using wifi";
  }

  @Override
  public String pict() {
    return this.pict;
  }

}