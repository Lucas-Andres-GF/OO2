package ar.edu.unlp.info.oo2.ejercicio15;

public class CreationDateDecorator extends Decorator {
  public CreationDateDecorator(Component component) {
    super(component);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Date created: " + getBaseComponent().getCreationDate() + " - ";
  }
}
