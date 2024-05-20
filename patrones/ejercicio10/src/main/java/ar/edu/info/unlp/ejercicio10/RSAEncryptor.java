package ar.edu.info.unlp.ejercicio10;

public class RSAEncryptor implements EncryptorStrategy {
  public RSAEncryptor() {

  }

  @Override
  public String encrypt(String message) {
    return "Encrypted with RSA: " + message + " - " + message.length() + " characters";
  }
}
