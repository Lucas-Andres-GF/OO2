package ar.edu.info.unlp.ejercicio6;

import java.util.*;

public class Sistema {
	private List<Topography> topographies; 
	
	public Sistema() {
		topographies = new ArrayList<Topography>(); 
	}
	
	public void addTopography(Topography topography) {
		this.topographies.add(topography); 
	}
	
	public String getProportionOfWater() {
		String proportionOfWater = ""; 
		for (Topography topography: topographies) {
			proportionOfWater += topography.getProportionOfWater() + "\n"; 
		}
		return proportionOfWater;
	}
	
	public String getProportionOfEarth() {
		String proportionOfEarth = ""; 
		for (Topography topography: topographies) {
			proportionOfEarth += topography.getProportionOfEarth() + "\n"; 
		}
		return proportionOfEarth; 
	}
	
}
