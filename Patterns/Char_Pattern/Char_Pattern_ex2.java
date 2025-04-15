package Char_Pattern;
/*
 
  A
  AB
  ABC
  ABCD
  ABCDE
  ABCD
  ABC
  AB
  A

 
*/
public class Char_Pattern_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char i=65;i<=69;i++)
		{
			for(char j=65;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		for(char i=69;i>=65;i--)
		{
			for(char j=65;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
