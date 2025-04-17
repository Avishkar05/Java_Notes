package Array;

import java.util.Scanner;

public class Array_ex2_New {

	public static void main(String[] args) {
		
		int a[] = new int[50];
		System.out.println("Enter 5 ele");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<2;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Array");
		for(int i=0;i<50;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
