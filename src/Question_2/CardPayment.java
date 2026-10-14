
package Question_2;

class CardPayment implements Payment {

    private String cardHolderName;
    private String lastFourDigits;
    private String transactionId;
    private double amount;
    private boolean paymentSuccessful;

    CardPayment(String cardHolderName, String lastFourDigits) {
        this.cardHolderName = cardHolderName;
        this.lastFourDigits = lastFourDigits;
        this.transactionId = "CARD-TXN-201";
        this.paymentSuccessful = false;
    }

    @Override
    public boolean pay(double amount) {
        if (amount <= 0) {
            IO.println("Invalid payment amount");
            return false;
        }

        this.amount = amount;
        paymentSuccessful = true;

        IO.println("Processing Card payment...");
        IO.println("Card Payment Successful");

        return true;
    }

    @Override
    public void displayPaymentDetails() {
        IO.println("\n--- Card Payment Receipt ---");
        IO.println("Card Holder: " + cardHolderName);
        IO.println("Card Number: **** **** **** "
                + lastFourDigits);
        IO.println("Transaction ID: " + transactionId);
        IO.println("Amount: ₹" + amount);
        IO.println("Status: "
                + (paymentSuccessful ? "Successful" : "Failed"));
    }

    @Override
    public String getPaymentMethod() {
        return "Card";
    }
}
