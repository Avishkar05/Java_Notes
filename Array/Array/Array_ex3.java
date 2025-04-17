package Array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = {1,2,3,4,5};
		System.out.println("Enter number to search in Array");
		int elem=sc.nextInt();
		int count=0;
		
		for(int i=0;i<5;i++)
		{
			if(a[i]==elem)
			{
				System.out.println("Index="+i + " Element="+ a[i]);
				count++;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("Not Found");
		}

	}

}
