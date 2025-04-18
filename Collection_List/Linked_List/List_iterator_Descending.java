package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_iterator_Descending {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println("Orgiginal List :"+list);

		Iterator<Object> itr = list.descendingIterator();
		
		System.out.print("descending List :");
		
		while (itr.hasNext()) {			
			System.out.print(itr.next()+" ");
		}

	}

}
