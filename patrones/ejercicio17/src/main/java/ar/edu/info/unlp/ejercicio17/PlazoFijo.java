package ar.edu.info.unlp.ejercicio17;

public class PlazoFijo extends ProductoFinanciero{
    private int cantidadDias;
    private double tasaInteres;

    public PlazoFijo(int cantidadDias, double tasaInteres) {        
        super();
        this.cantidadDias = cantidadDias;
        this.tasaInteres = tasaInteres;
    }

    @Override
    public double retornoInversion() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
