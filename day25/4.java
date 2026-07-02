import java.util.Arrays;

 class ManualSortWordsByLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence want to sort by length: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        System.out.println("Original: " + Arrays.toString(words));

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted:   " + Arrays.toString(words));
    }
}