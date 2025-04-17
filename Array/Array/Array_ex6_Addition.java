package Array;

public class Array_ex6_Addition {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {4,3,2,1};
		
		int c[]=new int [a.length];
		
		
		System.out.println("Before Addition : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" "+b[i]);
		}
		
		
		System.out.println("After Addition using Array : ");
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
		
		
		int c1=0;
		System.out.println("After Addition using Primitive Data Type : ");
		for(int i=0;i<a.length;i++)
		{
			c1=a[i]+b[i];
			System.out.println(c1);
		}
		System.out.println(c1);

	}

}
