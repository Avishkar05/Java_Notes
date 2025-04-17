package Bubble_Sorting_Array;

public class Bubble_Sort_basics {

	public static void main(String[] args) {
		

		int a[] = {11,1,3,5,4};
		
		System.out.println("Before Shorting : ");
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+" ");
		}
		
		
		for(int i=0;i<a.length;i++)
			//1 ->  i=11
			//2 ->  i=1
		{
			for(int j=i+1;j<a.length;j++)
				//1.1 -> j=1
				//1.2 -> j=3
				//1.3 -> j=5
				//1.4 -> j=4
				
				//2.1 -> j=3
				//2.2 -> j=5
				//2.3 -> j=4
				
			{
				if(a[i] > a[j])
					//1.1 -> 11>1 T
					//1.2 -> 11>3 T
					//1.3 -> 11>5 T
					//1.4 -> 11>4 T

					//2.1 -> 1>3 F
					//2.2 -> 1>5 F
					//2.3 -> 1>4 F
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
					//1.1 -> Swap 11,1,3,5,4  ->  1,11,3,5,4
					//1.2 -> Swap 11,1,3,5,4  ->  1,3,11,5,4
					//1.3 -> Swap 1,3,11,5,4  ->  1,3,5,11,4
					//1.4 -> Swap 1,3,5,11,4  ->  1,3,5,4,11

					//2 -> Swap 1,3,5,11,4  ->  1,3,5,4,11
				}
			}
		}
		
		System.out.println("\nAfter Shorting :");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
