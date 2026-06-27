import java.util.Arrays;
import java.util.Scanner;
class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid array size.");
            scanner.close();
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        int rd = 0; 

        for (int i = 1; i < n; i++) {
            if (arr[rd] != arr[i]) {
                rd++;
                arr[rd] = arr[i]; 
            }
        }

        System.out.println("\nArray after removing duplicates:");
        for (int i = 0; i <= rd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}