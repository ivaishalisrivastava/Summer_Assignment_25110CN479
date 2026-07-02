import java.util.Scanner;

class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        int maxCount = -1;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (maxCount < frequency[ch]) {
                maxCount = frequency[ch];
                maxChar = ch;
            }
        }

        if (str.trim().isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            System.out.println("Maximum occurring character is: '" + maxChar + "' (Occurs " + maxCount + " times)");
        }

        scanner.close();
    }
}
