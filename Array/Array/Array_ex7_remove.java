package Array;

public class Array_ex7_remove {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		int ele=3;
		int cnt=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
		}
		
		if(cnt==0)
		{
			System.out.println("Not Found");
		}
		
		if(cnt>0)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=ele)
				{
					System.out.println(a[i]);
				}
			}
		}
		
		
		
	}

}
