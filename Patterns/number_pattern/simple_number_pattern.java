package number_pattern;
/*
	1
	12
	123
	1234
	12345
	
*/
public class simple_number_pattern {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				//System.out.print(i+ " ");
				/*
				 * 1
				 * 22
				 * 333
				 * 4444
				 * 55555
				 * 
				 */
				System.out.print(j+ " ");

			}
			System.out.println();
		}

	}

}
