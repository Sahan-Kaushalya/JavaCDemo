package day11.abstraction;

public class HNBATM extends ATM {

    private double balance;

    public HNBATM(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public String withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
            return "Withdrawal successful. Current balance: " + balance;
        }

        return null;
    }

    @Override
    public String deposit(double amount) {
        if (amount <= 0) {
            return "Invalid deposit amount. Please enter a positive value.";
        }

        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
        return "Deposit successful. Current balance: " + balance;
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}