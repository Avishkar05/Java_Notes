package Nested_loop;

/*
 Pattern
*
**
***
****
*****

*/
public class Pattern_ex1 {

	public static void main(String[] args) {

		// Number of rows
		int n = 5;

		// rows
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

		System.out.println("\n");
		// rows
		for (int i = n; i >= 1; i--) {
			
			// column
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		System.out.println("\n");
		for (int i = 1; i <=n; i++) {
			
			// column
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
				
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		

	}

}
