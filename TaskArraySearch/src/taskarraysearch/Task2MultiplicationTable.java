// GitHub Repo: https://github.com/DC-9898/TaskArraySearch.git

package taskarraysearch;

import java.util.Scanner; // Import Scanner for user input

public class Task2MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the multiplication table
        System.out.print("Enter the size of the multiplication table: ");
        int n = scanner.nextInt(); // Store the size

        // Create a 2D array to hold the multiplication table
        int[][] table = new int[n][n];

        // Populate the 2D array with multiplication values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1); // Multiply (row + 1) * (col + 1)
            }
        }

        // Display the multiplication table in a clean matrix format
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + "\t"); // Print each value with a tab for alignment
            }
            System.out.println(); // Newline after each row
        }

        // Close the Scanner
        scanner.close();
    }
}

