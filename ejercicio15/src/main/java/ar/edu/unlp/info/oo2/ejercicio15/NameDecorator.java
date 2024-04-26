package ar.edu.unlp.info.oo2.ejercicio15;

public class NameDecorator extends Decorator {

  public NameDecorator(Component component) {
    super(component);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Name: " + getBaseComponent().getName() + " - ";
  }
}
