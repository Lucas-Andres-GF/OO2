package ar.edu.info.unlp.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	private Empleado temporario; 
	private Empleado pasante; 
	private Empleado planta; 
	
	@BeforeEach
	public void setUp() throws Exception{
		temporario = new Temporario(true, 2, 15); // basico:24500 adicional:9000 descuento:3635 neto:29865
		pasante = new Pasante(3); //basico:20000 adicional:6000 descuento:2900 neto:23100
		planta = new Planta(false, 2, 5); // basico: 50000 adicional: 14000 descuento:7200 neto:56800
	}
	
	@Test
	public void sueldoTest() {
		assertEquals(29865, temporario.sueldo());
		assertEquals(23100, pasante.sueldo());
		assertEquals(56800, planta.sueldo());
	}
}
