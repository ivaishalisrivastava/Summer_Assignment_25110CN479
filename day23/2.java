import java.util.Scanner;

public class FirstRepeatingCharAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("The first character that eventually repeats is: '" + result + "'");
        } else {
            System.out.println("No repeating characters found.");
        }

        scanner.close();
    }
}