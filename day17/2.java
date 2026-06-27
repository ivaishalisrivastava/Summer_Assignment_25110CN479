import java.util.HashSet;
import java.util.Scanner;

class UnionOfArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HashSet<Integer> unionSet = new HashSet<>();

        System.out.print("Enter size of first array: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter " + n1 + " elements:");
        for (int i = 0; i < n1; i++) {
            unionSet.add(scanner.nextInt()); 
        }

        System.out.print("Enter size of second array: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter " + n2 + " elements:");
        for (int i = 0; i < n2; i++) {
            unionSet.add(scanner.nextInt());
        }

        System.out.println("\nUnion of the two arrays:");
        for (int element : unionSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        scanner.close();
    }
}