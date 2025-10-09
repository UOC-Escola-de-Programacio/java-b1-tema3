public class BankTransfer extends Payment {
    private String iban;

    public BankTransfer(double amount, String iban) {
        super(amount);
        this.iban = iban;
    }

    @Override
    public void processPayment() {
        // TODO: Print "Processing bank transfer of <amount>€ to IBAN <iban>"
    }

    @Override
    public String getPaymentDetails() {
        // TODO: Return "Bank Transfer to IBAN: <iban>"
       
    }

    @Override
    public double calculateTransactionFee() {
        // TODO: Return fixed fee: 3.5
       
    }
}
