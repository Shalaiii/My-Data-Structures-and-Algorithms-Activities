import java.util.Scanner;
import java.util.Arrays;
public class BubbleSort {

    // Method for bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int a = 0; a < n - 1; a++) {
            swapped = false;
            for (int b = 0; b < n - a - 1; b++) {
                if (array[b] > array[b + 1]) {
                    // Swap array[b] and array[b + 1]
                    int temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                    swapped = true;
                }
            }
            // If no elements were swapped, the array is sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Sort the array using bubble sort
        bubbleSort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        sc.close();
    }
}
