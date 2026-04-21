import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void testElectronico() {
        Electronico computador = new Electronico("Laptop", 1200, 5, "Si");

        assertEquals("Laptop", computador.getNombre());
        assertEquals("Si", computador.getGarantia());
    }

    @Test
    void testAlimento() {
        Alimento leche = new Alimento("Leche", 12, 20, "2024-12-31");

        assertEquals(12, leche.getPrecio());
        assertEquals("2024-12-31", leche.getFechaCaducidad());
    }
}