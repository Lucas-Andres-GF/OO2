package ar.edu.unlp.info.oo2.ejercicio15;

public class ExtensionDecorator extends Decorator {
  public ExtensionDecorator(Component file) {
    super(file);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Extension: " + getBaseComponent().getExtension() + " - ";
  }
}
