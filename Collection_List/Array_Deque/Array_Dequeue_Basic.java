package Array_Deque;

import java.util.*;

public class Array_Dequeue_Basic {

	public static void main(String[] args) {

		ArrayDeque<Integer> ex1 = new ArrayDeque<Integer>();
		ex1.add(23);
		ex1.add(45);
		ex1.add(2);
		ex1.add(21);
		System.out.println(ex1);
		
		ex1.addFirst(200);		//Add 200 
		System.out.println("200 added in first index :\n"+ex1);
		ex1.addLast(300);
		System.out.println(ex1);
		
		
		ex1.peekFirst();
		System.out.println(ex1);
		ex1.peekLast();
		System.out.println(ex1);
		
		
		
		ex1.pollFirst();
		System.out.println(ex1);
		ex1.pollLast();
		System.out.println(ex1);
		
		
		ex1.removeFirst();
		System.out.println(ex1);
		ex1.removeLast();
		System.out.println(ex1);
		
		
		
		System.out.println(ex1.getFirst());
		System.out.println(ex1.getLast());
		
		
	}

}
