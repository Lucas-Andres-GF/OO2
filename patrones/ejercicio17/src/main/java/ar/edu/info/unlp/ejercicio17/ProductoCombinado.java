package ar.edu.info.unlp.ejercicio17;

import java.util.List;

public abstract class ProductoCombinado extends ProductoFinanciero{    
    private List<ProductoFinanciero> productos;

    public void addProducto(ProductoFinanciero producto){
        this.productos.add(producto);
    }

    @Override
    public double retornoInversion() {        
        return 0;
    }

}
