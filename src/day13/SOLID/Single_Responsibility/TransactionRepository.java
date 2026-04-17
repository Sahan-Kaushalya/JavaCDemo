package day13.SOLID.Single_Responsibility;

public class TransactionRepository {

    public void saveTransaction() {
        // Logic to save the transaction
        System.out.println("Saving transaction: " );
        System.out.println("Storing transaction details in the database" );
    }

    public void deleteTransaction() {
        // Logic to delete the transaction
        System.out.println("Deleting transaction: " );
        System.out.println("Removing transaction details from the database" );
    }

    public void updateTransaction() {
        // Logic to update the transaction
        System.out.println("Updating transaction: " );
        System.out.println("Modifying transaction details in the database" );
    }
}