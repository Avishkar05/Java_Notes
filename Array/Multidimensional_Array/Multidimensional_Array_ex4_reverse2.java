package Multidimensional_Array;

public class Multidimensional_Array_ex4_reverse2 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int temp = a[2];
		
		for(int i=1;i<a.length;i++)
		{
			a[i]=a[i];
			
		}
		a[a.length-1]=temp;
		
		System.out.println("move first element in last : ");
		for(int s : a)
		{
			System.out.print(s + " ");
		}
		
		System.out.println("\nmove last element in first : ");
		int b[]= {10,20,30,40,50};
		int temp1=b[b.length-1];
		
		for(int i=b.length-1;i>0;i--)
		{
			b[i]=b[i-1];
		}
		b[0]=temp1;
		
		for(int f:b)
		{
			System.out.print(f+" ");
		}
	}

}
