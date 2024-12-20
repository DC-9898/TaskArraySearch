// GitHub Repo: https://github.com/DC-9898/TaskArraySearch.git

package taskarraysearch;

import java.util.Scanner; // Import Scanner for user input
import java.util.HashSet; // Import HashSet for quick duplicate checking

public class Task1ArraySearch {
    public static void main(String[] args) {
       // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt(); // Store the size of the array

        // Create an array to hold the elements
        int[] array = new int[n];

        // Prompt the user to enter the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt(); // Add each element to the array
        }

        // Call a method to check for the first repeated number
        String result = findFirstRepeated(array);

        // Print the result (either the first repeated element or no repeats found)
        System.out.println(result);

        // Close the Scanner
        scanner.close();
    }

    // This method checks for the first repeated number in the array
    private static String findFirstRepeated(int[] array) {
        // Use a HashSet to track numbers we’ve already seen
        HashSet<Integer> seen = new HashSet<>();

        // Loop through each number in the array
        for (int num : array) {
            // If the number is already in the set, it’s the first repeat
            if (seen.contains(num)) {
                return "First repeated element: " + num;
            }
            // Otherwise, add it to the set
            seen.add(num);
        }

        // If no repeated numbers were found, return this message
        return "No repeated elements found.";
    }
}



