package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Q2 {

	public static void main(String[] args) {
		
//		Integer[] p1 = {10,20};
//		Integer[] p2 = {30,40,50};
		
		
		
		Queue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(10);
		p1.add(20);
		
		Queue<Integer> p2 = new PriorityQueue<Integer>();
		p2.add(30);
		p2.add(40);
		p2.add(50);

		Queue<Integer> p3 = new PriorityQueue<Integer>();
		for (Integer s : p1) {
			p3.add(s);
		}
		for (Integer s1 : p2) {
			p3.add(s1);
		}
		
		
		System.out.println(p3);

	}

}
