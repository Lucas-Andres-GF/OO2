package ar.edu.info.unlp.ejercicio6;

public class Main {

    public static void main(String[] args) 
    { 
    	Sistema s = new Sistema(); 
		PortionOfWater water = new PortionOfWater();
		PortionOfWater water2 = new PortionOfWater();
		PortionOfEarth earth = new PortionOfEarth(); 
		PortionOfSwamp swamp = new PortionOfSwamp(); 
		CompositeTopography composite1 = new CompositeTopography();
		CompositeTopography composite2 = new CompositeTopography(); 
		CompositeTopography composite3 = new CompositeTopography(); 
		composite1.addComponents(water, water, water, earth);
		composite2.addComponents(water, water, swamp, composite1);
		composite3.addComponents(water, water, swamp, composite1);
		s.addTopography(composite1);
		s.addTopography(composite2);
		System.out.println(composite2.equals(composite3));
		System.out.println("Composite Agua: \n" + s.getProportionOfWater());
		System.out.println("Composite Tierra: \n" + s.getProportionOfEarth());
		System.out.println("nada".equals("nada"));
	} 
}
