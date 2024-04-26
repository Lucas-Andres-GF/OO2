package ar.edu.unlp.info.oo2.ejercicio15;

public class PermissionsDecorator extends Decorator {
  public PermissionsDecorator(Component component) {
    super(component);
  }

  @Override
  public String prettyPrint() {
    return super.prettyPrint() + "Permissions: " + getBaseComponent().getPermissions() + " - ";
  }
}
