import java.util.Scanner;

class MaxFrequencyElement {
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
        boolean[] visited = new boolean[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxFrequency = 0;
        int maxFreqElement = arr[0];

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            if (count > maxFrequency) {
                maxFrequency = count;
                maxFreqElement = arr[i];
            }
        }

        System.out.println("\nElement with maximum frequency: " + maxFreqElement);
        System.out.println("Its frequency is: " + maxFrequency);

        scanner.close();
    }
}