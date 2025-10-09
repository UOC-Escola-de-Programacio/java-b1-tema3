import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        outContent.reset();
    }

    @Test
    void testCreditCardPayment() {
        Payment p = new CreditCardPayment(100.0, "1234");
        p.processPayment();
        assertEquals("Card Number: 1234", p.getPaymentDetails());
        assertEquals(2.0, p.calculateTransactionFee(), 0.001);
        assertTrue(outContent.toString().contains("Processing credit card payment of 100.0€ using card 1234"));
    }

    @Test
    void testPayPalPayment() {
        Payment p = new PayPalPayment(200.0, "user@example.com");
        p.processPayment();
        assertEquals("PayPal Account: user@example.com", p.getPaymentDetails());
        assertEquals(3.0, p.calculateTransactionFee(), 0.001);
        assertTrue(outContent.toString().contains("Processing PayPal payment of 200.0€ for account user@example.com"));
    }

    @Test
    void testBankTransfer() {
        Payment p = new BankTransfer(300.0, "ES00XXXX");
        p.processPayment();
        assertEquals("Bank Transfer to IBAN: ES00XXXX", p.getPaymentDetails());
        assertEquals(3.5, p.calculateTransactionFee(), 0.001);
        assertTrue(outContent.toString().contains("Processing bank transfer of 300.0€ to IBAN ES00XXXX"));
    }

    @Test
    void testNegativeAmount() {
        new CreditCardPayment(-10.0, "badcard");
        assertTrue(outContent.toString().contains("Amount must be positive."));
    }
}
