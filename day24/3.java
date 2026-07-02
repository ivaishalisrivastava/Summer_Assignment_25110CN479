import java.util.Scanner;

class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        if (longestWord.isEmpty()) {
            System.out.println("No words found.");
        } else {
            System.out.println("The longest word is: \"" + longestWord + "\"");
            System.out.println("Length: " + longestWord.length());
        }

        scanner.close();
    }
}