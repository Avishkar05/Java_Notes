package Star_pattern;
/*

   *****
   *****
   *****
   *****

*/
public class simple_ex1 {

	public static void main(String[] args) {

		int r=5;
		int c=5;
		
		//outer loop and use to print row
		for(int i=1;i<=r;i++)
		{
			//inner loop and use to print column
			for(int j=1; j<=c;j++)
			{
				
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
