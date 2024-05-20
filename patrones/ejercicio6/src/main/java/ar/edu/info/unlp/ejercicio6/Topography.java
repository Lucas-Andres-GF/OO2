package ar.edu.info.unlp.ejercicio6;

public interface Topography {
	public abstract double getProportionOfWater(); 
	public abstract double getProportionOfEarth(); 
	public abstract boolean equals(Topography topography); 
	public abstract boolean equalWater();
	public abstract boolean equalEarth(); 
	public abstract boolean equalSwamp();
}
