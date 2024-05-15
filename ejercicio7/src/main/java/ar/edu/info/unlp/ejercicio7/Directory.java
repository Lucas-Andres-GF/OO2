package ar.edu.info.unlp.ejercicio7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory extends FileSystem {
	private List<FileSystem> elements;

	public Directory(String name, int day, int month, int year) {
		super(name, day, month, year);
		elements = new ArrayList<FileSystem>();
	}

	@Override
	public int tamanoTotalOcupado() {
		int sum = elements.stream().mapToInt(c -> c.tamanoTotalOcupado()).sum();
		return (sum + 32);
	}

	public void addElement(FileSystem element) {
		elements.add(element);
	}

	@Override
	public File archivoMasGrande() {
		return this.elements.stream()
				.map(c1 -> c1.archivoMasGrande())
				.filter(c -> c != null)
				.max((c1, c2) -> Integer.compare(c1.getSize(), c2.getSize()))
				.orElse(null);
	}

	@Override
	public File archivoMasNuevo() {
		return this.elements.stream()
				.map(e1 -> e1.archivoMasNuevo())
				.filter(c -> c != null)
				.max((c1, c2) -> c1.getCreationDate().compareTo(c2.getCreationDate()))
				.orElse(null);
	}

	@Override
	public FileSystem buscar(String nombre) {
		return this.elements.stream()
				.filter(e1 -> e1.getName().equals(nombre))
				.findFirst()
				.orElse(null);
	}

	public List<FileSystem> buscarTodos(String nombre) {
		// Inicializa una lista para los resultados
		List<FileSystem> resultados = new ArrayList<>();
		if (this.getName().equals(nombre))
			resultados.add(this);
		// Busca en los elementos actuales
		resultados.addAll(elements.stream()
				.flatMap(element -> element.buscarTodos(nombre).stream())
				.collect(Collectors.toList()));
		return resultados;

	}

	@Override
	public String listadoDeContenido() {
		return "Hacer"; 
	}

}
