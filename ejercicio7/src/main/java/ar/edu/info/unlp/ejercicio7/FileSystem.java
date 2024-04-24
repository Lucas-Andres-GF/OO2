package ar.edu.info.unlp.ejercicio7;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystem {
	private String name;
	private LocalDate creationDate;

	public FileSystem(String name, int day, int month, int year) {
		this.name = "/" + name;
		this.creationDate = LocalDate.of(year, month, day);
	}

	public LocalDate getCreationDate() {
		return this.creationDate;
	}

	public String getName() {
		return this.name;
	}

	public abstract int tamanoTotalOcupado();

	public abstract File archivoMasGrande();

	public abstract File archivoMasNuevo();

	public abstract FileSystem buscar(String nombre);

	public abstract List<FileSystem> buscarTodos(String nombre);

	public abstract String listadoDeContenido();
}
