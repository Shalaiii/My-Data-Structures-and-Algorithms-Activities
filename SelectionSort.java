import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    // Method for selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
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

        // Sort the array using selection sort
        selectionSort(array);

        // Display the sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));

        sc.close();
    }
}
