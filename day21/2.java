import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Convert string to a mutable character array
        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        // Two-pointer approach to swap characters from both ends
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers closer to the center
            left++;
            right--;
        }

        // Convert the character array back into a String
        String reversedStr = new String(charArray);

        System.out.println("Reversed string: " + reversedStr);

        scanner.close();
    }
}