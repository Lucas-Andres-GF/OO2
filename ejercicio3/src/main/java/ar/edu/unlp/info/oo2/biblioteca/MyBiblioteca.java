package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MyBiblioteca {
	private List<Socio> socios;
	private AdapterExporter exporter; 
	
	public  MyBiblioteca(){
		socios = new ArrayList<>();
		exporter= new AdapterExporter(); 
	}
	
	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}
	
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

}
