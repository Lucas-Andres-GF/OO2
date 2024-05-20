package ar.edu.info.unlp.ejercicio12;

/**
 * Connection
 */
public interface Connection {
  public abstract String sendData(String data, long crc);

  public abstract String pict();
}
