package Question_1;

abstract class ATM {
    protected double balance;

    abstract void withdraw(double amount);
    abstract void deposit(double amount);
    abstract void checkBalance();

    void displayMessage() {
        IO.println("Welcome to ATM");
    }
}