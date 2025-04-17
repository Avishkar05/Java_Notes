package Multidimensional_Array;

public class Multidimensional_Array_ex4_reverse3 {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60};
		int temp=a[a.length-1];
		int temp1=a[a.length-2];
		
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		a[1]=temp1;
		
		for(int s:a)
		{
			System.out.print(s + " ");
		}
		
	}

}
