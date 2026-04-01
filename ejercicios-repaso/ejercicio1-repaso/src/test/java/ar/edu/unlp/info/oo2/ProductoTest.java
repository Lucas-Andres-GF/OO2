package ar.edu.unlp.info.oo2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProductoTest {
  @Test
  public void testGetPrecioFinal() {
    Producto producto = new Producto("Teclado", 10000);
    double precioFinal = producto.getPrecioFinal();
    // El precio final debería ser el precio base más el 21% de IVA, es decir, 10000
    // * 1.21 = 12100
    assertEquals(12100, precioFinal, 0.01);
  }
}
