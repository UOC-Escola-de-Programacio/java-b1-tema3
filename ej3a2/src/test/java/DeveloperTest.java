import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DeveloperTest {

    @Test
    void testValidDeveloper() {
        Developer dev = new Developer(1, "Alice", 3000.0, "Java");
        assertEquals(1, dev.getId());
        assertEquals("Alice", dev.getName());
        assertEquals(3000.0, dev.getSalary());
        assertEquals("Java", dev.getLanguage());
        assertEquals("Developer: 1, Name: Alice, Salary: 3000.0€, Language: Java", dev.toString());
    }

    @Test
    void testEmptyName() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Developer dev = new Developer(2, "", 2800.0, "Python");

        System.setOut(System.out);
        assertTrue(out.toString().contains("Name cannot be empty."));
    }

    @Test
    void testNegativeSalary() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Developer dev = new Developer(3, "Bob", -1000.0, "C++");

        System.setOut(System.out);
        assertTrue(out.toString().contains("Salary cannot be negative."));
    }

    @Test
    void testEmptyLanguage() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        Developer dev = new Developer(4, "Sara", 2200.0, "");

        System.setOut(System.out);
        assertTrue(out.toString().contains("Programming language cannot be empty."));
    }
}
