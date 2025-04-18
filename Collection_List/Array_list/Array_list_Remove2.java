package Array_list;

import java.util.ArrayList;

public class Array_list_Remove2 {

	public static void main(String[] args) {
		
		ArrayList<String> fruit2 = new ArrayList<>();

		fruit2.add("mango");
		fruit2.add("mango");
		fruit2.add("Watermelon");
		fruit2.add("Apple");
		fruit2.add("Apple");
		fruit2.add("Grapes");
		
		ArrayList<Object> unique = new ArrayList<Object>();
		
//		for(int i=0; i<=fruit2.size()-1; i++)
//		{
//			if(!unique.contains(fruit2.get(i)))
//			{
//				unique.add(fruit2.get(i));
//			}
//		}
		
		for (String s:fruit2) 
		{
			if(!unique.contains(s))
			{
				unique.add(s);
			}
		}
		
		
		System.out.println("After remove :"+unique);
		
		        
       
  
		
		
	}

}
