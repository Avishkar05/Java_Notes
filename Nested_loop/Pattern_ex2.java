package Nested_loop;
/*

*****
****
***
**
*
*

*/
public class Pattern_ex2 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = n; i >= 1; i--) {

			// column
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
