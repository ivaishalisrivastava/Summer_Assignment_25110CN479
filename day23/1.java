import java.util.Scanner;

public class FirstNonRepeatingCharAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("The first non-repeating character is: '" + result + "'");
        } else {
            System.out.println("There is no non-repeating character in the string.");
        }

        scanner.close();
    }
}