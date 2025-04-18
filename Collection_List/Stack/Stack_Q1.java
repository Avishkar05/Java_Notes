package Stack;

import java.util.*;

public class Stack_Q1 {

	public static void main(String[] args) {
		
//		WAP to retrive element one by one in sequence
		Stack<Integer> Q1 = new Stack<Integer>();
		
		Q1.push(10);
		Q1.push(20);
		Q1.push(30);
		Q1.push(40);
		Q1.push(50);
		
		
//		Enumeration ele = Q1.elements();
//		
//		while (ele.hasMoreElements()) {
//			System.out.println(ele.nextElement());
//		}
		
		
		Iterator<Integer> iterator = Q1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        ListIterator<Integer> listIterator = Q1.listIterator();
//        while (listIterator.hasNext()) {
//            System.out.println(listIterator.next());
//        }
		
		
	}

}
