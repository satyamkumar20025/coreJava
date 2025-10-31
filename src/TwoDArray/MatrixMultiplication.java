package TwoDArray;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size for Matrix A
        System.out.print("Enter rows of A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of A / rows of B: ");
        int c1 = sc.nextInt();

        // Input size for Matrix B
        System.out.print("Enter columns of B: ");
        int c2 = sc.nextInt();

        int[][] a = new int[r1][c1];
        int[][] b = new int[c1][c2];
        int[][] product = new int[r1][c2];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < c1; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        // Multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++)
                    product[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Product of A × B:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(product[i][j] + " ");
            System.out.println();
        }

        sc.close();
    }
}