package Char_Pattern;
/*
	     A
     	ABC
       ABCDE
   	  ABCDEFG
  	 ABCDEFGHI
 	ABCDEFGHIJK


*/
public class Char_Pattern_ex4 {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<=n;i++)
		{
			char ch = 'A';
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch++);
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++);
			}	
		System.out.println();
		}
		
		
		
		

	}

}
