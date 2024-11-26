import java.util.Arrays;

public class printArrayElements {
    public static void main(String[] args) {
        // Declare and initialize a String array with predefined values
        String[] pens = {"FlexStick", "Farber Castel", "Test good", "Panda", "HBW"};

        // Use a for loop to iterate through the array
        for (int a = 0; a < pens.length; a++) {
            // Print the current index and corresponding element of the array
            System.out.println("Element at index [" + a + "]: " + pens[a]);
        }
    }
}
