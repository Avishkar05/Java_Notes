package Binary_Shorting_Array;

public class Binary_Shorting_Array_basic {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		
		int start =0;
		int end = a.length-1;
		int mid;
		int ele=4;
		
		
		while(start<=end)
		{
			mid = (start+end)/2;
			if(a[mid]==ele)
			{
				System.out.println("The given number "+ele+" is found at index : "+mid);
				break;
			}
			else if(ele>a[mid])
			{
				start = mid +1;
			}
			else if (ele<a[mid])
			{
				end = mid -1;
			}
			else
			{				
				System.out.println("The given number "+ele+" is not found at index : ");
			}
			
		}
		
	}

}
