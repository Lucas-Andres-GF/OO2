package ar.edu.info.unlp.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class PortionOfEarth implements Topography {
	private List<Topography> components = new ArrayList<Topography>();   
	
	public PortionOfEarth() {
		this.components.add(this);
	}
		
	@Override
	public double getProportionOfWater() {
		return 0;
	}

	@Override
	public double getProportionOfEarth() {
		return 1;
	}

	
	@Override
	public String toString() {
		return "Portion of Earth";
	}
	
	@Override
	public boolean equals(Topography topography) {
		return topography.equalEarth();
	}

	@Override
	public boolean equalWater() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean equalEarth() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean equalSwamp() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
