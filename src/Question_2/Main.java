
package Question_2;

public class Main {

    public static void main(String[] args) {

        IO.println("================================");
        IO.println("      PAYMENT SYSTEM");
        IO.println("================================");

        Payment payment1 =
                new UPIPayment("student@upi");

        Payment payment2 =
                new CardPayment("Rajesh Maurya", "4567");

        Payment payment3 =
                new CashPayment("Amit");

        processPayment(payment1, 500);
        processPayment(payment2, 1000);
        processPayment(payment3, 300);

        IO.println("\n================================");
        IO.println("   ALL PAYMENTS PROCESSED");
        IO.println("================================");
    }

    static void processPayment(Payment payment, double amount) {

        IO.println("\nPayment Method: "
                + payment.getPaymentMethod());

        boolean success = payment.pay(amount);

        if (success) {
            payment.displayPaymentDetails();
        } else {
            IO.println("Payment could not be completed.");
        }
    }
}
