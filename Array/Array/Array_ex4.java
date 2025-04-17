package Array;

public class Array_ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		System.out.println("A Array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[]=new int [a.length]; 
		
		for(int i=0;i<a.length;i++)
		{
			b[i] = a[i];
		}
		
		System.out.println("B Array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}  
	}

}
