package day05;

public class NestedLoopTest {
    public static void main(String[] args) {

        // Question 01
        /*
         * This outer loop controls the number of rows printed.
         * The inner loops handle printing spaces and asterisks (*) for each row.
         *
         * Expected Output (A pyramid shape):
         *      *
         *     ***
         *    *****
         *   *******
         *  *********
         */

        /*
         *    My Logic to solve this question
         *
         *   Row  Stars pattern & logic
         *
         *   1.    1 ->  n-1 then 1+2 = 3
         *   2.    3 ->  n-2 then 3+2 = 5
         *   3.    5 ->  n-3 then 5+2 = 7
         *   4.    7 ->  n-4 then 7+2 = 9
         *   5.    9 ->  n-5 then 9+2 = 11
         */

        System.out.println("\n");
        int rowCount = 5;
        int spaceCount = 5;
        int starCount = 1;

        for (int i = 1; i <= rowCount; i++) {
            for(int j=1;j<=spaceCount;j++){
                System.out.print(" ");
            }

            spaceCount --;
            for (int k=1; k<= starCount; k++){
                System.out.print("*");
            }

            System.out.println();
            starCount = starCount+2;
        }

    }
}
