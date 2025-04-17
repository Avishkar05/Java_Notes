package Array;

public class Array_EX12_Remove {

	public static void main(String[] args) {

		int a[] = { 1, 2, 1, 3, 4, 3, 5 };
		int cnt12 = 0;

		for (int i = 1; i < a.length; i++) 
		{
			for (int j = 1; j < i; j++) 
			{
				if (a[i] == a[j]) 
				{
					cnt12++;
				}
			}
			if (cnt12 == 0)
			{
				System.out.println(a[i]);
				cnt12++;
			}
		}
		System.out.println("count = "+ cnt12);
		
		int b[] = new int[cnt12];
		System.out.println(b.length);
		int index=0;
		for (int i = 1; i < a.length; i++) 
		{
			int cnt122=0;
			for (int j = 1; j < i; j++) 
			{
				if (b[i] == b[j]) 
				{
					cnt122++;
				}
			}
			if (cnt122 == 0)
			{
				System.out.println(b[i]);
				cnt122++;
			}
		}
		
	}

}
