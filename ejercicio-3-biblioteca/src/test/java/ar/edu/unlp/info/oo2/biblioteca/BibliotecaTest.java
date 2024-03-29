package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	private Biblioteca biblioteca; 
	private Socio juanPerez; 
	private Socio pedroLopez; 
	
	@BeforeEach
	public void setup() throws Exception{
		biblioteca = new Biblioteca(); 
		juanPerez = new Socio("Juan Perez", "juanp@gmail.com", "19630/4"); 
		pedroLopez = new Socio("Pedro Lopez", "pedrop@gmail.com", "18990/3"); 
		biblioteca.agregarSocio(juanPerez); 
		biblioteca.agregarSocio(pedroLopez);
	}
	
	@Test
	public void exportarSociosTest() {
		String separator = System.lineSeparator();
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
		assertEquals(json, biblioteca.exportarSocios());
	}
	
}
