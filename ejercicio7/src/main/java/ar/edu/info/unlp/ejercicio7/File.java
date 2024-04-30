package ar.edu.info.unlp.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class File extends FileSystem {
	private int size;

	public File(String name, int size, int day, int month, int year) {
		super(name, day, month, year);
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public int tamanoTotalOcupado() {
		return this.size;
	}

	@Override
	public File archivoMasGrande() {
		return this;
	}

	@Override
	public File archivoMasNuevo() {
		return this;
	}

	@Override
	public FileSystem buscar(String nombre) {
		throw new UnsupportedOperationException("Unimplemented method 'buscar'");
	}

	@Override
	public List<FileSystem> buscarTodos(String nombre) {
		List<FileSystem> resultados = new ArrayList<>();
		if (this.getName().equals(nombre)) {
			resultados.add(this); // Añade si el nombre coincide
		}
		return resultados; // Devuelve la lista con los resultados
	}

	@Override
	public String listadoDeContenido() {
		return this.getName();
	}

}
