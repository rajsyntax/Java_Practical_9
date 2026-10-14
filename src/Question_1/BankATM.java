package Question_1;

class BankATM extends ATM {

    @Override
    void withdraw(double amount) {
        if (amount <= 0) {
            IO.println("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            IO.println("Withdrawal Successful");
        } else {
            IO.println("Insufficient Balance");
        }
    }

    @Override
    void deposit(double amount) {
        if (amount <= 0) {
            IO.println("Invalid deposit amount");
        } else {
            balance += amount;
            IO.println("Deposit Successful");
        }
    }

    @Override
    void checkBalance() {
        IO.println("Balance: " + balance);
    }
}