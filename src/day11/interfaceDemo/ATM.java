package day11.interfaceDemo;

public interface ATM {

    String withdraw(double amount);

    String deposit(double amount);

    double checkBalance();

    default void displayWelcomeMessage() {
        System.out.println("Welcome to the ATM!");
    }

    static void displayBankInfo() {
        System.out.println("This is a demo ATM interface.");
    }

    public static void main(String[] args) {
        ATM hnbATM = new HNBATM(1000);
        // HNBATM hnbATM2 = new HNBATM(1500);
        hnbATM.displayWelcomeMessage();
        hnbATM.deposit(500);
        hnbATM.withdraw(200);

        ATM.displayBankInfo();

        System.out.println("HNB ATM Balance: " + hnbATM.checkBalance()+"\n");

        ATM sampathATM = new SampathATM(2000);
        sampathATM.displayWelcomeMessage();
        sampathATM.deposit(1000);
        sampathATM.withdraw(300);
        System.out.println("Sampath ATM Balance: " + sampathATM.checkBalance());

        //calling static method in interface
        ATM.displayBankInfo();

        System.out.println("\n");
        ATM bocATM = new BocATM(5000);
        bocATM.deposit(10000);
        bocATM.deposit(10000);
        bocATM.withdraw(5000);
        System.out.println("BOC ATM Balance: " + bocATM.checkBalance());
        ATM.displayBankInfo();
    }
}