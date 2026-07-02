import java.util.Arrays;
import java.util.Scanner;

class SortNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names you want to sort: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];

        System.out.println("Enter the " + n + " names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}