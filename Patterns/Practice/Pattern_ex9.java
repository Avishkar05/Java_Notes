package Practice;
/*

 		*****
 	   *****
 	  *****
 	 *****
 	*****

*/
public class Pattern_ex9 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++)
			{				
				System.out.print("*");
			}
			System.out.println();		
		}
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*");
				
			}
			System.out.println();		
		}

	}

}
