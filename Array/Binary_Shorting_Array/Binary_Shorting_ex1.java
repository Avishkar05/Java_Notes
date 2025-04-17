package Binary_Shorting_Array;

import java.util.Scanner;

public class Binary_Shorting_ex1 {

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55,66,44,21,98};
		int start1=0;
		int end1=a.length-1;
		int mid = (start1+end1)/2;
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the element to search in array :");
		int ele1=sc1.nextInt();
		
		while(start1<=end1)
		{
			if(a[mid]==ele1)
			{
				System.out.println("index : "+mid);
				break;
			}
			if(ele1>a[mid])
			{
				start1 = mid +1;
			}
			if (ele1<a[mid])
			{
				end1 = mid -1;
			}
			
		}
		
		System.out.println("Element not found!!!");

	}

}
