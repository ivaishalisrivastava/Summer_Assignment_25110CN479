import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string in lowercase: ");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            // Check if the character is a lowercase letter
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                // Subtract 32 to shift the ASCII value to its uppercase version
                charArray[i] = (char) (charArray[i] - 32);
            }
        }

        // Convert the modified character array back to a String
        String upperStr = new String(charArray);

        System.out.println("Uppercase string: " + upperStr);

        scanner.close();
    }
}