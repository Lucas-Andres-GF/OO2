package ar.edu.unlp.info.oo2.ejercicio14;

import java.util.Collection;
import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {

  private DatabaseAccess databaseRealAccess;
  private boolean isLogged;
  private String password;

  public DatabaseAccessProxy() {
    this.databaseRealAccess = new DatabaseRealAccess();
    this.isLogged = false;
    this.password = "admin";
  }

  @Override
  public Collection<String> getSearchResults(String queryString) {
    if (this.isLogged) {
      return this.databaseRealAccess.getSearchResults(queryString);
    } else {
      throw new RuntimeException("User not logged");
    }
  }

  @Override
  public int insertNewRow(List<String> rowData) {
    if (this.isLogged) {
      return this.databaseRealAccess.insertNewRow(rowData);
    } else {
      throw new RuntimeException("User not logged");
    }
  }

  public boolean isLogged() {
    return this.isLogged;
  }

  public void login(String password) {
    if (this.password.equals(password)) {
      this.isLogged = true;
    }
  }

}
