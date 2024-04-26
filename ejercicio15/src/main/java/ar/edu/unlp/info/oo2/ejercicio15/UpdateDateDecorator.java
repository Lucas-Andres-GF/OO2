package ar.edu.unlp.info.oo2.ejercicio15;

public class UpdateDateDecorator extends Decorator {
  public UpdateDateDecorator(Component file) {
    super(file);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Date modified: " + getBaseComponent().getUpdateDate() + " - ";
  }
}
