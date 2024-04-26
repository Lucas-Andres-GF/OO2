package ar.edu.unlp.info.oo2.ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class FileOO2Test {
  Component file;

  @BeforeEach
  public void setUp() {
    List<String> permisos = Arrays.asList("r", "w", "x");
    this.file = new FileOO2("Csgo", "exe", 10000, LocalDate.now(), LocalDate.now(), permisos);
  }

  @Test
  public void testWithExtensionDecoratorAndName() {
    Decorator decorator = new UpdateDateDecorator(new CreationDateDecorator(
        new SizeDecorator(new PermissionsDecorator(new ExtensionDecorator(new NameDecorator(file))))));
    System.out.println(decorator.prettyPrint());
  }

  @Test
  public void testWithExtensionDecorator() {
    Decorator decorator = new SizeDecorator(new ExtensionDecorator(file));
    System.out.println(decorator.prettyPrint());
  }

}
