package day11.abstraction;

public abstract class ATM {

    public abstract String withdraw(double amount);
    public abstract String deposit(double amount);
    public abstract double checkBalance();

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM!");
    }

    public static void main(String[] args) {
        ATM hnbATM = new HNBATM(1000);

        hnbATM.deposit(500);
        hnbATM.withdraw(200);

        System.out.println("HNB ATM Balance: " + hnbATM.checkBalance());

        ATM sampathATM = new SampathATM(2000);
        sampathATM.deposit(1000);
        sampathATM.withdraw(300);
        System.out.println("Sampath ATM Balance: " + sampathATM.checkBalance());
    }
}