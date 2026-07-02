import java.util.Scanner;

class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to compress: ");
        String str = scanner.nextLine();

        if (str == null || str.length() <= 1) {
            System.out.println("Result: " + str);
        } else {
            StringBuilder compressed = new StringBuilder();
            int countConsecutive = 0;

            for (int i = 0; i < str.length(); i++) {
                countConsecutive++;

                if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                    compressed.append(str.charAt(i));
                    compressed.append(countConsecutive);
                    
                    countConsecutive = 0;
                }
            }

            String result = compressed.toString();

            if (result.length() < str.length()) {
                System.out.println("Compressed string: " + result);
            } else {
                System.out.println("string retained (compression didn't save space): " + str);
            }
        }

        scanner.close();
    }
}