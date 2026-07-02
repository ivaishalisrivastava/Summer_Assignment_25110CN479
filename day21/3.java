import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int vowels = 0;
        int consonants = 0;

        // Convert the entire string to lowercase to handle case-insensitivity
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);

            // Check if the character is a valid alphabetic letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    // If it is a letter and not a vowel, it must be a consonant
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);

        scanner.close();
    }
}