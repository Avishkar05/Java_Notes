package Char_Pattern;
/*
 	
 	EFGHI
  	 KJKL
  	  LMN
   	   NO
    	O

*/
public class Char_Pattern_ex5 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1,ch5='E';i<=n;i++,ch5--)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)ch5++);
			}
			System.out.println();
		}
		
		
		
		/*
		System.out.println("EFGHI");
		System.out.println(" IJKL");
		System.out.println("  LMN");
		System.out.println("   NO");
		System.out.println("    O");
		*/
	}

}
