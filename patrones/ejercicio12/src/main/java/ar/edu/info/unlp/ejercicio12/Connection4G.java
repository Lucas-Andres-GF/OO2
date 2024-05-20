package ar.edu.info.unlp.ejercicio12;

public class Connection4G {
  private String symb;

  Connection4G() {
    this.symb = "Symbol - 4G";
  }

  public String transmit(String data, long crc) {
    return "Data sent: " + data + " with crc: " + crc + " using 4G";
  }

  public String getSymb() {
    return symb;
  }
}
