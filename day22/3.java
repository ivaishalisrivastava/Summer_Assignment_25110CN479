import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] frequency = new int[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            frequency[ch]++; 
        }

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("'" + (char) i + "' : " + frequency[i]);
            }
        }

        scanner.close();
    }
}