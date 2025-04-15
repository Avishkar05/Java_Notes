package Practice;
/*

	*******
	 *****
	  ***
	   *

*/
public class patttern_ex8 {

	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}	
			for(int l=n-1;l>=i;l--) 
			{
				System.out.print("*");				
			}
			System.out.println();
		}
		
		/*
		 * for(int i=1;i<=n;i++) { for(int j=1;j<=i;j++) { System.out.print(" "); }
		 * for(int k=n;k>=i;k--) { System.out.print("*"); } for(int l=n-1;l>=i;l--) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * for(int i=2;i<=n;i++) { for(int j=n;j>=i;j--) { System.out.print(" "); }
		 * 
		 * for(int k=1;k<=i;k++) { System.out.print("*"); }
		 * 
		 * for(int l=i-1;l>=1;l--) { System.out.print("*"); } System.out.println();
		 */
	}

}
