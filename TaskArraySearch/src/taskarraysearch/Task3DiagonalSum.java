// GitHub Repo: https://github.com/DC-9898/TaskArraySearch.git

package taskarraysearch;

import java.util.Scanner; // Import Scanner for user input

public class Task3DiagonalSum {
    public static void main(String[] args) {
    // Create a Scanner for user input
    Scanner scanner = new Scanner(System.in);

    // Ask the user for the size of the square matrix
    System.out.print("Enter the size of the square matrix: ");
    int n = scanner.nextInt(); // Store the size

    // Create a 2D array to hold the matrix
    int[][] matrix = new int[n][n];

    // Input the elements of the matrix row by row
    System.out.println("Enter the elements of the matrix (row by row):");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            matrix[i][j] = scanner.nextInt();
         }
      }

    // Calculate the main and secondary diagonal sums
    int mainDiagonalSum = 0;
    int secondaryDiagonalSum = 0;

    for (int i = 0; i < n; i++) {
        mainDiagonalSum += matrix[i][i]; // Main diagonal: matrix[i][i]
        secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal: matrix[i][n-1-i]
      }

    // Display the results
    System.out.println("Sum of the main diagonal: " + mainDiagonalSum);
    System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);

    // Close the Scanner
    scanner.close();
  }
}
