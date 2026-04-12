package day06;

public class BreakContinueReturnDemo {
    public static void main(String[] args) {

        // Demonstrating Break Statement
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exit the loop when i is 5
            }
            System.out.println("i = " + i);
        }

        // Demonstrating Continue Statement
        System.out.println("\nDemonstrating continue statement:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Skipping even number i = " + i);
                continue; // Skip even numbers
            }
            System.out.println("i = " + i);
        }

        // Demonstrating Return Statement
        System.out.println("\nDemonstrating return statement:");
        int result = findFistEvenNumber(5, 10);
        if (result != -1) {
            System.out.println("The first even number is: " + result);
        } else {
            System.out.println("No even number found in the range.");
        }

        int result2 = findFistOddNumber(2, 10);
        if (result2 != -1) {
            System.out.println("The first odd number is: " + result2);
        } else {
            System.out.println("No odd number found in the range.");
        }

        System.out.println("\n--- Calling Inner Classes ---");
        // Calling the main method of BreakContinueReturnDemo2 manually
        BreakContinueReturnDemo2.main(new String[]{});
        
        // Calling the main method of BreakContinueReturnDemo3 manually
        BreakContinueReturnDemo3.main(new String[]{});
    }

    public static int findFistEvenNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                return i; // Return the first even number
            }
        }
        return -1; // Return -1 if no even number is found
    }

    public  static  int findFistOddNumber(int start, int end){
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                return i; // Return the first odd number
            }
        }
        return -1;
    }

    static class BreakContinueReturnDemo2{
        public static void main(String[] args) {
            System.out.println("BreakContinueReturnDemo2 Class");
        }
    }

    static class BreakContinueReturnDemo3{
        public static void main(String[] args) {
            System.out.println("BreakContinueReturnDemo3 Class");
        }
    }
}
