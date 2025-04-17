package Multidimensional_Array;

import java.util.Scanner;

public class Multidimensional_Array_ex2_Input2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row=sc.nextInt();
		System.out.println("Enter column");
		int column=sc.nextInt();

		int a[][]=new int[row][column];
		
		System.out.println("Take user input : "+ (row*column) + " values to display "+row+" * "+column+" Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
	 	System.out.println("Output");
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
