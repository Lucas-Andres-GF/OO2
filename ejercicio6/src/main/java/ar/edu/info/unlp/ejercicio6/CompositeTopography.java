package ar.edu.info.unlp.ejercicio6;
import java.util.*;

public class CompositeTopography implements Topography {
	private List<Topography> components;   
	
	public CompositeTopography() {
		components = new ArrayList<Topography>();
	}
	
	public void addComponents(Topography t1, Topography t2, Topography t3, Topography t4 ) {
		components.add(t1); 
		components.add(t2); 
		components.add(t3); 
		components.add(t4); 
	}
	
	@Override
	public double getProportionOfWater() {
		return this.components
				.stream()
				.mapToDouble(t-> t.getProportionOfWater())
				.sum() / this.components.size();
	}
	
	@Override
	public double getProportionOfEarth() {
		return this.components
				.stream()
				.mapToDouble(t -> t.getProportionOfEarth())
				.sum() / this.components.size();
	}
	
	public List<Topography> getComponents() {
		return this.components; 
	}
	
	@Override
	public boolean equals(Topography topography) {
		if (topography.getClass() != this.getClass()) return false;
		CompositeTopography t = (CompositeTopography) topography; 
		return this.equalComposite(t);
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
		return false;
	}


	public boolean equalComposite(CompositeTopography topography) {
		if (this.getComponents().size() != topography.getComponents().size()) return false;
		for (int i = 0; i < this.getComponents().size(); i++){
			if ( ! this.getComponents().get(i).equals(topography.getComponents().get(i))) {
				return false; 
			}
		}
		return true; 
	}
	
}
