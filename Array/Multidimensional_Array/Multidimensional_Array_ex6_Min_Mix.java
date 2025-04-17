package Multidimensional_Array;

public class Multidimensional_Array_ex6_Min_Mix {

	public static void main(String[] args) {

		int a[][]= {
				{1,2},
				{3,4}
		};

		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j] < min)
				{
					min = a[i][j];
				}
				if(a[i][j] > max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(min + " " + max);
	}

}
