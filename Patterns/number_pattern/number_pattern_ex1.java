package number_pattern;
/*
	1
	12
	123
	1234
	12345
	
	1
	22
	333
	4444
	55555
	
	
	1
	21
	321
	4321
	54321
*/
public class number_pattern_ex1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
