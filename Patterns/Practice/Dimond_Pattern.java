package Practice;
/*
	    *   
	   * *  
      *   * 
     *     *
      *   * 
       * *  
        * 
*/
public class Dimond_Pattern {

	public static void main(String[] args) {
		
		int  n=7;
		
		int mid=n/2+1;
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i+j==mid+1 || i-j==n/2 || j-i == n / 2 || i+ j ==n+mid)
				{
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
