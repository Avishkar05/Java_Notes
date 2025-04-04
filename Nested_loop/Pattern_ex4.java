package Nested_loop;
/*
  
  	   *
 	  ***	
 	 *****
    *******
    
   r=4
   c=7

*/
public class Pattern_ex4 {

	public static void main(String[] args) {
		
		
		/*
		//ChatGPT code 
		
		int n=5;
		// Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
		*/
		
		
		//My Code
		

		int n=5;
		for (int i = 1; i <= n; i++) {

			// column
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {
				System.out.print("* ");

			}
			System.out.println();

		}
	}

}
