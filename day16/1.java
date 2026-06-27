import java.util.Scanner;

class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n (total expected numbers): ");
        int n = scanner.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " elements (from 1 to " + n + " with one missing):");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += arr[i];
        }

        int missingNumber = totalSum - arraySum;

        System.out.println("The missing number is: " + missingNumber);

        scanner.close();
    }
}