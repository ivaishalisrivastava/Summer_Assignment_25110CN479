import java.util.Arrays;
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("\nArray sorted for Binary Search: " + Arrays.toString(arr));

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int low = 0;
        int high = n - 1;
        int resultIndex = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                resultIndex = mid;
                break; 
            }

            if (arr[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}