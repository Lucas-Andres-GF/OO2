package ar.edu.info.unlp.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class PortionOfWater implements Topography {
	private List<Topography> components = new ArrayList<Topography>();  
	
	public PortionOfWater() {
		this.components.add(this); 
	}
	
	public List<Topography> getComponents(){
		return this.components; 
	}

	@Override
	public double getProportionOfWater() {
		return 1;
	}

	@Override
	public double getProportionOfEarth() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Portion of Water";
	}
	
	
	@Override
	public boolean equals(Topography topography) {
		return topography.equalWater(); 
	}

	@Override
	public boolean equalWater() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equalEarth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalSwamp() {
		// TODO Auto-generated method stub
		return false;
	}


}
