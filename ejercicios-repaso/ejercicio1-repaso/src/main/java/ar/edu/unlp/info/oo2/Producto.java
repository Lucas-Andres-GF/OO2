package ar.edu.unlp.info.oo2;

public class Producto {
  private String nombre;
  private double precioBase;

  public Producto(String nombre, double precioBase) {
    this.nombre = nombre;
    this.precioBase = precioBase;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecioFinal() {
    return precioBase * 1.21; // Agrega un 21% de IVA al precio base
  }

}
