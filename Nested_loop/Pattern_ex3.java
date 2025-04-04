package Nested_loop;
/*

    *
   **
  ***
 ****
*****

*/
public class Pattern_ex3 {

	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
