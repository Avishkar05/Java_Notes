package number_pattern;

public class All_Number_Patterns {

	public static void main(String[] args) {
		
		System.out.println("============ Pattern 1 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 2 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 3 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 4 ============");
		for(int i=5;i>=1;i--)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 5 ============");
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 6 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 7 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		for(int i=5-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		

		System.out.println("============ Pattern 8 ============");
		int num=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		System.out.println();
		

		System.out.println("============ Pattern 9 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print((i+j)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
//		incomplete
		System.out.println("============ Pattern 10 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		for(int i=4-1;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+j);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 11 ============");
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 12 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 13 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==3 || j==3)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("o");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 14 ============");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print("X");
				}
				else
				{
					System.out.print("o");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("============ Pattern 15 ============");
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
