package Bubble_Sorting_Array;

public class Bubble_Sorting_Array1 {

	public static void main(String[] args) {
		
		int a [] = {40,33,78,5,20};
		for(int i=1;i<a.length;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if (a[min] >= a[j])
				{
					min =j;
				}
			}
			int temp =a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
		System.out.println("Short Array");
		for(int i=1;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
