package number_pattern;
/*
	
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	
*/
public class floyd_triangle {

	public static void main(String[] args) {
		
		int r=5;
		int n=1;
		
		for(int i=1;i<=r;i++)
		{
			//System.out.print(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print(n+" ");
				//System.out.print(j);
				n++;
			}
			System.out.println();
		}
		
	}

}
