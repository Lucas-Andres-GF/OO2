package ar.edu.info.unlp.ejercicio10;

public class SecureConnection extends Connection {
  private EncryptorStrategy strategy;

  public SecureConnection() {
    this.strategy = new RSAEncryptor();
  }

  @Override
  public String sendMessage(String message) {
    return this.strategy.encrypt(message);
  }

  @Override
  public void setStrategy(EncryptorStrategy strategy) {
    this.strategy = strategy;
  }

}
