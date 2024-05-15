package ar.edu.info.unlp.ejercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	private Directory root;

	@BeforeEach
	public void setUp() throws Exception {
		root = new Directory("root", 10, 5, 2015);
		Directory juegos = new Directory("juegos", 12, 5, 2015);

		juegos.addElement(new File("index.html", 14, 23, 4, 2024));
		root.addElement(juegos);

		File csgo = new File("csgo", 125, 20, 8, 2019);
		root.addElement(csgo);

		File minecraft = new File("minecraft", 88, 15, 9, 2022);
		root.addElement(minecraft);

		File gta = new File("gta", 21, 18, 8, 2019);
		root.addElement(gta);

		root.addElement(gta);
		root.addElement(minecraft);
		root.addElement(csgo);
	}

	@Test
	public void tamanoTotalOcupadoTest() {
		assertEquals(546, root.tamanoTotalOcupado());
	}

	@Test
	public void archivoMasGrande() {
		assertEquals("/csgo", root.archivoMasGrande().getName());
	}

	@Test
	public void archivoMasNuevo() {
		assertEquals("/index.html", root.archivoMasNuevo().getName());
	}

	@Test
	public void listadoDeContenidoTest() {
		System.out.println(root.listadoDeContenido());
	}
}
