package Star_pattern;
/*

	*****
	 *****
	  *****
	   *****
	    *****
	    
*/
public class Pattern_ex2 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1+1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
