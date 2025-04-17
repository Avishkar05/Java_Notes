package Multidimensional_Array;

import java.util.Scanner;

public class Multidimensional_Array_ex3_addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        

        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        //Matrix Input
        System.out.println("Enter values for Matrix A:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values for Matrix B:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        int[][] c = new int[row][column];
        System.out.println("\n Matrix after Addition:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "\t"); 
            }
            System.out.println();
        }
    }
}
