package Multidimensional_Array;

public class multidimensional_Array_ex1 {

	public static void main(String[] args) {

		
		System.out.println("2D Matrix : ");
		int a[][] = { {10,20,30} , {11,33,44} };
		
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
