/* 5.
 * In a bank, customers are served at a single teller counter on a first-come, first-served 
 * basis. Write a program to:Add customers to a queue as they arrive at the bank. Serve (remove)
 * the first customer in the queue. Display the name of the served customer and the remaining 
 * customers in the queue.
 * Input: 	arriveAtBank("David") 
 * 			arriveAtBank("Laura") 
 * 			arriveAtBank("Tom") 
 * 			serveCustomer()
 * Output: "David" (first customer served)
 * 			Remaining Queue: [ "Laura", "Tom"]
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Q5 {

	public static void main(String[] args) {
		Queue<String> Q5 = new LinkedList<String>();
		Q5.add("David");
		Q5.add("Laura");
		Q5.add("Tom");

		System.out.println("Original : "+Q5);
		System.out.println("Dequed : "+Q5.poll());
		System.out.println("Remaining : "+Q5);
	}

}
