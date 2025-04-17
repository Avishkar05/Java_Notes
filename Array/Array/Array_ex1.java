package Array;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5};
		
		//Normal method
		System.out.println("Normal Method");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		//Using loops
		System.out.println("\nUsing for loop method");
		System.out.println("Index	value");
		for(int i=0;i<5;i++)
		{
			System.out.println(i + "	" + a[i]);
		}

	}

}
