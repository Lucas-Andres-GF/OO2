package ar.edu.info.unlp.ejercicio8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.lang.RuntimeException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class ToDoItemTest {
	TodoItem task1;

	@BeforeEach
	void setUp() throws Exception {
		task1 = new TodoItem("Tarea1");
		task1.addComment("Fecha limite 25/04/2024");
	}

	@Test
	public void startTest() {
		task1.start();
		try {
			// Dormir durante 10 segundos
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// Manejar la excepción
			e.printStackTrace();
		}
		task1.finish();
		System.out
				.println(
						"Inicio: " + task1.getStartTime() + " - Fin: " + task1.getFinishTime() + " - Tiempo: "
								+ task1.workedTime());
	}

	@Test
	public void exeptionTest() {
		assertThrows(RuntimeException.class, () -> {
			task1.workedTime();
		});
	}

	@Test
	public void togglePauseTest() {
		task1.start();
		task1.togglePause();
		assertEquals(true, task1.getState() instanceof Paused);
		task1.togglePause();
		assertEquals(true, task1.getState() instanceof InProgress);
		task1.finish();
		assertEquals(true, task1.getState() instanceof Finished);
	}

	@Test
	public void addCommentsTest() {
		task1.addComment("HacerEsooo!");
		assertEquals(2, task1.getComments().size());
		task1.start();
		task1.finish();
		assertEquals(2, task1.getComments().size());
		assertThrows(
			RuntimeException.class, () -> {
				task1.addComment("Este no se ve");
			});
		task1.getComments().forEach(c -> System.out.println(c + "\n"));
	}

}
