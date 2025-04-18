package Queue;

import java.util.*;

public class Queue_basics {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();
		p1.add(200);
		p1.add(34);
		p1.add(34);
		p1.add(25); 
		p1.add(120);
		p1.add(1);
		p1.add(3);
		p1.add(22);
		p1.add(89);
		
		System.out.println(p1);
	}

}
