package ar.edu.unlp.info.oo2.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessProxyTest {
    private DatabaseAccessProxy database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseAccessProxy();
    }

    @Test
    void testGetSearchResults() {
        database.login("admin");
        assertEquals(Arrays.asList("Spiderman", "Marvel"),
                this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testGetSearchResultsWithoutLogin() {
        try {
            this.database.getSearchResults("select * from comics where id=1");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            assertEquals("User not logged", e.getMessage());
        }
    }

    @Test
    void testLogin() {
        this.database.login("Lucas");
        assertEquals(false, this.database.isLogged());
        this.database.login("admin");
        assertEquals(true, this.database.isLogged());
    }

    @Test
    void testInsertNewRow() {
        database.login("admin");
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"),
                this.database.getSearchResults("select * from comics where id=3"));
    }

    @Test
    void testInsertNewRowWithoutLogin() {
        try {
            this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor"));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            assertEquals("User not logged", e.getMessage());
        }
    }

}