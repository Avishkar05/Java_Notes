package Array;

public class Array_ex9_original {

	public static void main(String[] args) {

		int a[] = { 1, 2, 1 };

		for (int i = 1; i < a.length; i++)
		{
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					cnt++;
				}
			}
			if (cnt == 0)
			{
				System.out.println(a[i] + " " + i);
			}
		}
		
		System.out.println("-------------- 2nd Way-----------------");
		
		int b[] = {1,2,1,3,2,5};

		for(int i=0;i<b.length;i++) 
			//i=0 -> 1
			//i=1 -> 2
			//i=2 -> 1
		{
			int cnt=0;
			for(int j=0;j<i;j++)
				//j=0 -> 1  j<i F
				//j=0 -> 1	j<i(1<2) T  j<i(2<2) F
				//j=0 -> 1  j<i(1<2) T  j<i(2<2) F
				
			{
				if(b[i] == b[j])
					//b[i]==a[j] -> 2==1 f
				{
					cnt++;
					//b[i]=1 -> cnt=0;
					
				}
			}
			
			if(cnt == 0)
			{
				//b[i]=1
				System.out.println(b[i] + " " + i);
			}
		}
	}

}
