package day04;

public class NestedLoopDemo {
    public static void main(String[] args) {

        System.out.println("\n");
        for (int i = 1; i <= 3; i++) {
            for (int c = 1; c <= 4; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 1; i <= 5; i++) {
            int count = 1;
            while (count <= i) {
                System.out.print("* ");
                count++;
            }
            System.out.println();
        }

        System.out.println("\n");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {

            // Print spaces
            for (int j = 1; j <=rows-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k<= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("\n");
        int newRows = 5;
        for (int i = 1; i <= newRows; i++) {
            for (int j = 1; j <= (newRows - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
