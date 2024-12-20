// GitHub Repo: https://github.com/DC-9898/TaskArraySearch.git

package taskarraysearch;

import java.util.Scanner;

// Main class to handle Bubble Sort functionality
public class Task5BubbleSort {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Handle array input
        int[] array = getInputArray(scanner);

        // Display the array before sorting
        System.out.println("Array before sorting:");
        printArray(array);

        // Perform the sorting and count swaps
        Sorter sorter = new BubbleSort(); // BubbleSort adheres to the Sorter interface
        int totalSwaps = sorter.sort(array);

        // Display the sorted array
        System.out.println("Array after sorting:");
        printArray(array);

        // Display the total number of swaps
        System.out.println("Total swaps performed: " + totalSwaps);

        // Close the Scanner
        scanner.close();
    }

    // Method to get input array from the user
    private static int[] getInputArray(Scanner scanner) {
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Method to print the array
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for formatting
    }
}

// Interface for sorting algorithms
interface Sorter {
    int sort(int[] array); // Returns the total number of swaps
}

// BubbleSort implementation adhering to the Sorter interface
class BubbleSort implements Sorter {
    @Override
    public int sort(int[] array) {
        int n = array.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swaps++;
                }
            }
        }
        return swaps;
    }

    // Helper method to swap two elements in the array
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
