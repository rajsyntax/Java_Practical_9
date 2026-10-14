
package Question_2;

class CashPayment implements Payment {

    private String cashierName;
    private String receiptNumber;
    private double amount;
    private boolean paymentSuccessful;

    CashPayment(String cashierName) {
        this.cashierName = cashierName;
        this.receiptNumber = "CASH-REC-301";
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

        IO.println("Accepting cash...");
        IO.println("Cash Payment Successful");

        return true;
    }

    @Override
    public void displayPaymentDetails() {
        IO.println("\n--- Cash Payment Receipt ---");
        IO.println("Cashier: " + cashierName);
        IO.println("Receipt Number: " + receiptNumber);
        IO.println("Amount: ₹" + amount);
        IO.println("Status: "
                + (paymentSuccessful ? "Successful" : "Failed"));
    }

    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}
