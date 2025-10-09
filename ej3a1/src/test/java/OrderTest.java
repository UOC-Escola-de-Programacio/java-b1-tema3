import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OrderTest {

    @Test
    void testValidOrder() {
        Order o = new Order(1, "Carlos", 100.0);
        assertEquals(1, o.getId());
        assertEquals("Carlos", o.getCustomer());
        assertEquals(100.0, o.getAmount());
        assertEquals("Order: 1, Customer: Carlos, Amount: 100.0€", o.toString());
    }

    @Test
    void testNegativeAmount() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Order o = new Order(2, "Ana", 50.0);
        o.setAmount(-10.0);

        System.setOut(System.out); // restaurar salida

        assertEquals(50.0, o.getAmount());
        assertTrue(out.toString().contains("Amount cannot be negative."));
    }

    @Test
    void testEmptyCustomer() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Order o = new Order(3, "Luis", 25.0);
        o.setCustomer("");

        System.setOut(System.out); // restaurar salida

        assertEquals("Luis", o.getCustomer());
        assertTrue(out.toString().contains("Customer name cannot be empty."));
    }
}
