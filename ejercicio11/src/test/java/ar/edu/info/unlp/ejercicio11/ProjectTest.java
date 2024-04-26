package ar.edu.info.unlp.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class ProjectTest {
	Project pantalonesEscarpelados;
	Project vaciones;

	@BeforeEach
	void setUp() throws Exception {

	}

	@Test
	public void projectTest() {
		vaciones = new Project("Vacaciones de invierno", LocalDate.of(2024, 4, 24),
				LocalDate.of(2024, 4, 25), "Salir con amigos", 3, 0, 100);
		Exception exception = assertThrows(RuntimeException.class, () -> {
			vaciones.approveStage();
		});
		System.out.println(exception.getMessage());
	}

	@Test
	public void projectTest2() {
		pantalonesEscarpelados = new Project("Pantalones Escarpelados", LocalDate.of(2024, 4, 24),
				LocalDate.of(2024, 5, 24), "Ninguno", 10, 2000, 100);
		pantalonesEscarpelados.approveStage();
		System.out.printf("%.2f",pantalonesEscarpelados.getCost());
		System.out.println();
		System.out.printf("%.2f",pantalonesEscarpelados.getPrice());
		assertEquals(pantalonesEscarpelados.getState().getClass(), InEvaluation.class);
	}

	@Test
	public void durationTest() {
		pantalonesEscarpelados = new Project("Pantalones Escarpelados", LocalDate.of(2024, 4, 24),
				LocalDate.of(2024, 5, 25), "Ninguno", 10, 2000, 100);
		System.out.println(pantalonesEscarpelados.getDuration());
	}

	@Test
	public void cancelTest() {
		pantalonesEscarpelados = new Project("Pantalones Escarpelados", LocalDate.of(2024, 4, 24),
				LocalDate.of(2024, 5, 25), "Ninguno", 10, 2000, 100);
		System.out.println("Objetivo actual: " + pantalonesEscarpelados.getTarget());
		pantalonesEscarpelados.cancel();
		assertEquals(pantalonesEscarpelados.getState().getClass(), Canceled.class);
		assertEquals("Cancelado", pantalonesEscarpelados.getTarget());
		System.out.println(pantalonesEscarpelados.getTarget());
	}

}
