package ar.edu.info.unlp.ejercicio10;

public class Messenger {
  private Connection connection;

  public Messenger() {
    this.connection = new SecureConnection();
  }

  public String sendMessage(String message) {
    return this.connection.sendMessage(message);
  }

  public String recieveMessage(String message) {
    return message;
  }

  public void setStrategy(EncryptorStrategy strategy) {
    this.connection.setStrategy(strategy);
  }

}