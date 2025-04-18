package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("Orgiginal List :"+list);

		ListIterator<Object> itr = list.listIterator();
		while (itr.hasNext()) 
		{
			Object s = itr.next();
			if(s.equals(40)) 
			{
				itr.set(100);
			}
			
		}
		
		System.out.println("Updated List :"+list);

	}

}
