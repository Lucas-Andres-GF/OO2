package ar.edu.info.unlp.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter twitter;
	Usuario messi2; 
	Usuario messi; 
	
	@BeforeEach
	void setUp() throws Exception{
		twitter = new Twitter();
	}
	
	@Test
	public void testAgregarUsuario() {
		assertEquals(0, twitter.getUsuarios().size());
		messi = twitter.agregarUsuario("Lionel Messi"); 
		messi2 = twitter.agregarUsuario("Lionel Messi"); 
		assertEquals(1, twitter.getUsuarios().size());
	}
	
	@Test
	public void testEliminarUsuario() {
		messi = twitter.agregarUsuario("Lionel Messi"); 
		assertTrue(twitter.eliminarUsuario(messi));
		assertEquals(0, messi.cantidadDePublicaciones());
	}
	
}
