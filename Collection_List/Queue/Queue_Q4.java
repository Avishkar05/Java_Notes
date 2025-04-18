/*
 * 4. Write a Java program that demonstrates basic operations of a queue using the LinkedList 
 * 	  implementation. The program should: Create a queue of integers. Add three specific 
 * 	  integers (5, 10, and 15) to the queue. Implement a method myCode that:	
 * 	  Removes the front element from the queue (following FIFO order).Prints the dequeued 
 * 	  element. Displays the remaining elements in the queue after the dequeue operation.
 *	  Expected output: 		Dequeued: 5, Remaining Queue: [10, 15] 
 */

package Queue;

import java.util.*;

public class Queue_Q4 {

	public static void main(String[] args) {

		Queue<Integer> Q4 = new LinkedList<Integer>();
		Q4.add(5);
		Q4.add(10);
		Q4.add(15);
		
		System.out.println("Original : "+Q4);
		System.out.println("Dequed : "+Q4.poll());
		System.out.println("Remaining : "+Q4);
	}

}
