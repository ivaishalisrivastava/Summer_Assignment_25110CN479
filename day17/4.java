import java.util.Scanner;

class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of first sorted array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " sorted elements:");
        for (int i = 0; i < n1; i++) arr1[i] = scanner.nextInt();

        // Input for Array 2
        System.out.print("Enter size of second sorted array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " sorted elements:");
        for (int i = 0; i < n2; i++) arr2[i] = scanner.nextInt();

        // Input for Array 3
        System.out.print("Enter size of third sorted array: ");
        int n3 = scanner.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter " + n3 + " sorted elements:");
        for (int i = 0; i < n3; i++) arr3[i] = scanner.nextInt();

        System.out.println("\nCommon elements are: ");
        
        int i = 0, j = 0, k = 0;
        boolean found = false;

        while (i < n1 && j < n2 && k < n3) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                found = true;
                i++;
                j++;
                k++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else if (arr2[j] < arr3[k]) {
                j++;
            }
            else {
                k++;
            }
        }

        if (!found) {
            System.out.print("No common elements found.");
        }
        System.out.println();

        scanner.close();
    }
}