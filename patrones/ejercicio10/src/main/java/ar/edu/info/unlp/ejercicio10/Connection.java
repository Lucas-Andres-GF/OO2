package ar.edu.info.unlp.ejercicio10;

public abstract class Connection {
  public abstract String sendMessage(String message);

  public abstract void setStrategy(EncryptorStrategy strategy);

}
