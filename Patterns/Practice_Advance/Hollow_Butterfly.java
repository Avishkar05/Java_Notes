package Practice_Advance;

public class Hollow_Butterfly {

	public static void main(String[] args) {

		int n = 10;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ( j==1 || j==n || i==j || i==n-j+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
