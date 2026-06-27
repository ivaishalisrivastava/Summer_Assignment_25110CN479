import java.util.Scanner;

class RowWiseSum {
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

        System.out.println("\nMatrix with Row-wise Sum:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0; 
            
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
                rowSum += matrix[i][j]; 
            }
            
            System.out.println("| Sum = " + rowSum);
        }

        scanner.close();
    }
}