package ar.edu.info.unlp.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class PortionOfWater implements Topography {
	private List<Topography> components = new ArrayList<Topography>();

	public PortionOfWater() {
		this.components.add(this);
	}

	public List<Topography> getComponents() {
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
		return true;
	}

	@Override
	public boolean equalEarth() {
		return false;
	}

	@Override
	public boolean equalSwamp() {
		return false;
	}

}
