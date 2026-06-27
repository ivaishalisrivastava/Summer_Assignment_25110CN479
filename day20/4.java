import java.util.Scanner;

class ColumnWiseSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < columns; j++) {
            System.out.print("--------\t");
        }
        System.out.println();

        for (int j = 0; j < columns; j++) {
            int colSum = 0;
            
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j]; 
            }
            
            System.out.print(colSum + "\t");
        }
        System.out.println("<- Column Sums");

        scanner.close();
    }
}