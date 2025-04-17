package Multidimensional_Array;

public class Multidimensional_Array_ex5_largest {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50,60};
		int largest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest =a[i];
				
			}
		}
		System.out.println("Largest Elements : ");
		System.out.println(largest);
	}

}
