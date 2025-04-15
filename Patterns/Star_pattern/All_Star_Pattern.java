package Star_pattern;

public class All_Star_Pattern {

	public static void main(String[] args) {
		int n=5;
		
		System.out.println("--------------- Pattern 1 ---------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------- Pattern 2 ---------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 3 ---------------");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 4 ---------------");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 5 ---------------");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 6 ---------------");
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern _ ---------------");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==3 || j==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

		System.out.println("--------------- Pattern _ ---------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==3 || (j>=4 && i==1) || (j<=3 && i==5) || (i>=1 && i<=3 && j==1) || (i>=4 && j==5))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		

	}

}
