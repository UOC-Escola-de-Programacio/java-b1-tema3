import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    // -----------------------
    //  System.out redirection
    // -----------------------
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
        outContent.reset();
    }

    // -----------------------
    // Logical tests
    // -----------------------

    @Test
    void testValidDiscount() {
        Product p = new Product(1, "Phone", 200.0);
        assertEquals(20.0, p.calculateDiscount());       // 10% default
        assertEquals(40.0, p.calculateDiscount(20));     // 20%
    }

    @Test
    void testInvalidDiscounts() {
        Product p = new Product(2, "Watch", 100.0);
        assertEquals(0, p.calculateDiscount(-10));       // invalid < 0
        assertEquals(0, p.calculateDiscount(200));       // invalid > 100
    }

    @Test
    void testProductValidation() {
        Product p = new Product(3, "", -100.0);
        assertNull(p.getName());
        assertEquals(0.0, p.getPrice());
    }

    @Test
    void testBookValid() {
        Book b = new Book(4, "1984", 20.0, "George Orwell");
        assertEquals("1984", b.getName());
        assertEquals("George Orwell", b.getAuthor());
        assertEquals("4 - 1984: 20.0€ - Author: George Orwell", b.toString());
    }

    @Test
    void testBookDefaultAuthor() {
        Book b = new Book(5, "No Author Book", 10.0);
        assertEquals("Unknown", b.getAuthor());
        assertEquals("5 - No Author Book: 10.0€ - Author: Unknown", b.toString());
    }

    @Test
    void testBookInvalidAuthorAndFields() {
        Book b = new Book(6, "", -10.0, "");
        assertNull(b.getName());
        assertEquals(0.0, b.getPrice());
        assertEquals("Unknown", b.getAuthor());
    }

    @Test
    void testElectronicValid() {
        Electronic e = new Electronic(7, "Laptop", 999.99, 24);
        assertEquals(24, e.getWarrantyMonths());
        assertEquals("This product has a warranty of 24 months.", e.displayWarranty());
        assertEquals("7 - Laptop: 999.99€ - Warranty: 24 months", e.toString());
    }

    @Test
    void testElectronicDefaultWarranty() {
        Electronic e = new Electronic(8, "USB Cable", 5.0);
        assertEquals(0, e.getWarrantyMonths());
        assertEquals("This product has a warranty of 0 months.", e.displayWarranty());
        assertEquals("8 - USB Cable: 5.0€ - Warranty: 0 months", e.toString());
    }

    @Test
    void testElectronicInvalidWarrantyAndFields() {
        Electronic e = new Electronic(9, "", -50.0, -5);
        assertNull(e.getName());
        assertEquals(0.0, e.getPrice());
        assertEquals(0, e.getWarrantyMonths());
    }

    // -----------------------
    // Messages tests
    // -----------------------

    @Test
    void testConsoleMessageInvalidDiscount() {
        Product p = new Product(10, "X", 100.0);
        p.calculateDiscount(-10);
        assertTrue(outContent.toString().contains("Invalid discount percentage."));
    }

    @Test
    void testConsoleMessageProductNameEmpty() {
        new Product(11, "", 10.0);
        assertTrue(outContent.toString().contains("Product name cannot be empty."));
    }

    @Test
    void testConsoleMessagePriceNegative() {
        new Product(12, "Item", -5.0);
        assertTrue(outContent.toString().contains("Price cannot be negative."));
    }

    @Test
    void testConsoleMessageAuthorEmpty() {
        new Book(13, "Title", 15.0, "");
        assertTrue(outContent.toString().contains("Author name cannot be empty."));
    }

    @Test
    void testConsoleMessageWarrantyNegative() {
        new Electronic(14, "TV", 200.0, -2);
        assertTrue(outContent.toString().contains("Warranty cannot be negative."));
    }
}
