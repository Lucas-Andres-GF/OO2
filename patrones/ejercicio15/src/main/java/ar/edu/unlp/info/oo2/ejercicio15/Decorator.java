package ar.edu.unlp.info.oo2.ejercicio15;

public abstract class Decorator implements Component {
  protected Component component;

  public Decorator(Component component) {
    this.component = component;
  }

  public FileOO2 getBaseComponent() {
    Component current = component;
    while (current instanceof Decorator) {
      current = ((Decorator) current).component;
    }
    return (FileOO2) current;
  }

  @Override
  public String prettyPrint() {
    return this.component.prettyPrint();
  }

}
