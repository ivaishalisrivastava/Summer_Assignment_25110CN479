import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string (S1): ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string (S2): ");
        String s2 = scanner.nextLine();

        if (s1.length() != s2.length() || s1.isEmpty()) {
            System.out.println("S2 is NOT a rotation of S1.");
        } else {
            String concatenated = s1 + s1;

            if (concatenated.contains(s2)) {
                System.out.println("Yes! S2 is a valid rotation of S1.");
            } else {
                System.out.println("No! S2 is NOT a rotation of S1.");
            }
        }

        scanner.close();
    }
}