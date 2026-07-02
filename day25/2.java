import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CommonCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        int[] frequency = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
        }

        List<Character> commonChars = new ArrayList<>();

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            
            if (frequency[ch] > 0) {
                commonChars.add(ch);
                frequency[ch]--; 
            }
        }

        if (commonChars.isEmpty()) {
            System.out.println("There are no common characters.");
        } else {
            System.out.println("Common characters: " + commonChars);
        }

        scanner.close();
    }
}