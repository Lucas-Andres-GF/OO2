package ar.edu.info.unlp.ejercicio10;

public class BlowfishEncryptor implements EncryptorStrategy {
  @Override
  public String encrypt(String message) {
    return "Encrypted with Blowfish: " + message + " - " + message.length() + " characters";
  }
}
