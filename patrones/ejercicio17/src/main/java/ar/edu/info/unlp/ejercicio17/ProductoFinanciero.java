package ar.edu.info.unlp.ejercicio17;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
    private LocalDate fechaDeOperacion; 
    public ProductoFinanciero() {
        this.fechaDeOperacion = LocalDate.now();
    }
    public abstract double retornoInversion();  
}
