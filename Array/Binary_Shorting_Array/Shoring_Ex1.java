package Binary_Shorting_Array;

//Find the avg of inner element
//Find the avg of outer element
//find the sum of diagonal
//find the sum of non-diagonal elements
public class Shoring_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { 
				{ 1, 2, 3, 2 },
				{ 4, 5, 6, 3 },
				{ 7, 8, 9, 5 } 
		};

		int sum =0;
		for (int i = 1; i <= a.length - 1; i++) 
		{
			for (int j = 1; j <= a.length -1; j++) 
			{
//				System.out.print(a[i][j]);
				sum =sum +a[i][j];
			}
			System.out.println(sum);
		}
	}

}
