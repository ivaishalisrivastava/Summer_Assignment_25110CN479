import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println("String after removing duplicates: " + result.toString());

        scanner.close();
    }
}