import java.util.HashSet;
import java.util.Scanner;

class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input for the first array
        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        System.out.println("\nIntersection of the two arrays:");
        if (intersectionSet.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            for (int element : intersectionSet) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}