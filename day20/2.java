import java.util.Scanner;

class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        if (rows != columns) {
            System.out.println("The matrix is not symmetric (It must be a square matrix).");
            scanner.close();
            return;
        }

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;

        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break; 
                }
            }
            if (!isSymmetric) {
                break; 
            }
        }

        System.out.println("\nYour Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        if (isSymmetric) {
            System.out.println("\nThe matrix is symmetric.");
        } else {
            System.out.println("\nThe matrix is NOT symmetric.");
        }

        scanner.close();
    }
}