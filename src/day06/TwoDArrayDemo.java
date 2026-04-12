package day06;

public class TwoDArrayDemo {
    public static void main(String[] args) {

        // Creating a 2D array
        int[][] matrix = {
                {1, 2, 3}, //matrix[0][0], matrix[0][1], matrix[0][2]
                {4, 5, 6},//matrix[1][0], matrix[1][1], matrix[1][2]
                {7, 8, 9}//matrix[2][0], matrix[2][1], matrix[2][2]
        };

        int x = matrix.length; // Number of rows
        int y = matrix[0].length; // Number of columns (assuming all rows have

        // Displaying the 2D array
        System.out.println("\n2D Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[][] anotherMatrix = new int[2][3]; // 2 rows and 3 columns

        anotherMatrix[0][0] = 10;
        anotherMatrix[0][1] = 20;
        anotherMatrix[0][2] = 30;
        anotherMatrix[1][0] = 40;
        anotherMatrix[1][1] = 50;
        anotherMatrix[1][2] = 60;

        System.out.println("\nAnother Matrix:");
        for (int i = 0; i < anotherMatrix.length; i++) {
            for (int j = 0; j < anotherMatrix[i].length; j++) {
                System.out.print(anotherMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Example: 2D array with fixed rows but varying column numbers (jagged array)
        int[][] jaggedArray = new int[3][]; // 3 rows, columns can vary
        jaggedArray[0] = new int[] {1, 2}; // 2 columns in row 0
        jaggedArray[1] = new int[] {3, 4, 5}; // 3 columns in row 1
        jaggedArray[2] = new int[] {6}; // 1 column in row 2

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
