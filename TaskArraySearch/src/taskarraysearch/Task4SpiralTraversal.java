package taskarraysearch;

import java.util.Scanner; // Import Scanner for user input

public class Task4SpiralTraversal {
    public static void main(String[] args) {
        // GitHub Repo: https://github.com/DC-9898/TaskArraySearch.git
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the dimensions of the matrix
        System.out.print("Enter rows and columns of the matrix: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create a 2D array to hold the matrix
        int[][] matrix = new int[rows][cols];

        // Input the elements of the matrix row by row
        System.out.println("Enter the elements of the matrix (row by row):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the spiral traversal
        System.out.print("Spiral Traversal: ");
        spiralMatrix(matrix, rows, cols);

        // Close the Scanner
        scanner.close();
    }

    // Method to traverse the matrix in spiral order
    private static void spiralMatrix(int[][] matrix, int rows, int cols) {
        int topMatrix = 0;
        int bottomMatrix = rows - 1;
        int leftMatrix = 0;
        int rightMatrix = cols - 1;

        while (topMatrix <= bottomMatrix && leftMatrix <= rightMatrix) {
            // Traverse from left to right along the top boundary
            for (int i = leftMatrix; i <= rightMatrix; i++) {
                System.out.print(matrix[topMatrix][i] + " ");
            }
            topMatrix++; // Move the top boundary down

            // Traverse from top to bottom along the right boundary
            for (int i = topMatrix; i <= bottomMatrix; i++) {
                System.out.print(matrix[i][rightMatrix] + " ");
            }
            rightMatrix--; // Move the right boundary left

            // Check if there are remaining rows
            if (topMatrix <= bottomMatrix) {
                // Traverse from right to left along the bottom boundary
                for (int i = rightMatrix; i >= leftMatrix; i--) {
                    System.out.print(matrix[bottomMatrix][i] + " ");
                }
                bottomMatrix--; // Move the bottom boundary up
            }

            // Check if there are remaining columns
            if (leftMatrix <= rightMatrix) {
                // Traverse from bottom to top along the left boundary
                for (int i = bottomMatrix; i >= topMatrix; i--) {
                    System.out.print(matrix[i][leftMatrix] + " ");
                }
                leftMatrix++; // Move the left boundary right
            }
        }
    }
}
