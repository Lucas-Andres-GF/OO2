package ar.edu.unlp.info.oo2.ejercicio15;

import java.time.LocalDate;
import java.util.List;

public class FileOO2 implements Component {
  private String name;
  private String extension;
  private int size;
  private LocalDate creationDate;
  private LocalDate updateDate;
  private List<String> permissions;

  public FileOO2(String name, String extension, int size, LocalDate creationDate, LocalDate updateDate,
      List<String> permissions) {
    this.name = name;
    this.extension = extension;
    this.size = size;
    this.creationDate = creationDate;
    this.updateDate = updateDate;
    this.permissions = permissions;
  }

  @Override
  public String prettyPrint() {
    return "> ";
  }

  public String getName() {
    return name;
  }

  public String getExtension() {
    return extension;
  }

  public int getSize() {
    return size;
  }

  public LocalDate getCreationDate() {
    return creationDate;
  }

  public LocalDate getUpdateDate() {
    return updateDate;
  }

  public List<String> getPermissions() {
    return permissions;
  }

}
