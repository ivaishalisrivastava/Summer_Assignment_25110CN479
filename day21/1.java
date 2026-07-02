import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int count = 0;

        for (char ch : str.toCharArray()) {
            count++; 
        }

        System.out.println("The length of the string is: " + count);

        scanner.close();
    }
}