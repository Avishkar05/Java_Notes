package Linked_List;

import java.util.*;
//import java.util.Iterator;
//import java.util.LinkedList;

public class LinkedList_Cursor_ex3 {

	public static void main(String[] args) {

		LinkedList<Object> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(59);
		list.add(125.5);
		System.out.println("Orgiginal List :"+list);

		Iterator<Object> itr = list.iterator();
		while (itr.hasNext()) 
		{
			Object s = itr.next();
			if(s.equals(30)) 
			{
				itr.remove();
			}
			
		}
		
		System.out.println("Updated List :"+list);

	}

}
