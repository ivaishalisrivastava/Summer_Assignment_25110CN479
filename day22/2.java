import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String cleanStr = str.toLowerCase();

        int left = 0;
        int right = cleanStr.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++; 
            right--; 
        }

        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is NOT a palindrome.");
        }

        scanner.close();
    }
}