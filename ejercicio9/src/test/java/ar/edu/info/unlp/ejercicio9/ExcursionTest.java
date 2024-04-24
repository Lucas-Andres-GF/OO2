package ar.edu.info.unlp.ejercicio9;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
  Excursion viajeABariloche;

  @BeforeEach
  void setUp() throws Exception {
    viajeABariloche = new Excursion("viaje a bariloche", "Plaza Moreno", 32502, 3, 10, LocalDate.of(2024, 4, 24),
        LocalDate.of(2024, 5, 12));
  }

  @Test
  public void registerPersonTest() {
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "gallardolucas003@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "juan@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "pepe@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "pepe@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "pepe@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "pepe@gmail.com"));
    viajeABariloche.registerPerson(new User("Lucas", "Gallardo", "pepe@gmail.com"));
    System.out.println(viajeABariloche.aboutMe());
  }
}
