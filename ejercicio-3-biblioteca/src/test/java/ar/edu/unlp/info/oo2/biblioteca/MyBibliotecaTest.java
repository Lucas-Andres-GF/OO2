package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MyBibliotecaTest {
	
	private MyBiblioteca biblioteca; 
	private Socio juanPerez; 
	private Socio pedroLopez; 
	private JSONParser parser; 
	
	@BeforeEach
	public void setup() throws Exception{
		biblioteca = new MyBiblioteca(); 
		juanPerez = new Socio("Juan Perez", "juanp@gmail.com", "19630/4"); 
		pedroLopez = new Socio("Pedro Lopez", "pedrop@gmail.com", "18990/3"); 
		biblioteca.agregarSocio(juanPerez); 
		biblioteca.agregarSocio(pedroLopez);
		parser = new JSONParser();
	}
	
	@Test
	public void exportarSociosTest() throws ParseException {
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
		
		String salida = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]\n"
				+ "";
	
		assertEquals(parser.parse(json), parser.parse(this.biblioteca.exportarSocios()));
		
//		assertEquals(json, biblioteca.exportarSocios());
	}
	
}

