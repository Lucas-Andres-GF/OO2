package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest3b {
	
	private Biblioteca biblioteca; 
	private Socio juanPerez; 
	private Socio pedroLopez; 
	private AdapterExporter adapterExporter; 
	private JSONParser parser; 
	
	@BeforeEach
	public void setup() throws Exception{
		biblioteca = new Biblioteca(); 
		juanPerez = new Socio("Juan Perez", "juanp@gmail.com", "19630/4"); 
		pedroLopez = new Socio("Pedro Lopez", "pedrop@gmail.com", "18990/3"); 
		biblioteca.agregarSocio(juanPerez); 
		biblioteca.agregarSocio(pedroLopez);
		adapterExporter = new AdapterExporter(); 
		parser = new JSONParser(); 
	}
	
	@Test
	public void exportarSociosTest() throws ParseException {
		String separator = System.lineSeparator();
		biblioteca.setExporter(adapterExporter);
		String json = "["+separator
				+ "	{"+ separator
				+ "		\"nombre\": \"Juan Perez\"," + separator
				+ "		\"email\": \"juanp@gmail.com\"," + separator
				+ "		\"legajo\": \"19630/4\"" + separator
				+ "	},"+ separator
				+ "	{"+ separator
				+ "		\"nombre\": \"Pedro Lopez\"," + separator
				+ "		\"email\": \"pedrop@gmail.com\","+ separator
				+ "		\"legajo\": \"18990/3\""+ separator
				+ "	}"+ separator
				+ "]";
		assertEquals(parser.parse(json), parser.parse(biblioteca.exportarSocios()));
//		assertEquals(json, biblioteca.exportarSocios());
	}
	
}
