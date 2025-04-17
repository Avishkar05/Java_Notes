package Multidimensional_Array;


public class Multidimensional_Array_ex4_reverse {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		System.out.println("Before reverse : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		System.out.println();

		System.out.println("After reverse : ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	
		System.out.println("After reverse : ");		
		for(int s:a)
		{
			System.out.print(s+ " ");
		}
	}

}

