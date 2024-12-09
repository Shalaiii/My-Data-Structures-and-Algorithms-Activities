import java.util.Scanner;

public class ArrayImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare and initialize an array of integers.
        int[] numbers = new int[5];

        // Input elements into the array.
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Access and print array elements.
        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element.
        System.out.print("\nEnter an index to modify (0-4): ");
        int index = scanner.nextInt();
        System.out.print("Enter a new value for index " + index + ": ");
        numbers[index] = scanner.nextInt();

        // Print the updated array.
        System.out.println("\nUpdated array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
