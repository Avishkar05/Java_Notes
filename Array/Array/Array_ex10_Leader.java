package Array;

public class Array_ex10_Leader {

	public static void main(String[] args) {

		int a[] = { 100, 12, 20, 4, 15 };
		for (int i = 0; i < a.length; i++) 
		{
			int cnt10=0;
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] <= a[j])
				{
					
					cnt10++;
					break;
				}
			}
			if(cnt10==0)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
