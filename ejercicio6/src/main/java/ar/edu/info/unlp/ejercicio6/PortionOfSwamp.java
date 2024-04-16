package ar.edu.info.unlp.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class PortionOfSwamp implements Topography {
	private List<Topography> components = new ArrayList<Topography>();  
	
	public PortionOfSwamp() {
		this.components.add(this);
	}
	
	public List<Topography> getComponents(){
		return this.components; 
	}
	
	@Override
	public double getProportionOfWater() {
		// TODO Auto-generated method stub
		return 0.7;
	}

	@Override
	public double getProportionOfEarth() {
		// TODO Auto-generated method stub
		return 0.3;
	}

	
	@Override
	public String toString() {
		return "Portion of Swamp";
	}

	@Override
	public boolean equals(Topography topography) {
		return topography.equalSwamp();
	}

	@Override
	public boolean equalWater() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalEarth() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalSwamp() {
		// TODO Auto-generated method stub
		return true;
	}

	
	

}
