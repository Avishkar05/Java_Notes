package Linked_List;

import java.util.*;

public class LinkedList_Cursor_ex1 {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add(10);
		list.add("Java");
		list.add(125.5);

		System.out.println(list);

		Iterator itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}
		
		

	}

}
