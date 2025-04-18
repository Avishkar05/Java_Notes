package Linked_List;

import java.util.*;
//import java.util.Iterator;
//import java.util.LinkedList;

public class LinkedList_Cursor_ex4 {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add("Ketan");
		list.add("Avishkar");
		list.add("Onkar");
		list.add("Vilas");
		list.add("Sahil");
		list.add("Rohan");
		System.out.println("Orgiginal List :"+list);

		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) 
		{
			Object s = itr.next();
			if(s.equals("Avishkar")) 
			{
				itr.remove();
			}
			
		}
		
		System.out.println("Updated List :"+list);

	}

}
