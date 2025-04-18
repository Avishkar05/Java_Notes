package Queue;

import java.util.PriorityQueue;

public class Queue_count_of_digit {

	public static void main(String[] args) {

		PriorityQueue<Integer> ar= new PriorityQueue<Integer>();
		int num= 1234;
		while (num !=0) {
			ar.add(num % 10);
			num /= 10;
		}
		System.out.println("count of element is :"+ar.size());
	}

}