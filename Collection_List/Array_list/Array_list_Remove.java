package Array_list;

import java.util.ArrayList;

public class Array_list_Remove {

	public static void main(String[] args) {
		ArrayList<Object> fruit1 = new ArrayList<Object>();

		fruit1.add("mango");
		fruit1.add("Watermelon");
		fruit1.add("Apple");
		fruit1.add("Grapes");
	
//		fruit1.remove(1);
//		System.out.println(fruit1);

		String ele="mango";
		for(int i=0;i<=fruit1.size()-1;i++)
		{
			if(ele!=fruit1.get(i))
			{
				System.out.println(fruit1.get(i));
			}
			
		}
	}

}
