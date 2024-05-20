package ar.edu.info.unlp.ejercicio17;

import java.util.List;

public abstract class ProductoCreator {
    public abstract ProductoFinanciero createProducto(List<ProductoFinanciero> productos, String cliente);    
}
