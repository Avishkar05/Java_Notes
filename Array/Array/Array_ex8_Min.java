package Array;

public class Array_ex8_Min {

	public static void main(String[] args) {
		int a[] = { 15, 56, 9, 6, 25, 85, 66, 1 };

		int min = a[0];

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println(min);

	}

}
