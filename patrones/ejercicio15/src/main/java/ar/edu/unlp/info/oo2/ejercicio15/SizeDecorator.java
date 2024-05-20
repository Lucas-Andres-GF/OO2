package ar.edu.unlp.info.oo2.ejercicio15;

public class SizeDecorator extends Decorator {
  public SizeDecorator(Component file) {
    super(file);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Size: " + getBaseComponent().getSize() + "kb - ";
  }
}
