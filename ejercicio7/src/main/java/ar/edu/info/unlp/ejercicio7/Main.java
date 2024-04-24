package ar.edu.info.unlp.ejercicio7;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		Directory root = new Directory("root", 10, 5, 2015);
		Directory juegos = new Directory("juegos", 12, 5, 2015);

		juegos.addElement(new File("index.html", 14, 23, 4, 2024));

		root.addElement(juegos);
		root.addElement(new File("csgo", 52, 20, 8, 2021));
		root.addElement(new File("csgo", 21, 20, 8, 2019));
		root.addElement(new File("minecraft", 88, 15, 9, 2022));
		root.addElement(new File("gta", 125, 18, 8, 2019));

		File f = root.archivoMasGrande();
		System.out.println((f != null) ? f.getName() : "Null");

		File masNuevo = root.archivoMasNuevo();
		System.out.println("Mas nuevo " + masNuevo.getName());

		List<FileSystem> list = root.buscarTodos("/juegos");
		for (FileSystem l : list) {
			System.out.println(l.getName() + " " + l.getCreationDate());
		}

	}
}
