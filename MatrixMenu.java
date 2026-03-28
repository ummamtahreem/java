import java.util.Scanner;
public class MatrixMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] result = new int[rows][cols];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int choice;
        do {
            System.out.println("\n--- Matrix Operations Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\nResult of Addition:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            result[i][j] = A[i][j] + B[i][j];
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("\nResult of Subtraction:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            result[i][j] = A[i][j] - B[i][j];
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    if (cols != rows) {
                        System.out.println("\nMultiplication not possible! (Rows of A != Cols of B)");
                        break;
                    }
                    int[][] mul = new int[rows][cols];
                    System.out.println("\nResult of Multiplication:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            mul[i][j] = 0;
                            for (int k = 0; k < cols; k++) {
                                mul[i][j] += A[i][k] * B[k][j];
                            }
                            System.out.print(mul[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);
        sc.close();
    }
}
