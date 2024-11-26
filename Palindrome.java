import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.println("Enter a word: ");
        String word = sc.nextLine(); // Read the input word from the user

        // Call the isPalindrome method to check if the word is a palindrome
        String result = isPalindrome(word);

        // Print the result to the console
        System.out.println(result);

        // Close the scanner to release resources
        sc.close();
    }

    // Method to determine if a given word is a palindrome
    public static String isPalindrome(String word) {
        int length = word.length(); // Get the length of the word

        // Loop to compare characters from the beginning and end of the word
        for (int a = 0; a < length / 2; a++) {
            // If characters don't match, the word is not a palindrome
            if (word.charAt(a) != word.charAt(length - 1 - a)) {
                return "not a palindrome"; // Return the result immediately
            }
        }

        // If all characters match, the word is a palindrome
        return "palindrome";
    }
}
