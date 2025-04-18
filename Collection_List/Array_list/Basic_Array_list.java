package Array_list;

import java.util.ArrayList;
//import java.util.*;

public class Basic_Array_list {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		ArrayList<Object> list1 = new ArrayList<Object>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		System.out.println(list);
		
		list.add(4, 45);
		System.out.println(list);
		
		list.addFirst("HefShine");
		list.addLast("Java");
		System.out.println(list);
		
		list1.addAll(list);
		list1.addAll(2,list);
		
		System.out.println(list1);
		
	}

}
