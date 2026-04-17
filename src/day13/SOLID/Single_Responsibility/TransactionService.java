package day13.SOLID.Single_Responsibility;

public class TransactionService {
    
    TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public void processTransaction() {
        // Logic to process the transaction
        validateTransaction();
        System.out.println("Processing transaction: " );
        this.transactionRepository.saveTransaction();
       
    }
    
    public void validateTransaction() {
        // Logic to validate the transaction
        System.out.println("Validating transaction: " );
        System.out.println("Checking for sufficient funds" );
        System.out.println("Ensuring compliance with regulations" );
    }

    /*public void saveTransaction() {
    // Logic to save the transaction
    System.out.println("Saving transaction: " );
    System.out.println("Storing transaction details in the database" );
    }*/

    public static void main(String[] args) {
        TransactionRepository transactionRepository = new TransactionRepository();
        TransactionService transactionService = new TransactionService(transactionRepository);
        transactionService.processTransaction();
    }
}