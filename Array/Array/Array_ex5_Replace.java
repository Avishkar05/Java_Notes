package Array;

public class Array_ex5_Replace {

	public static void main(String[] args) {
		
		int a[] = {1,0,1,0,1,0,1,0,1};
		
		System.out.println("Before Change");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		
		System.out.println("After Change");
		for(int i=0;i<a.length;i++)
		{			
			System.out.println(a[i]);
		}

	}
}
