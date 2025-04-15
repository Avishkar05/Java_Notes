package Star_pattern;
/*

	   *
	  **
	 ***
	****
	
*/

public class Invertedhalf_108deg {

	public static void main(String[] args) {

		int r=4;
		
		for(int i=1;i<=r;i++)
		{
			
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
