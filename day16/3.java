import java.util.Arrays;
import java.util.Scanner;

class PairWithSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int targetSum = scanner.nextInt();

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;
        boolean found = false;

        System.out.println("\nPairs with the sum " + targetSum + " are:");

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum == targetSum) {
                System.out.println("(" + arr[left] + ", " + arr[right] + ")");
                found = true;
                
                left++;
                right--;
            } else if (currentSum < targetSum) {
                left++;
            } else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found with the given sum.");
        }

        scanner.close();
    }
}