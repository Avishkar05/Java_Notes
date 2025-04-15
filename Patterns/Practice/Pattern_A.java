package Practice;
/*

		*    
	   * *   
	  *****  
	 *     * 
	*       *

*/
public class Pattern_A {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j==6 || i+4==j || (i==3 && j>=3 && j<=7))
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
	}

}
