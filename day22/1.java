import java.util.Scanner;

public class WordCountManual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount = 0;
        boolean isWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            // Check if the current character is a space, tab, or newline
            if (Character.isWhitespace(sentence.charAt(i))) {
                isWord = false; 
            } 
            // If the character is not a space and previous state was a space
            else if (!isWord) {
                isWord = true;
                wordCount++; // A new word has started
            }
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}