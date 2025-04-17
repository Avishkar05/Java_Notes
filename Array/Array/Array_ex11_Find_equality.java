package Array;

public class Array_ex11_Find_equality {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,7,8};
		int count=0;
		if(a.length==b.length)
		{
			for(int i=1; i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					count++;
					break;
				}
			}
				if(count==0)
				{
					System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}

		}
		else
		{
			System.out.println("both array not equal");
		}


	}

}
