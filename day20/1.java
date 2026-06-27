import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows for Matrix 1: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter columns for Matrix 1: ");
        int c1 = scanner.nextInt();

        System.out.print("Enter rows for Matrix 2: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter columns for Matrix 2: ");
        int c2 = scanner.nextInt();

        if (c1 != r2) {
            System.out.println("Error: Columns of Matrix 1 must equal Rows of Matrix 2!");
            scanner.close();
            return;
        }

        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        int[][] productMatrix = new int[r1][c2];

        System.out.println("\nEnter elements for Matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nEnter elements for Matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) { 
            for (int j = 0; j < c2; j++) { 
                for (int k = 0; k < c1; k++) { 
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nResultant Product Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(productMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}