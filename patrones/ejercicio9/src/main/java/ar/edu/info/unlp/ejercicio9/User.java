package ar.edu.info.unlp.ejercicio9;

public class User {
  private String name;
  private String lastName;
  private String email;

  public User(String name, String lastName, String email) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
  }

  public String getName() {
    return this.name;
  }

  public String getLastName() {
    return this.lastName;
  }

  public String getEmail() {
    return this.email;
  }
}
