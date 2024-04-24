package ar.edu.info.unlp.ejercicio10;

public class RC4Encryptor implements EncryptorStrategy {
  @Override
  public String encrypt(String message) {
    return "Encrypted with RC4: " + message + " - " + message.length() + " characters";
  }
}
