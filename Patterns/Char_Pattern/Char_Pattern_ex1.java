package Char_Pattern;

/*
 * ASCII Value : 
 * 
 * A=65.......Z=91;
 * a=97.......z=122;
 * 
 */

public class Char_Pattern_ex1 {

	public static void main(String[] args) {

		System.out.println("--------------- Pattern 1 ---------------");
		for (char i = 65; i <= 69; i++) 
		{
			for (char j = 65; j <= i; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 1.1 ---------------");
		for (char i = 69; i >= 65; i--) 
		{
			for (char j = 69; j >= i; j--) 
			{
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("--------------- Pattern 2 ---------------");
		for (char i = 65; i <= 69; i++) 
		{
			for (char j = 65; j <= i; j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 3 ---------------");
		for (char i = 69; i <= 73; i++) 
		{
			for (char j = 69; j <= i; j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 4 ---------------");
		char cnt=65;
		for (char i = 65; i <= 69; i++) 
		{
			for (char j = 65; j <= i; j++) 
			{
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 4.1 ---------------");
		char cnt1=65;
		for (int i = 1; i <= 5; i++) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(cnt1);
				cnt1+=2;
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 5 ---------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
				{					
					System.out.print('A');
				}
				else
				{
					System.out.print('B');					
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------- Pattern 6 ---------------");
		for(char i=65;i<=73;i++)
		{
			for(char j=65;j<=i;j++)
			{
				if(i%2!=0)
				{					
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}

}
