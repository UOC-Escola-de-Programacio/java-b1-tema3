/**
 * Exercici 5 – Tema 3
 *
 * Es demana crear una jerarquia de formes de pagament amb una classe abstracta anomenada Payment.
 *
 * Aquesta classe ha de tenir:
 * - Atribut: double amount
 * - Mètodes abstractes:
 *   · void processPayment()
 *   · String getPaymentDetails()
 *   · double calculateTransactionFee()
 *
 * Tots els mètodes abstractes de Payment s'han de sobreescriure
 * a cada subclasse que l'estengui. La classe Payment també ha de ser abstracta.
 *
 * El constructor ha de validar que l'import no sigui negatiu.
 * Si ho és, ha de mostrar per la sortida estàndar: "Amount must be positive."
 *
 * Subclasses:
 *
 * - CreditCardPayment:
 *   - Atribut: String cardNumber
 *   - processPayment(): mostra →
 *     "Processing credit card payment of <amount>€ using card <cardNumber>"
 *   - getPaymentDetails(): retorna → "Card Number: <cardNumber>"
 *   - calculateTransactionFee(): retorna el 2% de l'import
 *
 * - PayPalPayment:
 *   - Atribut: String email
 *   - processPayment(): mostra →
 *     "Processing PayPal payment of <amount>€ for account <email>"
 *   - getPaymentDetails(): retorna → "PayPal Account: <email>"
 *   - calculateTransactionFee(): retorna el 1.5% de l'import
 *
 * - BankTransfer:
 *   - Atribut: String iban
 *   - processPayment(): mostra →
 *     "Processing bank transfer of <amount>€ to IBAN <iban>"
 *   - getPaymentDetails(): retorna → "Bank Transfer to IBAN: <iban>"
 *   - calculateTransactionFee(): retorna comissió fixa de 3.5€
 *
 * Exemple:
 * Payment p1 = new CreditCardPayment(100.0, "1234-5678-9012-3456");
 * p1.processPayment();
 * System.out.println(p1.getPaymentDetails());
 * System.out.println("Fee: " + p1.calculateTransactionFee());
 *
 * Payment p2 = new PayPalPayment(200.0, "user@example.com");
 * p2.processPayment();
 * System.out.println(p2.getPaymentDetails());
 * System.out.println("Fee: " + p2.calculateTransactionFee());
 *
 * Payment p3 = new BankTransfer(300.0, "ES9820385778983000760236");
 * p3.processPayment();
 * System.out.println(p3.getPaymentDetails());
 * System.out.println("Fee: " + p3.calculateTransactionFee());
 *
 * Payment invalid = new CreditCardPayment(-50.0, "0000");
 *
 * // Sortida:
 * // Processing credit card payment of 100.0€ using card 1234-5678-9012-3456
 * // Card Number: 1234-5678-9012-3456
 * // Fee: 2.0
 * // Processing PayPal payment of 200.0€ for account user@example.com
 * // PayPal Account: user@example.com
 * // Fee: 3.0
 * // Processing bank transfer of 300.0€ to IBAN ES9820385778983000760236
 * // Bank Transfer to IBAN: ES9820385778983000760236
 * // Fee: 3.5
 * // Amount must be positive.
 *
 *
 * Ejercicio 5 – Tema 3
 *
 * Se pide crear una jerarquía de formas de pago con una clase abstracta llamada Payment.
 *
 * Esta clase debe contener:
 * - Atributo: double amount
 * - Métodos abstractos:
 *   · void processPayment()
 *   · String getPaymentDetails()
 *   · double calculateTransactionFee()
 *
 * Todos los métodos abstractos de Payment deben ser sobrescritos
 * en cada subclase que herede de ella. La clase Payment debe ser abstracta.
 *
 * El constructor debe validar que el importe no sea negativo.
 * Si lo es, debe imprimir: "Amount must be positive."
 *
 * Subclases:
 *
 * - CreditCardPayment:
 *   - Atributo: String cardNumber
 *   - processPayment(): imprime →
 *     "Processing credit card payment of <amount>€ using card <cardNumber>"
 *   - getPaymentDetails(): retorna → "Card Number: <cardNumber>"
 *   - calculateTransactionFee(): retorna 2% del importe
 *
 * - PayPalPayment:
 *   - Atributo: String email
 *   - processPayment(): imprime →
 *     "Processing PayPal payment of <amount>€ for account <email>"
 *   - getPaymentDetails(): retorna → "PayPal Account: <email>"
 *   - calculateTransactionFee(): retorna 1.5% del importe
 *
 * - BankTransfer:
 *   - Atributo: String iban
 *   - processPayment(): imprime →
 *     "Processing bank transfer of <amount>€ to IBAN <iban>"
 *   - getPaymentDetails(): retorna → "Bank Transfer to IBAN: <iban>"
 *   - calculateTransactionFee(): retorna comisión fija de 3.5€
 *
 * Ejemplo:
 * Payment p1 = new CreditCardPayment(100.0, "1234-5678-9012-3456");
 * p1.processPayment();
 * System.out.println(p1.getPaymentDetails());
 * System.out.println("Fee: " + p1.calculateTransactionFee());
 *
 * Payment p2 = new PayPalPayment(200.0, "user@example.com");
 * p2.processPayment();
 * System.out.println(p2.getPaymentDetails());
 * System.out.println("Fee: " + p2.calculateTransactionFee());
 *
 * Payment p3 = new BankTransfer(300.0, "ES9820385778983000760236");
 * p3.processPayment();
 * System.out.println(p3.getPaymentDetails());
 * System.out.println("Fee: " + p3.calculateTransactionFee());
 *
 * Payment invalid = new CreditCardPayment(-50.0, "0000");
 *
 * // Salida:
 * // Processing credit card payment of 100.0€ using card 1234-5678-9012-3456
 * // Card Number: 1234-5678-9012-3456
 * // Fee: 2.0
 * // Processing PayPal payment of 200.0€ for account user@example.com
 * // PayPal Account: user@example.com
 * // Fee: 3.0
 * // Processing bank transfer of 300.0€ to IBAN ES9820385778983000760236
 * // Bank Transfer to IBAN: ES9820385778983000760236
 * // Fee: 3.5
 * // Amount must be positive.
 */

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        // TODO: Validate amount. If negative, print "Amount must be positive."
    }

    public abstract void processPayment();
    public abstract String getPaymentDetails();
    public abstract double calculateTransactionFee();

    /*
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment(100.0, "1234-5678-9012-3456");
        p1.processPayment();
        System.out.println(p1.getPaymentDetails());
        System.out.println("Fee: " + p1.calculateTransactionFee());

        Payment p2 = new PayPalPayment(200.0, "user@example.com");
        p2.processPayment();
        System.out.println(p2.getPaymentDetails());
        System.out.println("Fee: " + p2.calculateTransactionFee());

        Payment p3 = new BankTransfer(300.0, "ES9820385778983000760236");
        p3.processPayment();
        System.out.println(p3.getPaymentDetails());
        System.out.println("Fee: " + p3.calculateTransactionFee());

        Payment invalid = new CreditCardPayment(-50.0, "0000");
    }
    */
}



