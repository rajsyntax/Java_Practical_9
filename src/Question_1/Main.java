package Question_1;

public class Main {
    public static void main(String[] args) {
        BankATM atm = new BankATM();

        atm.displayMessage();
        atm.deposit(10000);
        atm.withdraw(3000);
        atm.checkBalance();
    }
}