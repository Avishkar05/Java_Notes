package number_pattern;

public class Numbers_Patterns {

	public static void main(String[] args) {
		
		for(int i=9;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println("----------------");
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(j-i<=0)
				{					
					System.out.print(10-i);
				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		

		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
//			for(int j=1;j<=9;j++)
			{
				System.out.print(10-i);
//				if(j-i<=0)
//				{					
//					System.out.print(10-j);
//				}
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		

	}

}
