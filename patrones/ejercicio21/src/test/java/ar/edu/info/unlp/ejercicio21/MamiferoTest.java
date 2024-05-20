package ar.edu.info.unlp.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
    Mamifero mamifero;
    Mamifero madre;
    Mamifero padre;
    Mamifero abuelaPaterna;

    @BeforeEach
    void setUp() throws Exception {
        mamifero = new Mamifero("1", "Perro", LocalDate.now());
        madre = new Mamifero("2", "Perro", LocalDate.now());
        mamifero.setMadre(madre);
        padre = new Mamifero("3", "Perro", LocalDate.now());
        abuelaPaterna = new Mamifero("4", "Perro", LocalDate.now());
        padre.setMadre(abuelaPaterna);
    }

    @Test
    public void testGetMadre() {
        assertEquals(madre, mamifero.getMadre());
    }
}
