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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
