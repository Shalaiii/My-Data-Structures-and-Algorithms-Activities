import java.util.Scanner;

public class Palindrome{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = sc.nextLine();

		String result = isPalindrome(word);
		System.out.println(result);

		sc.close();
	}
	public static String isPalindrome(String word) {
		int length = word.length();
		for (int a= 0; a < length / 2; a++){
			if (word.charAt(a) != word.charAt(length - 1 - a)){
			return "not a palindrome";
			}
		}

		return "palindrome";

	}
}
