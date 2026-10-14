
package Question_2;

class UPIPayment implements Payment {

    private String upiId;
    private String transactionId;
    private double amount;
    private boolean paymentSuccessful;

    UPIPayment(String upiId) {
        this.upiId = upiId;
        this.transactionId = "UPI-TXN-101";
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

        IO.println("Processing UPI payment...");
        IO.println("UPI Payment Successful");

        return true;
    }

    @Override
    public void displayPaymentDetails() {
        IO.println("\n--- UPI Payment Receipt ---");
        IO.println("UPI ID: " + upiId);
        IO.println("Transaction ID: " + transactionId);
        IO.println("Amount: ₹" + amount);
        IO.println("Status: "
                + (paymentSuccessful ? "Successful" : "Failed"));
    }

    @Override
    public String getPaymentMethod() {
        return "UPI";
    }
}
