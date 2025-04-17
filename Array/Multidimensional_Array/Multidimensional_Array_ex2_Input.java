package Multidimensional_Array;

import java.util.Scanner;

public class Multidimensional_Array_ex2_Input {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] a = new int[rows][cols];
        
        System.out.println("Enter elements of the 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
