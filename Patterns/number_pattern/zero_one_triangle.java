package number_pattern;
/*

	1
	01
	101
	0101
	10101
	
*/

public class zero_one_triangle {

	public static void main(String[] args) {
		
		
		int r=5;
		
		for(int i=0;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int sum = i + j;
				if(sum % 2 == 0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
					
				//System.out.print(j);
			}
			System.out.println();
		}

	}

}
