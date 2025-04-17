package Array;

public class Array_ex8_Max {

	public static void main(String[] args) {
		
		int a[] = {15,56,9,6,25,85,66,1};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
		}
		
		System.out.println(max);

	}

}
